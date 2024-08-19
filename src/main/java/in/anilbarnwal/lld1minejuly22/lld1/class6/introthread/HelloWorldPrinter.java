package in.anilbarnwal.lld1minejuly22.lld1.class6.introthread;

public class HelloWorldPrinter implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello world " + Thread.currentThread().getName());
    }
}
