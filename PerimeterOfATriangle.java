import java.util.Scanner;
 public class PerimeterOfATriangle{
  public static void main(String[]args){
   Scanner input = new Scanner(System.in);
System.out.println("edge1:");
     int edge1 = input.nextInt();

System.out.println("edge2:");
     int edge2 = input.nextInt();

System.out.println("edge3:");
     int edge3 = input.nextInt();


 if ((edge1 + edge2 > edge3)&&(edge2+edge3 > edge1)&&(edge1 + edge3 > edge2)){ 
System.out.println("input is valid");
}
else {
System.out.println("input is not valid");
}

}

}