package two_sum;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {16, 3, 11, 5, 15};
        int target = 8;

        int[] result = findTwoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }

    /**
     * Question-2 Two Sum
     * Given an array of integers nums and an integer target, return the two numbers such that they add
     * up to target.
     * Assume that each input would have exactly one solution, and you should not use the same
     * element twice.
     * You can return the answer in any order.
     * No solution will return empty array.
     * Please, use two pointer strategy to solve this problem
     * (Hint : you should sort the input first).
     * Example:
     * Input: nums = [16, 3, 11, 5, 15], target = 8
     * Output: [3, 5]
     * Explanation: Because nums[1] + nums[3] => 3 + 5 = 8, we return [3, 5].
     */
    public static int[] findTwoSum(int[] nums, int target) {
        Arrays.sort(nums);
        
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[]{nums[left], nums[right]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[0];
    }


}
