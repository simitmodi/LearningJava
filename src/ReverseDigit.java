import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        System.out.println("Welcome to the reverse Digit Maker");
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the number you want to reverse: ");
        int num=input.nextInt();
        int answer = reverser(num);
        System.out.println("The number you provided is "+num+" and after reversing it, it becomes "+answer);
    }
    public static int reverser(int num){
        int j=0;
        while(num>0){
            int i=num%10;
            j=j*10+i;
            num/=10;
        }
        return j;
    }
}
