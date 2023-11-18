 import java.util.Scanner;


public class Arithmetic {

public static void main(String[] args){

Scanner input;
input = new Scanner(System.in);
System.out.println("Enter first integer: ");
int A = input.nextInt();
System.out.println("Enter second integer: ");
int B = input.nextInt();
int b1 = A*A;
int a1 = B*B;

 int  sum = a1 + b1;
 int diff = a1 - b1;
System.out.printf("a1 is %d%nb1 is %d%nsum is %d%ndiff is %d%n", a1,b1,sum,diff);







}

}

