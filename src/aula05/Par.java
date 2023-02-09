package aula05;

import java.util.StringJoiner;

public class Par<T, U> {

    private final T valor1;
    private final U valor2;

    public Par(T valor1, U valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public T getValor1() {
        return valor1;
    }

    public U getValor2() {
        return valor2;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Par.class.getSimpleName() + "[", "]")
                .add("valor1=" + valor1)
                .add("valor2=" + valor2)
                .toString();
    }
}
