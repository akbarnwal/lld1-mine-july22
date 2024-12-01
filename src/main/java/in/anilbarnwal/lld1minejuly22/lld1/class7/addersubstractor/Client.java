package in.anilbarnwal.lld1minejuly22.lld1.class7.addersubstractor;

public class Client {
    public static void main(String[] args) {
        try {
            demoAdderSubtractor(); //subtractor
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void demoAdderSubtractor() throws InterruptedException {
        Count count = new Count();
        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        //Threads
        Thread adderThread = new Thread(adder);
        Thread substractorThread = new Thread(subtractor);

        //Start thread
        adderThread.start();
        substractorThread.start();

        //Wait to complete both the thread
        adderThread.join();
        substractorThread.join();

        System.out.println("Value: " + count.getCount());

    }
}
