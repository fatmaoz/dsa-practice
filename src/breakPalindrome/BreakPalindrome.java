package breakPalindrome;

public class BreakPalindrome {


        public static void main(String[] args) {
            System.out.println(breakPalindrome("aaabbaaa"));  // Output: aaaabaaa
            System.out.println(breakPalindrome("aaaaabaaaaa"));  // Output: IMPOSSIBLE
        }

        public static String breakPalindrome(String palindromeStr) {
            if (palindromeStr.length() == 1) {
                return "IMPOSSIBLE";
            }

            char[] chars = palindromeStr.toCharArray();
            for (int i = 0; i < chars.length / 2; i++) {
                if (chars[i] != 'a') {
                    chars[i] = 'a';
                    return new String(chars);
                }
            }

            // If we've reached this point, all characters are 'a'
            if (chars[chars.length - 1] == 'a') {
                return "IMPOSSIBLE";
            }

         chars[chars.length - 1] = 'b';// can be removed
            return new String(chars);
        }
    }




