public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Reverse");
        int[] numArr = ArrayUtility.inputArray();
        reverse(numArr);
        System.out.println("Your reversed array is");
        ArrayUtility.printArray(numArr);
    }

    public static void reverse(int[] arr) {
        int i = 0;
        while (i < arr.length / 2) {
            int temp = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = temp;
            i++;
        }
    }
}
