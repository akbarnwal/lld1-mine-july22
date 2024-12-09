package in.anilbarnwal.lld1minejuly22.lld2.adapter;

public class PhonePe {
    private BankApi bankApi = new YesBankAdapter();

    public void sendMoney(String from, String to, int amount) {
        bankApi.sendMoney(from, to, amount);
    }
}
