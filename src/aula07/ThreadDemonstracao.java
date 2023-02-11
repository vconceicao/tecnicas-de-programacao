package aula07;

public class ThreadDemonstracao {

    public static void main(String[] args) {
        System.out.println("Hello");
        MinhaThread t1 = new MinhaThread("Minha Thread");
        MinhaThread t2 = new MinhaThread("Outra Thread");
        MinhaThread t3 = new MinhaThread("###Thread###3");
        t1.start();
        t2.start();
        t3.start();

        System.out.println("Aplicacao finalizada");
    }
}
