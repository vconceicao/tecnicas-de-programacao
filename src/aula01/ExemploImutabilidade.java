package aula01;

public class ExemploImutabilidade {

    public static void main(String[] args) {

        //A classe String e imutavel
        String str ="hello";
        str.concat("abc"); //ao chamar o metodo concat, o resultado nao afetara o valor da variavel str
        System.out.println(str);


        //A classe StringBuilder eh mutavel
        StringBuilder b = new StringBuilder("hello");
        b.append("abc");// ao chamar o metodo append, o resultado afetara o valor da variavel b
        System.out.println(b);

    }
}
