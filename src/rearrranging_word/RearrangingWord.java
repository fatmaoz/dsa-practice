package rearrranging_word;

public class RearrangingWord {

    public static void main(String[] args) {
        System.out.println(nextPermutation("baca"));
    }


    public static String nextPermutation(String word) {
        char[] chars = word.toCharArray();
        int n = chars.length;

        int i = n - 2;
        while (i >= 0 && chars[i] >= chars[i + 1]) {
            i--;
        }

        if (i < 0) {
            return "no answer";
        }

        int j = n - 1;
        while (j > i && chars[j] <= chars[i]) {
            j--;
        }

        swap(chars, i, j);
        reverse(chars, i + 1, n - 1);

        return new String(chars);
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    private static void reverse(char[] chars, int i, int j) {
        while (i < j) {
            swap(chars, i, j);
            i++;
            j--;
        }
    }
}
