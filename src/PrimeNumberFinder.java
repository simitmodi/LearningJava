import java.util.Scanner;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        System.out.println("Welcome to Prime Number Checker");
        int num = userInput();
        if(num==1||num==0){
            System.out.println("It is prime number");
            return;
        }
        int answer = primeNumberChecker(num);
        if(answer==0 || answer==1|| answer==num){
            System.out.println("It is Prime Number");
        } else {
            System.out.println("It is not Prime number");
        }
    }
    public static int userInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return input.nextInt();
    }
    public static int primeNumberChecker(int num){
        int i=2;
        while(true){
            if (num%i==0){
                return i;
            } else {
                i++;
            }
        }
    }
}
