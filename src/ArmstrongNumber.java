import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Armstrong Number Checker");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to check for: ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong) {
            System.out.println("Your number is an Armstrong number.");
        } else {
            System.out.println("Your number is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int digits = countDigits(num);
        int numCopy = num;
        int finalNumber = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += Math.pow(lastDigit, digits);
        }
        return finalNumber == numCopy;
    }

    public static int countDigits(int num) {
        int digitCount = 0;
        while (num > 0) {
            digitCount++;
            num /= 10;
        }
        return digitCount;
    }
}
