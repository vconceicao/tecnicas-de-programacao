package aula07;

public class ThreadDemonstracao2 {

    public static void main(String[] args) {


        MinhaTarefa minhaTarefa = new MinhaTarefa("###Thread1");
        Thread t1 = new Thread(minhaTarefa);
        t1.start();
        System.out.println("Thread main finalizada");
    }
}
