package aula07;

public class MinhaTarefa implements Runnable {


    private String nome;

    public MinhaTarefa(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(this.nome + "# contador " + i);
        }
    }
}
