import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number for which you want to check: ");
        int num = input.nextInt();
        int answer = reverser(num);
        if (num==answer) {
            System.out.println("Entered number is Palindrome number");
        } else {
            System.out.println("Entered number is not palindrome number");
        }
    }
    public static int reverser(int num){
        int j=0;
        while (num>0){
            int i = num%10;
            j=j*10+i;
            num/=10;
        }
        return j;
    }
}
