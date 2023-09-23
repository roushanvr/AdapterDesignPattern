package adapter;

public class IciciBankApiAdapter implements BankApi{
    private IciciBank ib =new IciciBank();
    @Override
    public double getBalance(String accountNumber) {
        return ib.checkBalance(accountNumber);
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return ib.transferMoney(fromAccount, toAccount, amount);
    }
}
