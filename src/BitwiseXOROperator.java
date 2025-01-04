import java.util.Scanner;

public class BitwiseXOROperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 desired numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int answer = num1^num2;
        System.out.print("Bitwise XOR between " + num1 + " and "+num2+" is "+answer);
    }
}
