package isPossible;

public class isPossible2 {
    public static void main(String[] args) {
        System.out.println(isPossible(2,2,2,100));  // Output: Yes
    }

        public static String isPossible(int a, int b, int c, int d) {
            if (a == c && b == d) {
                return "Yes";
            }
            if (c < a || d < b) {
                return "No";
            }
            return (isPossible(a, b, c-d, d).equals("Yes") || isPossible(a, b, c, d-c).equals("Yes")) ? "Yes" : "No";
        }

}
