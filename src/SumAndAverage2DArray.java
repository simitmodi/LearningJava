public class SumAndAverage2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum and Average finder of 2D Array");
        int[][] numArr = ArrayUtility.input2DArray();
        long sum = sum(numArr);
        double avg = avg(numArr);
        System.out.println("Sum of the Array is "+sum+"\nAverage of an Array is "+avg);
    }
    public static long sum(int[][] numArr) {
        int i = 0;
        long sum = 0;
        while (i < numArr.length) {
            int j = 0;
            while (j < numArr[i].length) {
                sum = sum + numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public static double avg(int[][] numArr) {
        if (numArr.length == 0){
            return 0;
        }
        int rows = numArr.length;
        int columns = numArr[0].length;
        double size = rows*columns;
        return sum(numArr) / size;
    }
}
