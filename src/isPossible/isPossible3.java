package isPossible;

import java.util.stream.Stream;

public class isPossible3 {
    public static void main(String[] args) {
        System.out.println(isPossible(2, 2, 2, 100));  // Output: Yes
    }


    public static String isPossible(int a, int b, int c, int d) {
        return Stream.iterate(new int[]{a, b, c, d}, arr -> {
                    int[] updated = new int[]{arr[0], arr[1], arr[2], arr[3]};
                    if (arr[0] == arr[2] && arr[1] == arr[3]) {
                        updated[0] = arr[2];
                        updated[1] = arr[3];
                    } else if (arr[2] >= arr[3]) {
                        updated[2] = arr[2] - arr[3];
                    } else {
                        updated[3] = arr[3] - arr[2];
                    }
                    return updated;
                })
                .anyMatch(arr -> arr[0] == arr[2] && arr[1] == arr[3]) ? "Yes" : "No";
    }

}

