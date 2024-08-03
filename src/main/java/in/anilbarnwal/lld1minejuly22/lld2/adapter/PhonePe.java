package in.anilbarnwal.lld1minejuly22.lld2.adapter;

import in.anilbarnwal.lld1minejuly22.lld2.adapter.adapters.BankApi;
import in.anilbarnwal.lld1minejuly22.lld2.adapter.adapters.HDFCAdapter;
import in.anilbarnwal.lld1minejuly22.lld2.adapter.adapters.IciciBankAdapter;

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
