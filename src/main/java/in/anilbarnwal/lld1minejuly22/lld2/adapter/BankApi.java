package in.anilbarnwal.lld1minejuly22.lld2.adapter;

public interface BankApi {
    void sendMoney(String from, String to, int amount);
    void registerUser(String accountNumber);
    void checkBalance(String accountNumber);
}
