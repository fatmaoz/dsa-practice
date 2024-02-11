package missing_number;

public class MissingNumber {

    public static void main(String[] args) {
        int[] nums1 = {3, 0, 1};
        System.out.println("Example 1 Output: " + missingNumberWithXOR(nums1));

        int[] nums2 = {0, 1};
        System.out.println("Example 2 Output: " + missingNumber(nums2));

        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("Example 3 Output: " + missingNumber(nums3));
    }

    /**
     * Question-1 Missing Number
     * Given an array nums containing n distinct numbers in the range [0, n], return the only number in
     * the range that is missing from the array.
     * Example 1:
     * Input: nums = [3, 0, 1]
     * Output: 2
     * Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0, 3]. 2 is the missing
     * number in the range since it does not appear in nums.
     * Example 2:
     * Input: nums = [0, 1]
     * Output: 2
     * Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0, 2]. 2 is the missing
     * number in the range since it does not appear in nums.
     * Example 3:
     * Input: nums = [9, 6, 4, 2, 3, 5, 7, 0, 1]
     * Output: 8
     * Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0, 9]. 8 is the missing
     * number in the range since it does not appear in nums.
     * Constraints:
     * n == nums.length
     * 1 <= n <= 104
     * 0 <= nums[i] <= n
     * All the numbers of nums are unique.
     * Follow up: Could you implement a solution using only O(1) extra space complexity and O(n)
     * runtime complexity?
     */
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }
        
        return expectedSum - actualSum;
    }

    /**
     * XOR (exclusive or) operation is a logical operation performed on each pair of corresponding bits.
     * It results in a 1 if the bits are different and 0 if they are the same. The XOR operation follows these rules:
     *
     * 0 XOR 0 = 0
     * 0 XOR 1 = 1
     * 1 XOR 0 = 1
     * 1 XOR 1 = 0
     * XOR can also be thought of as a "flip-flop" operation.
     * If you XOR a number with itself or an even number of times, the result is 0.
     * If XORed an odd number of times, it retains the original value.
     *
     * For example, if you have an array with numbers and one of them is repeated an even number of times while
     * the others are repeated an odd number of times, applying XOR to all the numbers will "cancel out" the repeated ones,
     * leaving you with the unique number.
     *
     * Example:
     *
     * Array: [1, 2, 3, 4, 1, 2, 4]
     * XOR operation: 1 XOR 2 XOR 3 XOR 4 XOR 1 XOR 2 XOR 4 = 3
     * In this example, the unique number is 3, as the repeated numbers cancel each other out through XOR.
     * This concept is often used to find the missing number in an array where all other numbers appear an even number of times.
     */
    public static int missingNumberWithXOR(int[] nums) {
        int n = nums.length;

        int result = 0;
        for (int i = 0; i <= n; i++) {
            result ^= i;
        }

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }


}
