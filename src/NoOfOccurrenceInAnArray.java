import java.util.Scanner;

public class NoOfOccurrenceInAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number of occurrence checker of an element in an array");
        int [] arr = ArrayUtility.inputArray();
        System.out.println("Enter the number you want to find: ");
        int num = input.nextInt();
        int occurrences = noOfOccurrences(arr,num);
        System.out.println("Given number has been found " + occurrences + " times");
    }
    public static int noOfOccurrences(int[] arr, int num) {
        int occ = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == num) {
                occ++;
            }
            i++;
        }
        return occ;
    }
}
