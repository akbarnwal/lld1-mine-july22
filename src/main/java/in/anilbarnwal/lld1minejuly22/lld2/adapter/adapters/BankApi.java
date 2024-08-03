package in.anilbarnwal.lld1minejuly22.lld2.adapter.adapters;

public interface BankApi {
    void sendMoney(String from, String to, int amount);
    void registerAccount(String accountNumber);
    void checkBalance(String accountNumber);
}
