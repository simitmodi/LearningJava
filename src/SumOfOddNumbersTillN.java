import java.util.Scanner;

public class SumOfOddNumbersTillN {
    public static void main(String[] args) {
        Greet();
        int n=userInput();
        Sum(n);
    }
    public static void Greet(){
        System.out.println("Welcome to the Sum finder");
    }
    public static int userInput() {
        System.out.println("Enter the value till which you need sum: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public static void Sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if((i % 2) == 1){
                sum = sum+i;
            }
        }
        System.out.println("Sum is: "+sum);
    }
}
