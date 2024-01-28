package first_unique_character;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    public static void main(String[] args) {
        String input = "success";
        char result = firstUniqueCharacter(input);
        System.out.println("Output: " + result);
    }

    /**
     * Question-3 First Unique Character
     * Write a function that returns the first non-repeated character from a string.
     * If all characters are repeated return a space character.
     * EXAMPLE:
     * Input: "success"		output: u
     * Explanation: u and e are non-repeated, u is the first non-repeated character
     *
     *
     */

    public static char firstUniqueCharacter(String str) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (charCount.get(ch) == 1) {
                return ch;
            }
        }

        return ' ';
    }



        public static char firstUniqueCharacterWithArray(String str) {
            int[] charCount = new int[256]; // ASCII Characters, For English you can use [26]

            for (char ch : str.toCharArray()) {
                charCount[ch]++;
            }

            for (char ch : str.toCharArray()) {
                if (charCount[ch] == 1) {
                    return ch;
                }
            }

            return ' ';
        }


}
