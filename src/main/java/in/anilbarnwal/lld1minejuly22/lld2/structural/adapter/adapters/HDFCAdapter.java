package in.anilbarnwal.lld1minejuly22.lld2.structural.adapter.adapters;

import in.anilbarnwal.lld1minejuly22.lld2.structural.adapter.thirdparties.HDFCBank;

public class HDFCAdapter implements BankApi{
    private HDFCBank hdfcBank = new HDFCBank();
    @Override
    public void sendMoney(String from, String to, int amount) {
        hdfcBank.send(from, to, amount);
    }

    @Override
    public void registerAccount(String accountNumber) {

    }

    @Override
    public void checkBalance(String accountNumber) {

    }
}
