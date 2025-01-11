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
    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();
        int i=0;
        int[][] numArr = new int[rows][columns];
        while (i<rows){
            int j = 0;
            while(j < columns) {
                System.out.print("Please Enter element row" + (i+1) + ", column "+(j+1) +": ");
                numArr[i][j]=input.nextInt();
                j++;
            }
            i++;
        }
        return numArr;
    }
}
