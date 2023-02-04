package aula04;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamOutrasOperacoes {

    public static void main(String[] args) {

        List<Integer> inteiros = List.of(7,2, 5, 6, 6);

        System.out.println("Imprindo a contagem de elementos");
        inteiros.stream().distinct().forEach(integer -> System.out.println(integer));

        System.out.println("Imprimindo elementos na ordem crescente");
        inteiros.stream().sorted().forEach(integer -> System.out.println(integer));

        System.out.println("Imprimindo elementos na ordem reversa");
        inteiros.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.println(n));

        System.out.println("Imprimir o maior elemento dessa lista");
        Optional<Integer> max = inteiros.stream()
                .max(Comparator.naturalOrder());
        System.out.println(max.get());

        System.out.println("Imprimir o menor elemento dessa lista");
        Optional<Integer> menor = inteiros.stream()
                .min(Comparator.naturalOrder());
        System.out.println(menor.get());

        System.out.println("Imprimir a soma dessa lista");
        Optional<Integer> soma = inteiros.stream()
                .reduce((n1, n2) -> n1 + n2);
        System.out.println(soma.get());



    }
}
