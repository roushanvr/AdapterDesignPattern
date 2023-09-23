package adapter;

public class YesBank {
    public double checkBalance(String accountNumber){
       return 1000;
    }
    public boolean transferMoney(String fromAccount, String toAccount, double amount){
        return true;
    }
}
