public class MergeSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Merging of 2 arrays");
        int[] numArr1 = ArrayUtility.inputArray();
        int[] numArr2 = ArrayUtility.inputArray();
        int[] newArr = mergeArray(numArr1, numArr2);
        System.out.println("Your merged array is:");
        ArrayUtility.printArray(newArr);
    }
    public static int[] mergeArray(int[] numArr1,int[] numArr2) {
        int newSize = numArr1.length+ numArr2.length;
        int[] newArr = new int[newSize];
        int i = 0,j=0,k=0;
        while (i < numArr1.length || j < numArr2.length) {
            if (j == numArr2.length ||
                    (i < numArr1.length && numArr1[i] < numArr2[j])) {
                newArr[k] = numArr1[i];
                i++;
                k++;
            } else {
                newArr[k] = numArr2[j];
                k++;
                j++;
            }
        }
        return newArr;
    }
}
