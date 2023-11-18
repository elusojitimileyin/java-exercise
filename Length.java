import java.util.Scanner;

public class Length {

public static void main(String[] args){

Scanner input = new Scanner(System.in);


System.out.println("Enter numbers of velocity: ");

int v = input.nextInt();



System.out.println("Enter number of acceleration: ");

double a = input.nextDouble();



 double v0 =   (v*v); 
double a0 =  a*2;
double length= v0/ a0;

System.out.printf("length is %.2f", length);
}
}