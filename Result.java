import java.util.Scanner;
public class Result{
public static void main(String[] args){
 // calculate the product of the integer
Scanner input =new Scanner(System.in);
System.out.println("Enter the first integer");
int x = input.nextInt();
System.out.println("Enter the second integer");
int y = input.nextInt();
System.out.println("Enter the third integer");
int z = input.nextInt();

int result = x*y*z;
 System.out.printf("%d%n", result);

}
}