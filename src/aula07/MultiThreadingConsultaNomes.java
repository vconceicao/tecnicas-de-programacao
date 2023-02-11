package aula07;

import aula05.Funcionario;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

public class MultiThreadingConsultaNomes {


    public static void main(String[] args) {

        //recebe uma string nome
        //consulta na lista de funcionarios
        //imprime esse funcionario
        String nomeBusca = null;
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (true){
            System.out.println("Digite o nome do funcionario para consultar");
            nomeBusca = scanner.nextLine();

            if (nomeBusca.equals("1")) {
                System.exit(1);
            }


            TarefaConsultaPorNome tarefaConsultaPorNome = new TarefaConsultaPorNome(i, nomeBusca);
            Thread thread = new Thread(tarefaConsultaPorNome);
            thread.start();
            i++;


        }


    }


}
