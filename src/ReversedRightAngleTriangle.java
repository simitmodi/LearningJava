import java.util.Scanner;

public class ReversedRightAngleTriangle {
    public static void main(String[] args) {
        System.out.println("Welcome to Right Angle Triangle Printer");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows=input.nextInt();
        PatternPrinter(rows);
    }
    public static void PatternPrinter(int rows) {
        for(int i=rows; i>=0; i--){
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
