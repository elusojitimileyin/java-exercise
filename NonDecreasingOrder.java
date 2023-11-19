import java.util.Scanner;
 public class NonDecreasingOrder{
  public static void main(String[]args){
   Scanner input = new Scanner(System.in);
    System.out.println("Enter the first integer:");
	int number1 = input.nextInt();
    System.out.println("Enter the second integer:");
	int number2 = input.nextInt();
  1. Input first integer (num1)
2. Input second integer (num2)
3. Input third integer (num3)

4. If num1 <= num2 and num1 <= num3
      a. Print num1
5. If num2 <= num1 and num2 <= num3
      a. Print num2
6. If num3 <= num1 and num3 <= num2
      a. Print num3

7. If num1 <= num2 and num1 <= num3
      a. If num2 <= num3
            i. Print num2
            ii. Print num3
      b. If num3 < num2
            i. Print num3
            ii. Print num2
8. If num2 <= num1 and num2 <= num3
      a. If num1 <= num3
            i. Print num1
            ii. Print num3
      b. If num3 < num1
            i. Print num3
            ii. Print num1
9. If num3 <= num1 and num3 <= num2
      a. If num1 <= num2
            i. Print num1
            ii. Print num2
      b. If num2 < num1
            i. Print num2
            ii. Print num1




  







}


}