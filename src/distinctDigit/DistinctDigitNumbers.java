package distinctDigit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistinctDigitNumbers {


        public static void main(String[] args) {
            List<List<Integer>> ranges = new ArrayList<>();
            ranges.add(Arrays.asList(80, 120));
            System.out.println(countNumbers(ranges));  // Output: 27
        }

        public static int countNumbers(List<List<Integer>> arr) {
            int count = 0;
            for (List<Integer> range : arr) {
                for (int i = range.get(0); i <= range.get(1); i++) {
                    if (noRepeatedDigits(i)) {
                        count++;
                    }
                }
            }
            return count;
        }

        private static boolean noRepeatedDigits(int number) {
            boolean[] digits = new boolean[10];
            while (number > 0) {
                if (digits[number % 10]) {
                    return false;
                }
                digits[number % 10] = true;
                number /= 10;
            }
            return true;
        }
    }

