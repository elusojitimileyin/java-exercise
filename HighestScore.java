import java.util.Scanner;

public class HighestScore{

public static void main(String[]args){

Scanner input = new Scanner(System.in);



int highestScore = 0;
String  studentWithTheHighestScore  = "";

System.out.println("Enter number of students");
int numberOfStudent = input.nextInt();
int i = 0;

        while (i < numberOfStudent) {
            System.out.print("Enter name: ");
            String name = input.next();

            System.out.print("Enter score: ");
            int score = input.nextInt();

            	if (score > highestScore) {
                highestScore = score;
                studentWithTheHighestScore = name;
            }

            i++;
        }

        if (highestScore > 0) {
            System.out.println("Student with the highest score is: " + studentWithTheHighestScore);
            System.out.println("The highest score is: " + highestScore);
        }
}
}