package in.anilbarnwal.lld1minejuly22.lld2.singleton.multithreads;


public class SingletonObjectCreator implements Runnable{
    @Override
    public void run() {
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
        System.out.println(databaseConnection);
    }
}
