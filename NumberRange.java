import java.util.Scanner;

public class NumberRange{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter number ranging from 1 to 10:");
int number  = scanner.nextInt();
int count = 1;
int total =0;
if(number >= 1 && number <= 10){
	while(count <= 12){ 
	total = count * number;
	System.out.printf("%d * %d = %d%n",number,count,total);
	count++;
}

}
else {
   System.out.print("neglect number");
}	
}
}