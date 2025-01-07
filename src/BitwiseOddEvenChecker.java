import java.util.Scanner;

public class BitwiseOddEvenChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the desired number: ");
        int num = input.nextInt();
        int answer =1;
        if((num&1)==1) {
            System.out.println("Number given is Odd");
        } else {
            System.out.println("Number given is Even");
        }
    }
}
