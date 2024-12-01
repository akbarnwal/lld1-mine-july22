package in.anilbarnwal.lld1minejuly22.lld1.class7.addersubstractor;

public class Subtractor implements Runnable{
    private Count count;

    public Subtractor(Count count){
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++){
            count.setCount(count.getCount() - i);
            System.out.println("Subtractor thread: " +count.getCount() +"  "+ Thread.currentThread().getName());
        }
    }
}
