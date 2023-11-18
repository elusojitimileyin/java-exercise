import java.util.Scanner;
public class Multiples{
public static void main(String[] args){
 Scanner input = new Scanner(System.in);

System.out.println("Enter first integer:");
int first= input.nextInt();

System.out.println("Enter second integer:");
int second= input.nextInt();

int first1= first*first*first;
int second1= second*second;

int remainder= first1 % second1;

System.out.println("remainder:" + remainder);
}


}