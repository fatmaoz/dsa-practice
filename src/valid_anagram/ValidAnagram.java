package valid_anagram;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
        System.out.println(isAnagram("asdf", "asdd"));
    }

    /**
     * Week-06 Algo Questions
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
     * typically using all the original letters exactly once.
     * Constraints:
     * 1 <= s.length, t.length <= 5 * 104
     * s and t consist of lowercase English letters.
     * Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
     * Example 1:
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     * Example 2:
     * Input: s = "rat", t = "car"
     * Output: false
     */

    public static boolean isAnagram(String source, String target) {
        if (source.length() != target.length()) {
            return false;
        }

        char[] sArray = source.toCharArray();
        char[] tArray = target.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }
}
