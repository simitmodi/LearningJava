import java.util.Scanner;

public class BitWiseOROperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 desired number: ");
        int num1= input.nextInt();
        int num2 = input.nextInt();
        int answer= num1|num2;
        System.out.print("Bitwise OR between " + num1 + " and "+num2+" is "+answer);
    }
}
