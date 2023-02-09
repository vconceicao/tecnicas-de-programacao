package aula06;

import aula05.Funcionario;

import java.time.LocalDate;
import java.time.Month;
import java.util.Optional;

public class TesteOptionalOrElse {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(1,
                "Teste",
                "M",
                LocalDate.of(2000, Month.JANUARY, 01),
                "RJ",
                "dev",
                LocalDate.of(2022, Month.DECEMBER, 10),
                2000d);




        Optional<Funcionario> funcionario1 = Optional.ofNullable(funcionario);

        //System.out.println(funcionario1.orElse(new Funcionario()));
        //System.out.println(funcionario1.orElseGet(() -> new Funcionario()));

        //isPresent + get() -> interessante para impressao de valores
        //funcionario1.ifPresent(f -> System.out.println(f));

        //verificar valores do objeto dentro do optional
        //System.out.println(funcionario1.filter(f -> f.getNome().equals("Teste")));

        //extrair valor
        String nomeDoFuncionario = funcionario1.map(f -> f.getNome()).get();
        Optional<String> nomeOptional = funcionario1.map(f -> f.getNome());
        System.out.println(nomeOptional.get());
        System.out.println(nomeDoFuncionario);

    }
}
