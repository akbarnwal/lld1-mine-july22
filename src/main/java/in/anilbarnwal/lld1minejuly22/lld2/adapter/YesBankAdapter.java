package in.anilbarnwal.lld1minejuly22.lld2.adapter;


import in.anilbarnwal.lld1minejuly22.lld2.adapter.thirdparty.yesbank.YesBank;

public class YesBankAdapter implements BankApi{
    private YesBank yesBank = new YesBank();

    @Override
    public void sendMoney(String from, String to, int amount) {
        yesBank.transferMoney(from, to, amount);
    }

    @Override
    public void registerUser(String accountNumber) {
    }

    @Override
    public void checkBalance(String accountNumber) {

    }
}
