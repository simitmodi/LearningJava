import java.util.Scanner;

public class UserInputs {

    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String username=name.nextLine();
        System.out.println("Welcome " + username + " to My Class");
    }
}