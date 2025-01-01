import java.util.Scanner;

public class add_two_numbers {
    public static void main(String[] args) {
        int sum;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1=input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2=input.nextInt();
        sum=num1+num2;
        System.out.print("The sum of the number is: " + sum);
    }
}
