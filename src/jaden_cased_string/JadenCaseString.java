package jaden_cased_string;

public class JadenCaseString {

    public static void main(String[] args) {
        String input = "How can mirrors be real if our eyes aren't real";
        String jadenCased = jaden(input);
        System.out.println("Not Jaden-Cased: " + input);
        System.out.println("Jaden-Cased: " + jadenCased);
    }

    /**
     * Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013).
     * Jaden is also known for some of his philosophy that he delivers via Twitter.
     * When writing on Twitter, he is known for almost always capitalizing every word.
     * For simplicity, you'll have to capitalize each word, check out how contractions are expected to be in the example below.
     * Your task is to write a method that converts strings to how they would be written by Jaden Smith.
     * The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.
     * Note that this function should a return empty string for an empty string or null.
     * **************
     * Example:
     * Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
     * Jaden-Cased: "How Can Mirrors Be Real If Our Eyes Aren't Real"
     */

    public static String jaden(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result
                    .append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
            }
        }

        return result.toString().trim();
    }


}
