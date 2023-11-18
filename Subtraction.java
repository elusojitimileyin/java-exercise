import java.util.Scanner;
 public class Subtraction{
  public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     	
     System.out.print("Enter first number: ");
	int first1 = input.nextInt();

     System.out.print("Enter second number: ");
	int second2 = input.nextInt();

	int add = first1 + second2;
	int minus = first1 - second2;
	int multiple = first1 * second2;
	int division = first1 / second2;
	int remainder = first1 % second2;
	

System.out.printf("add =  %d%n minus =  %d%n multiple =  %d%n division =  %d%n remainder =  %d%n",  add,  minus,  multiple,  division,  remainder);
}


} 