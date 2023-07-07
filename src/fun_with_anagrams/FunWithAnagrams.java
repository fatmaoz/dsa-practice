package fun_with_anagrams;

import java.util.*;

public class FunWithAnagrams {


    public static void main(String[] args) {
        String []str = {"code", "doce", "ecod", "framer", "frame"};

        System.out.println(funWithAnagrams(Arrays.asList(str)));
    }

    public static List<String> funWithAnagrams(List<String> text) {
        Set<String> set = new HashSet<>();
        List<String> result = new ArrayList<>();

        for (String s : text) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!set.contains(sorted)) {
                set.add(sorted);
                result.add(s);
            }
        }

        Collections.sort(result);
        return result;
    }

}
