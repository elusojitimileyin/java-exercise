import java.util.Scanner;
 public class Circle{
  public static void main(String[]args){
   Scanner input = new Scanner(System.in);
    System.out.println("Enter the radius of a circle:");
     int radius = input.nextInt();
     int diameter = 2*radius;
     double pi = 3.14159;
     double circumference= 2*pi*radius;
     double area =pi*(radius*radius);
System.out.printf("diameter: %d%n circumference: %.2f%n area: %.2f%n", diameter,circumference, area );


}
}