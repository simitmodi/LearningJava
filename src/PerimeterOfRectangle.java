import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of first side: ");
        float A = input.nextFloat();
        System.out.println("Enter length of second side: ");
        float B = input.nextFloat();
        System.out.println("Enter length of third side: ");
        float C = input.nextFloat();
        System.out.println("Enter length of fourth side");
        float D = input.nextFloat();
        float perimeter = A+B+C+D;
        System.out.println("Perimeter of the rectangle of the given sides is: " + perimeter);
    }
}
