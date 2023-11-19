import java.util.Scanner;
import java.util.Random;
 public class CoinFlip{
  public static void main(String[]args){
   Scanner input = new Scanner(System.in);
    System.out.println("Enter guess:");
int num = input.nextInt();


Random random = new Random();
 int randomNumber = random.nextInt(2);

 System.out.println("randomNumber: " + randomNumber);

if (num == randomNumber){
System.out.println("the guess is correct");
}
else
{
System.out.println("the guess is incorrect");
}








}

}