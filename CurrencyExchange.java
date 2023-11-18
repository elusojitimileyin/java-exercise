import java.util.Scanner;
 public class CurrencyExchange{
  public static void main(String[]args){
   Scanner input = new Scanner(System.in);
System.out.print("Enter exchange rate from dollars to RMB:");
double Exchange = input.nextDouble();

System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa:");
int currency = input.nextInt();

if(currency==0){
System.out.print("Enter the dollar amount:"); 
double dollarAmount = input.nextDouble();
double RMB= dollarAmount*Exchange ;
System.out.printf("$%.1f is %.1fyuan", dollarAmount,RMB);
}

if(currency==1){
System.out.print("Enter the RMB amount:");
double rmbAmount = input.nextDouble();
double dollar =  rmbAmount/Exchange;
System.out.printf("%.1f yuan is $%.2f", rmbAmount, dollar );
}

}

}