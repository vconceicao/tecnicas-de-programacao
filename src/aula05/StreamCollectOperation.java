package aula05;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.KeyPair;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
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



            System.out.println("Funcionarios sexo masculino vs sexo Feminino");
            Map<Boolean, List<Funcionario>> mapaFuncionariosParticionado = listaDeFuncionarios.stream()
                    .collect(Collectors
                            .partitioningBy(e -> e.getSexo().equals("M")));

            System.out.println(mapaFuncionariosParticionado);


            System.out.println("Trazer um mapa de modo que a chave seja um id e o valor um object contendo nome e sexo");
            Map<Integer, Par> mapaParDeObjeto =
                    listaDeFuncionarios.stream()
                            .collect(Collectors.toMap(e -> e.getId(), e -> new Par(e.getNome(), e.getCargo())));

            System.out.println(mapaParDeObjeto);

            //pegando o valor de um par
            //Object nome = (String) mapaParDeObjeto.get(27833).getValor1();
            //System.out.println(nome);

            System.out.println("Uma string com o nome de todos os funcionarios separados por virgula");
            String funcionariosString = listaDeFuncionarios
                    .stream()
                    .map(e -> e.getNome())
                    .collect(Collectors.joining(", "));

            System.out.println(Arrays.toString(funcionariosString.split(", ")));

            System.out.println("Um mapa que contem a soma de salarios por cargo");
            Map<String, Double> mapaSomaPorCargo = listaDeFuncionarios
                    .stream()
                    .collect(Collectors.groupingBy(e -> e.getCargo(), Collectors.summingDouble(e -> e.getSalario())));


            System.out.println(mapaSomaPorCargo);

            System.out.println("Um mapa que contem o maior salario por cargo");
            Map<String, Optional<Funcionario>> mapaMaiorSalarioPorCargo = listaDeFuncionarios
                    .stream()
                    .collect(Collectors
                            .groupingBy(e -> e.getCargo(),
                                    Collectors.maxBy(Comparator.comparing(e -> e.getSalario()))));

            System.out.println(mapaMaiorSalarioPorCargo.get("Architect").get());



        } catch (IOException e) {

        e.printStackTrace();
        }


    }
}
