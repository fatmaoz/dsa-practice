package BalanceOrNot;
import java.util.*;

public class BalanceorNot {
    public static void main(String[] args) {
        List<String> expressions = new ArrayList<>();
        expressions.add("<>>>");
        expressions.add("<>>>>");
        balancedOrNot(expressions, Arrays.asList(2, 2)).forEach(System.out::println);  // Output: true, false
    }
    public static List<Integer> balancedOrNot(List<String> expressions, List<Integer> maxReplacements) {
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < expressions.size(); i++) {
            String expression = expressions.get(i);
            int maxReplacement = maxReplacements.get(i);
            int balanceStatus = checkBalanceStatus(expression, maxReplacement);
            results.add(balanceStatus);
        }

        return results;
    }

    private static int checkBalanceStatus(String expression, int maxReplacement) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (c == '<') {
                stack.push(c);
            } else if (c == '>') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else if (maxReplacement > 0) {
                    maxReplacement--;
                } else {
                    return 0;  // Unbalanced
                }
            }
        }

        if (stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

}
