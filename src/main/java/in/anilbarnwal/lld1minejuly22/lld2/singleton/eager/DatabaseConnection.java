package in.anilbarnwal.lld1minejuly22.lld2.singleton.eager;

public class DatabaseConnection {
    private static final DatabaseConnection instance = new DatabaseConnection();
    private String url;
    private String username;
    private String password;

    private DatabaseConnection() {}

    public static DatabaseConnection getInstance() {
        return instance;
    }

}
