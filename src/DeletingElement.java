import java.util.Scanner;

public class DeletingElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Deletion");
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Enter the number you want to delete: ");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(numArr, numToDelete);
        ArrayUtility.printArray(newArr);
    }
    public static int[] deleteNumber(int[] numArr, int numToDelete) {
        int occurrences = NoOfOccurrenceInAnArray.noOfOccurrences(numArr, numToDelete);
        if (occurrences == 0) {
            return numArr;
        }
        int newSize = numArr.length - occurrences;
        int[] newArr = new int[newSize];
        int i = 0, j = 0;
        while (i < numArr.length) {
            if (numArr[i] != numToDelete) {
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}
