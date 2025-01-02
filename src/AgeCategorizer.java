import java.util.Scanner;

public class AgeCategorizer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age = input.nextInt();
        if (age <=13 && age >=0) {
            System.out.println("You are categorized as child");
        }else if (age <=20 && age >=14){
            System.out.println("You are categorized as teen");
        } else if (age <=60 && age>= 21) {
            System.out.println("You are categorized as adult");
        } else if (age >=61) {
            System.out.println("You are categorized as senior citizen");
        }
    }
}
