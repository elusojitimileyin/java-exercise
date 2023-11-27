public class Account {
  
   private String name;
   private double balance;
   private double withdraw;

public Account(String name, double balance, double withdraw) {
  this.name = name;
if (balance > 0.0) 
 this.balance = balance;
if (withdraw<=  balance)
 this.withdraw = withdraw;
}


public void setName(String name) {
  this.name = name;
}

public String getName(){
  return name;
}

public void setDeposit(double depositAmount) {
 if (depositAmount > 0.0) 
 balance = balance + depositAmount;

}
public double getBalance() {
 return balance;
} 


public void setWithdraw(double withdraw) {
if (withdraw<=  balance){
this.withdraw = withdraw;
}

public void setWithdrawl(double withdraw) {
if (withdraw >  balance)
this.withdraw = withdraw;
System.out.println("Withdrawal amount exceeded account balance." + withdraw);




}
public double getWithdraw() {
 return withdraw;
} 
}