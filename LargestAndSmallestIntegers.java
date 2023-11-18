import java.util.Scanner;
 public class LargestAndSmallestIntegers{
  public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter first integer: ");
int first = input.nextInt();
System.out.println("Enter second integer: ");
int second = input.nextInt();
System.out.println("Enter third integer: ");
int third = input.nextInt();
System.out.println("Enter forth integer: ");
int forth = input.nextInt();
System.out.println("Enter five integer: ");
int five = input.nextInt();

int largest = first;
int smallest = first;

if (second>largest){
largest = second ;
}
if (third>largest){
largest = third ;
}
if (forth>largest){
largest = forth ;
}
if (five>largest){
largest = five ;
}

if (second<smallest){
smallest = second;
}
if (third<smallest){
smallest = third ;
}
if (forth<smallest){
smallest = forth;
}
if (five<smallest){
smallest = five ;
}

System.out.println("largest" + largest);
System.out.println("smallest" + smallest);
}





}