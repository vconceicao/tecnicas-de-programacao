package aula05;

import java.util.List;
import java.util.stream.Stream;

public class FlatMapExemplo {

    public static void main(String[] args) {

        List<String> lista1 = List.of("casa", "carro");
        List<String> lista2 = List.of("aviao", "moto");

        Stream.of(lista1, lista2).
                flatMap(lista -> lista.stream())
                .forEach(s -> System.out.println(s));

        List<String> listaNova = Stream.of(lista1, lista2).
                flatMap(lista -> lista.stream())
                .toList();

        System.out.println(listaNova);


    }
}
