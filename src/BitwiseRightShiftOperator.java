import java.util.Scanner;

public class BitwiseRightShiftOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the desired number: ");
        int num=input.nextInt();
        System.out.println("Enter the desired number of position to be shifted: ");
        int position = input.nextInt();
        int answer=num>>position;
        System.out.println("Bitwise Right Shift Operator on "+num+" for "+position+" number of position is "+answer);
    }
}
