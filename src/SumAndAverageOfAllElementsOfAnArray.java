import java.util.Scanner;

public class SumAndAverageOfAllElementsOfAnArray {
    public static void main(String[] args) {
        System.out.println("Welcome to the the sum and average finder of an Array");
        int[] arr = ArrayUtility.inputArray();
        System.out.println("Array: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        int sum=0;
        int num=0;
        while (num< arr.length) {
            sum=sum+arr[num];
            num++;
        }
        int avg=sum/ arr.length;
        System.out.println("Sum of given elements is "+sum);
        System.out.println("Average of given elements is "+avg);
    }
}
