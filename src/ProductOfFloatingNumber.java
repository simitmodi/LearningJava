import java.util.Scanner;

public class ProductOfFloatingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        float num1 = input.nextFloat();
        System.out.println("Now, Please enter the second number: ");
        float num2 = input.nextFloat();
        float product=num1*num2;
        System.out.println("Product of 2 floating number: " + product);
    }
}
