import java.util.Scanner;
 public class NonDecreasingOrder{
  public static void main(String[]args){
   Scanner input = new Scanner(System.in);
    System.out.println("Enter the first integer:");
	int num1 = input.nextInt();
    System.out.println("Enter the second integer:");
	int num2 = input.nextInt();
  System.out.println("Enter the third integer:");
	int num3 = input.nextInt();

if (num1 < num2 && num1 < num3){
System.out.println (num1);
      if (num2 < num3)
           System.out.println (num2);
            System.out.println (num3);
      if (num3 < num2)
            System.out.println (num3);
           System.out.println (num2);
}
 else if (num2 < num1 && num2 < num3){
System.out.println (num2);
      if (num1 < num3)
            System.out.print (num1);
           System.out.print (num3);
      if (num3 < num1)
            System.out.println (num3);
            System.out.println (num1);
}
else if (num3 < num1 && num3 < num2){
System.out.println (num3);
      if (num1 < num2)
            System.out.println (num1);
            System.out.println (num2);
      if (num2 < num1)
            System.out.println (num2);
            System.out.println (num1);

}


  







}


}