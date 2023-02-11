package aula07;

import aula05.Funcionario;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArquivoUtils {

    public static void main(String[] args) {


        Optional<List<Funcionario>> listaFuncionarios = getListaFuncionarios();
        System.out.println(listaFuncionarios);
    }

    public static Optional<List<Funcionario>> getListaFuncionarios() {
        Path path = Paths.get("funcionarios.csv");
        try {
            Stream<String> lines = Files.lines(path);
            List<String> collect = lines.collect(Collectors.toList());
            List<Funcionario> funcionarios = new ArrayList<>();

            for (String objeto : collect) {

                String[] array = objeto.split(",");

                Integer id = Integer.parseInt(array[0]);
                String nome = array[1];
                String sexo = array[2];
                LocalDate dataNascimento = LocalDate.parse(array[3], DateTimeFormatter.ISO_LOCAL_DATE);
                String cidade = array[4];
                String cargo = array[5];
                LocalDate dataAdmissao = LocalDate.parse(array[6], DateTimeFormatter.ISO_LOCAL_DATE);
                Double salario = Double.parseDouble(array[7]);
                Funcionario funcionario = new Funcionario(id, nome, sexo, dataNascimento, cidade, cargo, dataAdmissao, salario);
                funcionarios.add(funcionario);
            }

            return Optional.of(funcionarios);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Optional.empty();
    }


}
