public class Main {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(solution(new int[]{1, 3, 6, 4, 1, 2}));// Output: 5
        System.out.println(solution2("00900"));// Output: 9876543210
        System.out.println(solution2("0000"));// Output: 9876543210
        System.out.println(solution2("39878"));// Output: 9876543210
        System.out.println(solution2("54321"));// Output: 9876543210
    }

    public static int solution(int[] A) {
        boolean[] present = new boolean[A.length + 1];
        for (int i = 0; i < A.length; i++) {
            // If A[i] is in the range of possible values...
            if (A[i] > 0 && A[i] <= A.length) {
                // ... we mark it as present.
                present[A[i] - 1] = true;
            }
        }
        for (int i = 0; i < present.length; i++) {
            if (!present[i]) {
                return i + 1;
            }
        }
        return A.length + 1;
    }

    public static String solution2(String s) {
        int[] counts = new int[10];

        // Count the frequency of each digit
        for (char c : s.toCharArray()) {
            counts[c - '0']++;
        }

        // If all digits are zeros, then return "0"
        if (counts[0] == s.length()) {
            return "0";
        }

        // Create the largest palindromic number by trying to use the largest digits
        for (int digit = 9; digit > 0; digit--) {
            if (counts[digit] > 0) {
                StringBuilder result = new StringBuilder();

                // Append the digit as many times as it appears, ignoring zeros
                for (int i = 0; i < counts[digit]; i++) {
                    result.append(digit);
                }

                // If the count of the digit is even, we can create a full palindrome
                if (counts[digit] % 2 == 0) {
                    return result.toString();
                }

                // If the count of the digit is odd, we can create a palindrome using one instance of the digit in the middle
                // and then use other available digits to complete the palindrome
                String palindrome = createPalindrome(result.toString(), counts);
                if (palindrome != null) {
                    return palindrome;
                }
            }
        }

        return "0";
    }

    private static String createPalindrome(String s, int[] counts) {
        int len = s.length();
        StringBuilder result = new StringBuilder();

        // Append half of the string
        result.append(s.substring(0, len / 2));

        // Append middle digit if the length is odd
        if (len % 2 != 0) {
            result.append(s.charAt(len / 2));
        }

        // Check for any remaining smaller digits that can still be used to complete the palindrome
        for (int i = Integer.parseInt(s.substring(0, 1)) - 1; i > 0; i--) {
            for (int j = 0; j < counts[i] / 2; j++) {
                result.insert(0, i);
                result.append(i);
            }
        }

        // Append the other half of the string to create the full palindrome
        result.append(new StringBuilder(s.substring(0, len / 2)).reverse());

        return result.toString();
    }
}



