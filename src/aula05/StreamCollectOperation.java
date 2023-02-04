package aula05;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectOperation {

    public static final String CSV_SEPARATOR = ",";

    public static void main(String[] args) {
        Path path = Paths.get("funcionarios.csv");
        try (Stream<String> funcionarios = Files.lines(path)) {

            List<String> linhas = funcionarios.collect(Collectors.toList());
            List<Funcionario> listaDeFuncionarios = new ArrayList<>();

            for (String linha:
                 linhas) {

                String[] dados = linha.split(CSV_SEPARATOR);

                Integer id = Integer.parseInt(dados[0]);
                String nome = dados[1];
                String sexo = dados[2];
                LocalDate dataNascimento = LocalDate.parse(dados[3], DateTimeFormatter.ISO_LOCAL_DATE);
                String cidade = dados[4];
                String cargo = dados[5];
                LocalDate dataAdmissao = LocalDate.parse(dados[6], DateTimeFormatter.ISO_LOCAL_DATE);
                Double salario = Double.parseDouble(dados[7]);

                Funcionario funcionario = new Funcionario(id, nome, sexo, dataNascimento, cidade, cargo, dataAdmissao, salario);

                listaDeFuncionarios.add(funcionario);
            }


            System.out.println("Lista com nomes de funcionarios");
            List<String> nomesDeFuncionarios = listaDeFuncionarios.stream().map(Funcionario::getNome)
                    .collect(Collectors.toList());
            System.out.println(nomesDeFuncionarios);

            System.out.println("Mapa de nomes por id");
            Map<Integer, String> nomePorId =
                    listaDeFuncionarios.stream()
                    .collect(Collectors.toMap(e -> e.getId(), e -> e.getNome()));

            System.out.println(nomePorId);
            //System.out.println(nomePorId.get(27830));

            System.out.println("Funcionarios sexo masculino vs sexo Feminino");
            Map<Boolean, List<Funcionario>> mapaFuncionariosParticionado = listaDeFuncionarios.stream()
                    .collect(Collectors
                            .partitioningBy(e -> e.getSexo().equals("M")));

            System.out.println(mapaFuncionariosParticionado);


        } catch (IOException e) {

        e.printStackTrace();
        }


    }
}
