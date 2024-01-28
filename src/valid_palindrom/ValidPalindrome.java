package valid_palindrom;

public class ValidPalindrome {

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPalindrome("Do geese see God?")); // Output: true
        System.out.println(isPalindrome("level")); // Output: true
        System.out.println(isPalindrome("Was it a car or a cat I saw?")); // Output: true
        System.out.println(isPalindrome("A brown fox jumping over")); // Output: false
    }


    /**
     * Question-2 Valid Palindrome
     * Write a function that accepts a string and determines whether it is a palindrome, ignoring non- alphanumeric characters and case and returns true if it is palindrome.
     * (A string is said to be palindrome if it reads the same backward as forward, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters). Examples:
     * Input: Do geese see God?
     * Input: Was it a car or a cat I saw? Input: A brown fox jumping over Constraints:
     * Output: True Output: True Output: False
     * • 1<=s.length<=2*105
     * • string consists only of printable ASCII characters.
     */
    public static boolean isPalindrome(String string) {

        string = string.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0, right = string.length() - 1;

        while (left < right) {
            if (string.charAt(left) != string.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
