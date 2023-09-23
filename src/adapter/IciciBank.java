package adapter;

public class IciciBank {
    public double checkBalance(String accountNumber){
        return 1000;
    }
    public boolean transferMoney(String fromAccount, String toAccount, double amount){
        return true;
    }
}
