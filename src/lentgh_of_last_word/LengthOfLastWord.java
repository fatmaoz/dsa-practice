package lentgh_of_last_word;

public class LengthOfLastWord {

    public static void main(String[] args) {

        // Test cases
        String s1 = "Hello World";
        System.out.println(lengthOfLastWord(s1));

        String s2 = " flyme to themoon ";
        System.out.println(lengthOfLastWord(s2));

        String s3 = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s3));
    }


    /**
     * Question-1 Length of Last Word
     * Week-09 Algo Questions
     * Given a string s consisting of words and spaces, return the length of the last word in the string.
     * A word is a maximal substring consisting of non-space characters only.
     * Example 1:
     * Input: s = "Hello World" Output: 5 Explanation: The last word is "World" with length 5.
     * Example 2:
     * Input:s=" flyme to themoon " Output:4 Explanation: The last word is "moon" with length 4.
     * Example 3:
     * Input: s = "luffy is still joyboy" Output: 6 Explanation: The last word is "joyboy" with length 6.
     * Constraints:
     * 1 <= s.length <= 104
     * s consists of only English letters and spaces ' '. There will be at least one word in s.
     * Please, test your solution here: https://leetcode.com/problems/length-of-last-word/

     */

    public static  int lengthOfLastWord(String input) {
        input = input.trim();
        
        int lastSpaceIndex = input.lastIndexOf(' ');


        return input.length() - lastSpaceIndex - 1;
    }


}
