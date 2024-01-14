package count_duplicate_chars;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateChars {

    public static void main(String[] args) {
        System.out.println(countDuplicates("abcde"));
        System.out.println(countDuplicates("aabbcde"));
        System.out.println(countDuplicates("aabBcde"));
        System.out.println(countDuplicates("indivisibility"));
        System.out.println(countDuplicates("Indivisibilities"));
        System.out.println(countDuplicates("aA11"));
        System.out.println(countDuplicates("ABBA"));
    }


    /**
     * Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric
     * digits that occur more than once in the input string.
     * The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
     * ****************************
     * Example:
     * "abcde" -> 0 # no characters repeats more than once.
     * "aabbcde" -> 2 # 'a' and 'b'
     * "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
     * "indivisibility" -> 1 # 'i' occurs six times.
     * "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice.
     * "aA11" -> 2 # 'a' and '1'
     * "ABBA" -> 2 # 'A' and 'B' each occur twice.
     */


    public static int countDuplicates(String inputStr) {

        Map<Character, Integer> charCount = new HashMap<>();

        for (char character : inputStr.toCharArray()) {
            char chars = Character.toLowerCase(character);
            if (Character.isLetterOrDigit(chars)) {
                charCount.put(chars, charCount.getOrDefault(chars, 0) + 1);
            }
        }

        int duplicateCount = 0;
        for (int count : charCount.values()) {
            if (count > 1) {
                duplicateCount++;
            }
        }

        return duplicateCount;
    }


}
