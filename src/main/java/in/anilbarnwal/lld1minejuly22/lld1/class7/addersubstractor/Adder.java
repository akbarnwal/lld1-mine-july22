package in.anilbarnwal.lld1minejuly22.lld1.class7.addersubstractor;

public class Adder implements Runnable{
    private Count count;
    public Adder(Count count){
        this.count = count;
    }
    @Override
    public void run() {
        for (int i = 0 ; i< 10000; i++){
            count.setCount(count.getCount() + i);
            System.out.println("Adder thread: " +count.getCount() +"  "+ Thread.currentThread().getName());
        }
    }
}
