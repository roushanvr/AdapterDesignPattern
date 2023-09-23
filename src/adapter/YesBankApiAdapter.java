package adapter;

public class YesBankApiAdapter implements BankApi{
    private YesBank yb=new YesBank();
    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
       return yb.transferMoney(fromAccount, toAccount, amount);
    }

    @Override
    public double getBalance(String accountNumber) {
       return yb.checkBalance(accountNumber);
    }
}
