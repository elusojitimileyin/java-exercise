import java.util.Scanner;
public class Divisibility{
public static void main(String[] args){
 Scanner input = new Scanner(System.in);
System.out.println("Enter integer:");
 int number = input.nextInt(); 
boolean number1 = number %5 ==0; 
boolean number2 = number %6 ==0;

if(number1 && number2)System.out.printf("%d%n",number  );

}
}