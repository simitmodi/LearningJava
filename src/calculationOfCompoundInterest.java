import java.util.Scanner;

public class calculationOfCompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principle amount: ");
        double p= input.nextDouble();
        System.out.println("Enter the time period: ");
        double t= input.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double r=input.nextDouble();
        double interest= p *Math.pow(( 1f + r/ 100f ), t);
        System.out.println("So, the compound interest for the "+p+" for "+t+" year(s) of time, for "+r+"% rate of interest is " + interest);
    }
}