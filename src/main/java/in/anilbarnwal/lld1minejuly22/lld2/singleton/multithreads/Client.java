package in.anilbarnwal.lld1minejuly22.lld2.singleton.multithreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        demoMultithreaded();
    }

    private static void demoMultithreaded() {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            SingletonObjectCreator singletonObjectCreator = new SingletonObjectCreator(i);
            executorService.submit(singletonObjectCreator);
        }
        executorService.shutdown();
    }
}
