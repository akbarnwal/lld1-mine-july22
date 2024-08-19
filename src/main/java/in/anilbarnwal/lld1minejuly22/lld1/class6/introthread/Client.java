package in.anilbarnwal.lld1minejuly22.lld1.class6.introthread;

public class Client {
    public static void main(String[] args) {
//        demoHelloWorldPrinter();
        demoNumberPrinter();
    }

    private static void demoNumberPrinter() {
        for(int i =0; i < 100; i++){
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread thread = new Thread(numberPrinter);
            thread.start();
        }
    }

    private static void demoHelloWorldPrinter() {
        System.out.println("Main thread started - name : " + Thread.currentThread().getName());

        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread thread = new Thread(helloWorldPrinter);
        thread.start();
    }
}
