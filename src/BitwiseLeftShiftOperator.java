import java.util.Scanner;

public class BitwiseLeftShiftOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any desired number: ");
        int num = input.nextInt();
        System.out.print("Enter the desired number of positions to be shifted: ");
        int position =input.nextInt();
        int answer=num<<position;
        System.out.println("Bitwise Left Shift Operator on "+num+" for "+position+" number of position is "+answer);
        input.close();
    }
}
