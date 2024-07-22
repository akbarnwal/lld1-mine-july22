package in.anilbarnwal.lld1minejuly22.lld2.singleton.lazy;

public class DatabaseConnection {
    //Lazy loading on demand object created but for single thread
    private static DatabaseConnection instance = null;
    private String url;
    private String userName;
    private String password;
    private DatabaseConnection() {}

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

}
