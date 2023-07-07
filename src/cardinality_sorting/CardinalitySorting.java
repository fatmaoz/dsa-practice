package cardinality_sorting;

import java.util.*;

public class CardinalitySorting {
    public static void main(String[] args) {

        System.out.println(cardinalitySort(Arrays.asList(1,2,3,4)));
    }


    public static List<Integer> cardinalitySort(List<Integer> nums) {

        List<Integer> result = new ArrayList<>(nums);

        Collections.sort(result, Comparator
                .comparingInt((Integer num) -> countBinaryOnes(num))
                .thenComparingInt(num -> num));

        return result;


    }

    private static int countBinaryOnes(int num) {

        String s = Integer.toBinaryString(num);

        char[] ch = s.toCharArray();
        Integer countOne = 0;
        for (char i = 0; i < ch.length; i++) {
            if (ch[i] == '1') countOne++;
        }

        return countOne;


    }
}
