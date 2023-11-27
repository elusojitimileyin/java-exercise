
public class AccountTest{

public static void main(String[] args){

Account account1 = new Account("Jane Green", 50.00, 0.00);
 

System.out.println("Account Name is:" + account1.getName());
System.out.println("Account Balance is:" + account1.getBalance());
System.out.println("Account Withdraw is:" + account1.getWithdraw());

account1.setDeposit(30.00);
System.out.println("Deposited $30.00. New Balance: $" + account1.getBalance());



}
}