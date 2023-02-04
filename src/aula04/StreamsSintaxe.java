package aula04;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamsSintaxe {

    public static void main(String[] args) {
        //finita
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
        Stream<String> stringStream = Stream.of("casa");

        Stream<Object> empty = Stream.empty();

        Stream<Integer> stream = List.of(1, 2, 3).stream();

        //infinita
        //O iterate recebe uma interface UnaryOperator -> (BinaryOperator recebe dois elementos e retorna o terceiro do mesmo tipo)
        //que recebe um parametro do tipo Generico e retorno outro parametro do mesmo tipo.
        //Ex: Se recebe um Integer, retorna um Integer
        UnaryOperator<Integer> operator = n -> n * 2;
        Stream<Integer> streamInfinita = Stream.iterate(2, operator);

        //streamInfinita.limit(50).forEach(n -> System.out.println(n));

        //o metodo generate recebe uma interface funcional Supplier
        //a Supplier nao recebe nada e retorna um parametro generico
        Stream<Integer> streamRandomica = Stream.generate(() -> {
            Random random = new Random();
            return random.nextInt(100);
        });

        streamRandomica.limit(5).forEach(n -> System.out.println(n));


    }


}
