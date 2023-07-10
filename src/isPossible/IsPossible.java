package isPossible;

public class IsPossible {

        public static void main(String[] args) {
            System.out.println(isPossible(2,2,2,100));  // Output: Yes
        }


        public static String isPossible(int a, int b, int c, int d) {

            while (true) {
            if (a == c && b == d) {
                return "Yes";
            }
            if (c < a || d < b) {
                return "No";
            }
            if (c >= d) {
                c = c - d;
            } else {
                d = d - c;
            }
        }
    }
}


