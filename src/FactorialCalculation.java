import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args) {
    Greet();
    int num = userInput();
    Factorial(num);
    }
    public static void Greet() {
        System.out.println("Welcome to the Factorial Calculation");
    }
    public static int userInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the desired number: ");
        return input.nextInt();
    }
    public static void Factorial(int num) {
        long sum=1;
        for(int i = 1; i<=num;i++) {
            sum *= i;
        }
        System.out.println("Factorial of " + num + " is " + sum);
    }
}
