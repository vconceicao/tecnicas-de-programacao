package aula07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Future01 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();

        Future<?> future = service.submit(() -> System.out.println("Primeira thread"));
    }
}
