import java.util.Scanner;

 public class Convertion {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter number of pounds:   ");
double p= input.nextDouble();

 System.out.println("Enter value of 1kilogram:   ");
 double k = input.nextDouble();

double convertion = p*k;


System.out.printf("covertion is %f%n", convertion );




}



}