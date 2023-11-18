import java.util.Scanner;
 public class Game{
  public static void main(String[]args){
   Scanner input = new Scanner(System.in);
  System.out.println("Enter player1 name:");
String timi = input.nextLine();
  System.out.println("Enter player2 name:");
String bj = input.nextLine();
System.out.println("timi Enter number ranging from 0 to 2:");
int number1 = input.nextInt();
System.out.println("bj Enter number ranging from 0 to 2:");
int number2 = input.nextInt();

if (number1 > number2)System.out.println("timi won bj!!!");
if (number1 < number2)System.out.println("timi loses bj!!!");
if (number1 == number2)System.out.println("timi draw bj");


}



}
