import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of Base of a triangle: ");
        float b = input.nextFloat();
        System.out.println("Enter size of Height of a triangle:");
        float h = input.nextFloat();
        float area=0.5f*b*h;
        System.out.println("Area of triangle of given side is: " + area);
    }
}
