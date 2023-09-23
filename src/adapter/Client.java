package adapter;

public class Client {
  public static void main(String args[]){
      Phonepe pp=new Phonepe(new YesBankApiAdapter());//dependency injection
  }
}
