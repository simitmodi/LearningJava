public class FindMinAndMaxNoInAnArray {
    public static void main(String[] args) {
        System.out.println("Welcome to the Minimum and maximum finder");
        int[] arr = ArrayUtility.inputArray();
        int max = MaxFinder(arr);
        int min = MinFinder(arr);
        System.out.println(max+" is the maximum number");
        System.out.println(min + " is the minimum number");
    }
    public static int MaxFinder (int[] arr) {
        int num=0;
        int i = 0;
        while (i < arr.length) {
            if(arr[i] > num) {
                num = i;
                i++;
            } else if (arr[i] < num) {
                i++;
            }
            i++;
        }
        return num;
    }
    public static int MinFinder (int[] arr) {
        int num=arr[0];
        int i = 0;
        while (i < arr.length) {
            if(arr[i] < num) {
                num = arr[i];
                i++;
            } else if (arr[i] > num) {
                i++;
            }
            i++;
        }
        return num;
    }
}
