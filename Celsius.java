import java.util.Scanner;
public class Celsius{
public static void main(String[] args){
 Scanner input = new Scanner(System.in);

System.out.print("convert fahrenheit to celsius:");
double celsius = input.nextDouble();

double fahrenheit = ((9.0/5) * celsius) +32;

System.out.printf("43 Celsius is %.1f Fahrenheit" , fahrenheit);
}


}