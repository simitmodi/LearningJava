import java.util.Scanner;

public class LCMFinder {
    public static void main(String[] args) {
        System.out.println("Welcome to LCM Finder");
        int num1=userInput();
        int num2=userInput();
        int answer=findLCM(num1,num2);
        System.out.println("LCM of " + num1+" and "+num2+" is "+answer);
    }
    public static int userInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        return input.nextInt();
    }
    public static int findLCM(int num1, int num2) {
        int i=1;
        while(true){
            int factor= num1*i;
            if(factor%num2==0){
                return factor;
            }
            i++;
        }
    }
}
