package aula07;

import aula05.Funcionario;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

public class ConsultaNomes {

    public static void main(String[] args) {


        //recebe uma string nome
        //consulta na lista de funcionarios
        //imprime esse funcionario
        String nomeBusca = null;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Digite o nome do funcionario para consultar");
            nomeBusca = scanner.nextLine();

            if (nomeBusca.equals("1")) {
                System.exit(1);
            }

            buscaPorNome(nomeBusca);

        }


    }

    private static void buscaPorNome(String nomeBusca) {
        Optional<List<Funcionario>> listaFuncionarios = ArquivoUtils.getListaFuncionarios();

        simularLentidao();
        for (Funcionario funcionario : listaFuncionarios.get()) {

            if (funcionario.getNome().equals(nomeBusca)) {
                System.out.println("Funcionario encontrado");
                System.out.println(funcionario);
                return;
            }
        }
        System.out.println("Funcionario nao encontrado");
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
