import java.util.Scanner;

public class BitwiseNOTOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter desired number: ");
        int num1=input.nextInt();
        int answer= ~num1;
        System.out.println("Bitwise NOT of " + num1 +  " is "+answer);
    }
}
