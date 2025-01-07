import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int i = userInput();
        multiplier(i);
        }
        

    public static int userInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number for the table: ");
        return input.nextInt();
    }
    public static void multiplier(int i){
        for(int n=1;n<=10;n++){
            System.out.printf("%d X %d = %d%n", i, n, i * n);
        }
    }
}
