import java.util.Scanner;
 public class DaysOfTheWeek {
  public static void main(String[]args){
   Scanner input = new Scanner(System.in);
   
 System.out.println("Enter year:");
int year= input.nextInt();
   
System.out.println("Enter month:");
int m= input.nextInt();
  
System.out.println("Enter day of the month:");
int q = input.nextInt();

 
 int j= year/100;
int k =year%100;

int h = (q+ ((26*(m+1))/10) + k + (k/4) +(j/4) + 5*j) % 7;


System.out.println("h="+ h);

if (h==0)
System.out.println("saturday");

if (h==1)
System.out.println("sunday");

if (h==2)
System.out.println("monday");

if (h==3)
System.out.println("tuesday");

if (h==4)
System.out.println("wednesday");

if (h==5)
System.out.println("thursday");

if (h==6)
System.out.println("friday");






}

}