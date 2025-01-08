import java.util.Scanner;

public class GCFFinder {
    public static void main(String[] args) {
        System.out.println("Welcome to LCM Finder");
        int num1=userInput();
        int num2=userInput();
        int answer = findGCF(num1,num2);
        System.out.println("GCF of "+num1+" and "+num2+" is "+answer);
    }
    public static int userInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return input.nextInt();
    }
    public static int findGCF(int num1, int num2) {
        int i=Math.max(num1,num2);
        while(true){
            if(num1%i==0 && num2%i==0){
                return i;
            }
            i--;
        }
    }
}
