import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = input.nextInt();
        int i=0;
        int[] arr=new int[size];
        while (i<size){
            System.out.print("Enter the "+(i+1)+" number of element: ");
            arr[i]=input.nextInt();
            i++;
        }
        return arr;
    }
    public static int[] printArray(int[] printarr) {
        int i=0;
        while (i < printarr.length) {
            System.out.print(printarr[i]+" ");
            i++;
        }
        return printarr;
    }
}
