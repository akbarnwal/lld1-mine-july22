package in.anilbarnwal.lld1minejuly22.lld2.singleton.eager;

public class Client {
    public static void main(String[] args) {
        demoSingleton();
    }

    private static void demoSingleton() {
        DatabaseConnection databaseConnection1 = DatabaseConnection.getInstance();
        DatabaseConnection databaseConnection2 = DatabaseConnection.getInstance();
        DatabaseConnection databaseConnection3 = DatabaseConnection.getInstance();
        System.out.println(databaseConnection1);
        System.out.println(databaseConnection2);
        System.out.println(databaseConnection3);
    }
}
