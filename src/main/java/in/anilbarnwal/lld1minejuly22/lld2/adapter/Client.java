package in.anilbarnwal.lld1minejuly22.lld2.adapter;

public class Client {
    public static void main(String[] args) {

        demoAdapter();
    }

    private static void demoAdapter() {
        PhonePe phonePe = new PhonePe();
        String from = "158007775284";
        String to = "1234567890";
        int amount = 1000;
        phonePe.sendMoney(from, to, amount);
    }
}
