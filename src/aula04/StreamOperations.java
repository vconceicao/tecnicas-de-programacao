package aula04;

import java.util.LinkedList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);

        integerStream.map(n -> n * 2).peek(n -> System.out.println("elemento antes do filter " + n))
                .filter(n -> n.equals(2))
                .forEach(n -> System.out.println("elemento chamado pelo forEach " + n));




    }
}
