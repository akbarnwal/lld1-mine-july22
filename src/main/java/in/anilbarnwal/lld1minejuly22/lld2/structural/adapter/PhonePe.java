package in.anilbarnwal.lld1minejuly22.lld2.structural.adapter;

import in.anilbarnwal.lld1minejuly22.lld2.structural.adapter.adapters.BankApi;
import in.anilbarnwal.lld1minejuly22.lld2.structural.adapter.adapters.IciciBankAdapter;

public class PhonePe {
    private BankApi bankApi = new IciciBankAdapter();

    void transfer(String from, String to, int amount) {
        bankApi.sendMoney(from, to, amount);
    }

    int getBalance(String accountNumber) {
        bankApi.checkBalance(accountNumber);
        return 0;
    }
}
