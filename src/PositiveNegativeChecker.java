import java.util.Scanner;

public class PositiveNegativeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the desired number: ");
        float num = input.nextFloat();
        if (num==0) {
            System.out.println("Number entered is zero!!");
        } else if (num>0) {
            System.out.println("Number entered is positive!!!");
        }else {
            System.out.println("Number entered is negative");
        }
    }
}
