package aula06;

import aula05.Funcionario;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Optional;

public class TesteOptional {

    public static void main(String[] args) {

        //calcula a idade do funcionario
        //recebe um optional<funcionario>
        //retornar Optional<int>
        //retornar Optional.empty
        Funcionario funcionario = new Funcionario(1,
                "Teste",
                "M",
                LocalDate.of(2000, Month.JANUARY, 01),
                "RJ",
                "dev",
                LocalDate.of(2022, Month.DECEMBER, 10),
                2000d);

        Optional<Funcionario> funcionarioOptional = Optional.of(null);
        Optional<Integer> idadeFuncionario = calculaIdadeFuncionario(funcionarioOptional);
        System.out.println(idadeFuncionario);


    }

    private static Optional<Integer> calculaIdadeFuncionario(Optional<Funcionario> funcionarioOptional) {

        if (funcionarioOptional.isPresent()){
            Funcionario funcionario = funcionarioOptional.get();
            Period periodo = Period.between(funcionario.getDataNascimento(), LocalDate.now());
            return Optional.of(periodo.getYears());
        }
        return Optional.empty();

    }
}
