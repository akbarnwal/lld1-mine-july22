package in.anilbarnwal.lld1minejuly22.lld1.class7.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        demoNumberPrinter();

        long endTime = System.nanoTime();

//        long duration = (endTime - startTime) / 1_000_000; // Convert to milliseconds
//        System.out.println("Time taken: " + duration + " ms");
//        System.out.println("End");
//
//        System.out.println("Start2");
//        demoNumberPrinter();
        System.out.println("End2");
    }

    private static void demoNumberPrinter() {

//        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executorService.execute(numberPrinter);
        }

        //Important
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
    }
}
