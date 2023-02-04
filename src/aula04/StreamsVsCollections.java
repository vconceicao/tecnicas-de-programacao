package aula04;

import java.util.List;
import java.util.stream.Stream;

public class StreamsVsCollections {

    public static void main(String[] args) {

        List<Integer> inteiros = List.of(1, 2, 3);

        //Não pode utilizar duas vezes dessa forma
        //Stream<Integer> stream = inteiros.stream();
        //stream.count();
        //stream.count();


        //Pode utilizar varias vezes dessa forma, pois a minha variavel é List
        System.out.println(inteiros.stream().count());
        inteiros.stream().forEach(n -> System.out.println(n));
    }
}
