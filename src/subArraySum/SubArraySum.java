package subArraySum;

import java.util.List;

public class SubArraySum {
    // sub array sum
    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 2, 3);
        System.out.println(sumOfAllSubarrays(arr));  // Output: 20
    }
    public static int sumOfAllSubarrays(List<Integer> arr) {
        int sum = 0;
        int n = arr.size();

        // Iterate over each element in the list
        for (int i = 0; i < n; i++) {
            // contribute arr[i] * (i + 1) * (n - i) to the sum
            sum += arr.get(i) * (i + 1) * (n - i);
        }

        return sum;
    }
}
