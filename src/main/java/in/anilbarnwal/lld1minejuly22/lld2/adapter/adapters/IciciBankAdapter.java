package in.anilbarnwal.lld1minejuly22.lld2.adapter.adapters;

import in.anilbarnwal.lld1minejuly22.lld2.adapter.thirdparties.IciciBank;

public class IciciBankAdapter implements BankApi{

    private IciciBank iciciBank = new IciciBank();
    @Override
    public void sendMoney(String from, String to, int amount) {
        iciciBank.transferMoney(from, to, amount);
    }

    @Override
    public void registerAccount(String accountNumber) {

    }

    @Override
    public void checkBalance(String accountNumber) {

    }
}
