package first_non_repeating_vowel;

public class FirstNonRepeatingVowel {
    public static void main(String[] args) {
        System.out.println(findFirstNonRepeatingVowel("leetcode"));
    }

    /**
     * Question-2 First Non-repeating Vowel
     * Given a string, write a method to find the first non-repeating vowel (a, e, i, o, u) in it and
     * return its index. If it doesn't exist, return -1. Assume that all the characters of the String is
     * lowercase.
     * ( Do not use String class functions other than charAt() and length() )
     */

    public static int findFirstNonRepeatingVowel(String s) {
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (isVowel(currentChar)) {
                if (isNonRepeatingVowel(s, currentChar)) {
                    return i;
                }
            }
        }

        return -1;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    private static boolean isNonRepeatingVowel(String s, char vowel) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == vowel) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }

        return count == 1;
    }
}
