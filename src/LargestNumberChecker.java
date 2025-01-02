import java.util.Scanner;

public class LargestNumberChecker {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter three desired numbers: ");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        if (num1 == num2 && num2== num3 && num3==num1) {
            System.out.println("All 3 numbers are equal!!!!!!!!!");
        } else if (num1>num2 && num1>num3) {
            System.out.println("First entered number is Largest");
        } else if (num2>num1 && num2>num3) {
            System.out.println("Second Entered number is largest");
        } else {
            System.out.println("Third entered number is largest");
        }
    }
}
