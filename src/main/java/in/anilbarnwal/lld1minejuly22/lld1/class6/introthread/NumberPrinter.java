package in.anilbarnwal.lld1minejuly22.lld1.class6.introthread;

public class NumberPrinter implements Runnable{
    private int number;

    public NumberPrinter(int number){
        this.number = number;
    }
    @Override
    public void run() {
        System.out.println("NumberPrinter number : " + number + "  " + Thread.currentThread().getName());
    }
}
