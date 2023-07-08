package almost_Equal;
import java.util.*;

public class almostEqual {



        public static void main(String[] args) {
            List<String> s = Arrays.asList("aaa", "aab");
            List<String> t = Arrays.asList("bbabbc", "abb");
            List<String> result = areAlmostEquivalent(s, t);
            System.out.println(result);  // Output: [YES, NO]
        }

        public static List<String> areAlmostEquivalent(List<String> s, List<String> t) {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < s.size(); i++) {
                int[] sCount = new int[26];
                int[] tCount = new int[26];
                for (char c : s.get(i).toCharArray()) {
                    sCount[c - 'a']++;
                }
                for (char c : t.get(i).toCharArray()) {
                    tCount[c - 'a']++;
                }
                String res = "YES";
                for (int j = 0; j < 26; j++) {
                    if (Math.abs(sCount[j] - tCount[j]) > 3) {
                        res = "NO";
                        break;
                    }
                }
                result.add(res);
            }
            return result;
        }
    }

