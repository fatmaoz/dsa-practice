package array_of_number_digits;

import java.util.ArrayList;

public class ArrayOfNumberDigits {

    public static void main(String[] args) {
        int input = 1909;
        int[] result = convertToDigitsArray(input);
        System.out.print("Output: [");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    /**
     * Question-5 Array of Digits
     * How to convert a positive int to an array of digits.
     * Input: 490		Output: [4, 9, 0] (as int Array)
     */
    public static int[] convertToDigitsArray(int num) {
        ArrayList<Integer> digitsList = new ArrayList<>();

        while (num > 0) {
            digitsList.add(num % 10);
            num /= 10;
        }

        int[] digitsArray = new int[digitsList.size()];
        for (int i = 0; i < digitsArray.length; i++) {
            digitsArray[i] = digitsList.get(digitsList.size() - 1 - i);
        }

        return digitsArray;
    }
}
