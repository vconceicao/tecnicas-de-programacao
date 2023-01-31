package aula03;

import java.util.function.BiFunction;

public class BiFunctionPractice {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> corpoDoMetodo = (num1, num2) -> num1 + num2;

        Integer resultado = corpoDoMetodo.apply(7, 7);

        System.out.println(resultado);


    }
}
