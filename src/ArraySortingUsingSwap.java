public class ArraySortingUsingSwap {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Sorting using Swap function");
        int[] arr=ArrayUtility.inputArray();
        int[] sortedArray = ArraySorter(arr);
        System.out.println("Sorted Array: ");
        ArrayUtility.printArray(sortedArray);
    }
    public static int[] ArraySorter (int[] arr) {
        int[] sorted = arr.clone();
        int n= sorted.length;
        boolean swap = true;

        while (swap) {
            swap = false;
            int i =0;

            while (i < n-1) {
                if (sorted[i] > sorted[i + 1]) {
                    int temp = sorted[i];
                    sorted[i] = sorted[i + 1];
                    sorted[i + 1] = temp;
                    swap = true;
                }
                i++;
            }
        }
        return sorted;
    }

}
