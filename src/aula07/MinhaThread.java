package aula07;

public class MinhaThread extends Thread{

    private String nome;

    public MinhaThread(String nome) {
        super.setName(nome);
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
