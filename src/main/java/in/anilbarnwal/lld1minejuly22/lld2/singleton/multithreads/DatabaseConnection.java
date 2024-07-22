package in.anilbarnwal.lld1minejuly22.lld2.singleton.multithreads;

public class DatabaseConnection {
    private static DatabaseConnection instance = null;
    private DatabaseConnection() {}

    //Optimised solution - Best solution
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            System.out.println("After first null check" + Thread.currentThread().getName());
            //Double check lock
            synchronized(DatabaseConnection.class) {
                System.out.println("Before second null check" + Thread.currentThread().getName());
                if (instance == null) {
                    System.out.println("After second null check" + Thread.currentThread().getName());
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

}
