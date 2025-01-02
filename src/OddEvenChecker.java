import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the desired number: ");
        float num=input.nextFloat();
        if (num==0){
            System.out.println("Entered number is Zero!!!!!!!!");
        } else if (num%2==0) {
            System.out.println("Entered number is even..");
        }else {
            System.out.println("Entered number is odd..");
        }
    }
}
