import java.util.Scanner;

public class Arithmetic_operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int a = input.nextInt();
        System.out.print("Now, Please enter second number: ");
        int b = input.nextInt();
        int c;
        c=a+b;
        System.out.println("Addition: " + c);
        c=a-b;
        System.out.println("Subtraction: "+c);
        c=a*b;
        System.out.println("Multiplication: " + c);
        c=a/b;
        System.out.println("Division: " +c);
        c = a%b;
        System.out.println("Modulus: "+c);
    }
}
