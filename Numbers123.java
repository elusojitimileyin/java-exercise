import java.util.Scanner;

public class Numbers123{

public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter Integer: ");
int Integer= input.nextInt();

if (Integer < 0) 
System.out.print("negative");

if  (Integer > 0)
System.out.print("positive");

if (Integer == 0) 

System.out.print("zero");

}
}