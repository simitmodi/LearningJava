import java.util.Scanner;

public class SwapTwoVariables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name=input.next();
        System.out.print("Welcome " + name);
        System.out.print("\nPlease enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Now, please enter the second number: ");
        int num2 = input.nextInt();
        int a=num1;
        num1=num2;
        num2=a;
        System.out.print("After Swapping 2 numbers: \nFirst number is: " + num1 + "\nand second number is: " + num2);
        System.out.print("\nThanks for visiting " + name +
                " !!!!!!");
    }
}
