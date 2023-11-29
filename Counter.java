import java.util.Scanner;
public class Counter{
public static void main(String[]args){

Scanner input = new Scanner(System.in);

int count =0;
int total =0; 
int average =0;
int positiveNumber=0;
int negativeNumber =0;
System.out.print("Enter an integer, the input ends if it is 0: ");
 int num= input.nextInt();
while (num!=0) {


	total += num;
	count++;

	if (num>0){
	positiveNumber++;
}
	else if (num<0){
	negativeNumber++;
}



System.out.print("Enter an integer, the input ends if it is 0: ");
 num = input.nextInt();

}
 if (count !=0) {
average = total / count;
}

System.out.println("positive is" + positiveNumber);
System.out.println("negative is"  + negativeNumber);
System.out.println("total is" + total);
System.out.println("average is" + average);


}
}