import java.util.Scanner;
 
 public class ComparingInteger{

  public static void main(String[] args){

   Scanner input = new Scanner(System.in);
   System.out.println("Enter the first:");
    int first = input.nextInt();
 System.out.println("Enter the second:");
    int second = first * first;



    if(first== 100 )
System.out.printf("%d == %d%n", first ,second );
   if(first > 100 )
System.out.printf("%d > %d%n",  first , second );
   if(first < 100 )
System.out.printf("%d <  %d%n",  first, second );
   if(first != 100 )
System.out.printf("%d!= %d%n", first, second );


if(second == 100 )
System.out.printf("%d == %d%n", first, second);
   if(second > 100 )
System.out.printf("%d > %d%n", first, second);
   if(second < 100 )
System.out.printf("%d <  %d%n", first, second);
   if(second != 100 )
System.out.printf("%d!= %d%n", first, second);








}







}