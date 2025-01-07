import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Welcome to the Sum of digits calculator");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=input.nextInt();
        int sum=sumOfDigits(num);
        System.out.println("Sum is: "+sum);
    }
    public static int sumOfDigits(int num) {
        int sum=0;
        while(num>0) {
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}
