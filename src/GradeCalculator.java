import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the grade of the student: ");
        int grade = input.nextInt();
        if (grade >=90 && grade<=100) {
            System.out.println("You have secured \"A\" Grade!!!!!!");
        } else if (grade>=75 && grade<=89) {
            System.out.println("You have Secured \"B\" Grade!!!!!!");
        } else if (grade<=74 && grade>=60) {
            System.out.println("You have secured \"C\" Grade!!!!!!");
        } else if (grade<=59 && grade>=30) {
            System.out.println("You have secured \"D\" Grade!!!!!!");
        }else if (grade<=29 && grade>=0) {
            System.out.println("You have secured \"F\" Grade!!!!!!");
        }else {
            System.out.println("Please enter in the range of 0 to 100");
        }
    }
}
