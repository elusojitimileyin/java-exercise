import java.util.Scanner;

public class AverageAcceleration{

public static void main(String[] args)  {

Scanner input = new Scanner(System.in);

System.out.println("enter v1 number: ");
double v1 = input.nextDouble();
System.out.println("enter v0 number: ");
double v0 = input.nextDouble();
System.out.println("enter t number: ");
double t = input.nextDouble();

double a= v1-v0;

double AverageAcceleration= a / t;
 
System.out.printf("AverageAcceleration is %f%n", AverageAcceleration);

}



}