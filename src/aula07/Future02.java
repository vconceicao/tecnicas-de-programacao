package aula07;

import java.util.concurrent.*;

public class Future02 {


        private static boolean mensagemEnviada = false;

        public static void main(String[] a) throws ExecutionException, InterruptedException {

            ExecutorService service = Executors.newSingleThreadExecutor();

            Future<?> enviandoMensagem = service.submit(() -> {
                try {

                    Thread.sleep(5000); //2 segundos
                    mensagemEnviada = true;
                } catch (InterruptedException e) {
                    System.out.println("thread Interrompida!");
                }
            });

            try {
                System.out.println("Esperando pelo envio da mensagem");
                enviandoMensagem.get(5, TimeUnit.SECONDS);
                if (mensagemEnviada) {
                    System.out.println("Mensagem enviada!!");
                }
            } catch (TimeoutException e) {
                System.out.println("Tempo expirado");
            } finally {
                service.shutdown();
            }
        }
    }
