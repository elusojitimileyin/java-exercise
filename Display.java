import java.util.Scanner;
 
 public class Display{

  public static void main(String[] args){

   Scanner input = new Scanner(System.in);
    System.out.println("Enter first integer:");
     int first = input.nextInt();

 System.out.println("Enter second integer:");
     int second = input.nextInt();

 System.out.println("Enter third integer:");
     int third = input.nextInt();


int sum = first + second + third;
double average =  (first + second + third)/ 3;
int product =first * second *third;
System.out.println("sum:" + sum);
System.out.println("average:" + average );
System.out.println("product:" + product);


 int smallest = first;
        int largest = first;

        if (second < smallest) {
            smallest = second;
        }

        if (third < smallest) {
            smallest = third;
        }

        if (second > largest) {
            largest = second;
        }

        if (third > largest) {
            largest = third;
        }

        System.out.printf("%d%n ", smallest);
        System.out.printf("%d%n " ,largest);
    }
}