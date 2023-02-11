package aula07;

import aula05.Funcionario;

import javax.swing.*;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class TarefaConsultaPorNome implements Runnable{

    private int nomeThread;
    private String nomeBusca;

    public TarefaConsultaPorNome(int nomeThread,String nomeBusca) {
        this.nomeThread = nomeThread;
        this.nomeBusca = nomeBusca;
    }

    @Override
    public void run() {

        buscaPorNome(nomeThread, nomeBusca);

    }

    private static void buscaPorNome(int nomeThread, String nomeBusca) {
        Optional<List<Funcionario>> listaFuncionarios = ArquivoUtils.getListaFuncionarios();

        simularLentidao();
        for (Funcionario funcionario : listaFuncionarios.get()) {

            if (funcionario.getNome().equals(nomeBusca)) {
//                System.out.println("##Resposta da Thread"+nomeThread+": Funcionario encontrado");
//                System.out.println(funcionario);
//                System.out.println();
                JOptionPane.showMessageDialog(null, funcionario.getNome(), "##Resposta da Thread"+nomeThread+": Funcionario encontrado", 1);
                return;
            }
        }
        //System.out.println("##Resposta da Thread"+nomeThread+" Funcionario nao encontrado");
        JOptionPane.showMessageDialog(null,"##Resposta da Thread"+nomeThread+" Funcionario nao encontrado");
    }

    private static void simularLentidao() {
        try {
            int randomico = new Random().nextInt(5,10);
            Thread.sleep(randomico* 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
