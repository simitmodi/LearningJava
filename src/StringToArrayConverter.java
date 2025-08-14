public class StringToArrayConverter {
    public static int[] convertNumericStringToArray(String numericString) {
        char[] charArray = numericString.toCharArray();
        int[] digitArray = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            digitArray[i] = Character.getNumericValue(charArray[i]);
        }
        return digitArray;
    }

    public static void main(String[] args) {
        String numStr = "12345";
        int[] result = convertNumericStringToArray(numStr);
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}