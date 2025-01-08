import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Welcome to Fibonacci Series Finder");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number till which you want to find Fibonacci Series: ");
        int num = input.nextInt();
        seriesFinder(num);
    }
    public static void seriesFinder(int num){
        if(num<0) return;
        if(num==0) return;
        System.out.print("0 ");
        System.out.print("1 ");

        int first =0,second=1;
        while(first+second<=num){
            int third=first+second;
            System.out.print(third+" ");
            first=second;
            second =third;
        }
    }
}
