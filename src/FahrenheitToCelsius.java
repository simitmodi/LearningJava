import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        double f = input.nextDouble();
        double celsius = (f-32)*5/9;
        System.out.println("Temperature in celsius is: " + celsius);
    }
}
