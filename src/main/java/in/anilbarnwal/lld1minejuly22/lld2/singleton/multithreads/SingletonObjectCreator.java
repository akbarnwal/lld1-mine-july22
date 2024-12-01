package in.anilbarnwal.lld1minejuly22.lld2.singleton.multithreads;


public class SingletonObjectCreator implements Runnable{
    public int count = 0;
    public SingletonObjectCreator(int i) {
        count = i + 1;
    }

    @Override
    public void run() {
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
        System.out.println("Count : " + count + " " + databaseConnection);
    }
}
