package in.anilbarnwal.lld1minejuly22.lld2.singleton.multithreads;

public class DatabaseConnection {
    private static DatabaseConnection instance = null;
    private DatabaseConnection() {}

    //Optimised solution - Best solution
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            //Double check lock
            synchronized(DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }
}
