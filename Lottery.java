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

int num1 = num/100;
int num2 = num/10%10;
int num3 = num%10;

int randomnumber1 = randomNumber/100;
int randomnumber2 = randomNumber/10%10;
int randomnumber3 = randomNumber%10;


if (num == randomNumber) {
System.out.println("Congratulations! You won $10,000.");
} 

else if (num/100 == randomNumber/100 ||  num/10%10 == randomNumber/10%10 || num%10 == randomNumber%10 ){
System.out.println("Congratulations! You won $3,000.");
}

else if (num3 == randomNumber||  num/10%10 == randomNumber/10%10 || num%10 == randomNumber%10 ){
System.out.println("Congratulations! You won $1,000.");
}





}

}