package in.anilbarnwal.lld1minejuly22.lld2.adapter;

import in.anilbarnwal.lld1minejuly22.lld2.adapter.adapters.BankApi;
import in.anilbarnwal.lld1minejuly22.lld2.adapter.adapters.HDFCAdapter;
import in.anilbarnwal.lld1minejuly22.lld2.adapter.adapters.IciciBankAdapter;

public class Client {
    public static void main(String[] args) {
        demoAdapter();
    }

    private static void demoAdapter() {
        PhonePe phonePe = new PhonePe();

        String from = "1234567897";
        String to = "876543219";
        int amount = 1000; //it will be considered like 10.00

        phonePe.transfer(from, to, amount);
    }
}
