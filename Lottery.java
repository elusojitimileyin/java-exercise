import java.util.Scanner;
import java.util.Random;
 public class Lottery{
  public static void main(String[]args){
   Scanner input = new Scanner(System.in);
    System.out.println("Enter a three-digit number:");
int num = input.nextInt();

Random random = new Random();
 int randomNumber = random.nextInt(1000);
System.out.println("randomNumber: " + randomNumber);

if (num == randomNumber){
System.out.println("the award is $10000");
}

if ((1 % 2 % 3)== randomNumber){
System.out.println("the award is $3000");
}
if (1 2   3 == randomNumber){
System.out.println("the award is $1000");
}










}

}