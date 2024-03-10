package move_zeros;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        MoveZeroes solution = new MoveZeroes();

        int[] nums1 = {0, 1, 0, 0, 0, 1, 1, 11, 1, 3, 12};
        solution.moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = {0};
        solution.moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2));
    }

    /**
     * Question-1 Move Zeroes
     * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     * Note that you must do this in-place without making a copy of the array.
     * Example 1:
     * Input: nums = [0, 1, 0, 3, 12]
     * Example 2: Input: nums = [0]
     * Constraints:
     * • 1 <= nums.length <= 104
     * • -231 <= nums[i] <= 231 - 1
     * Output: [1, 3, 12, 0, 0] Output: [0]
     * Follow up: Could you minimize the total number of operations done?
     * Please, test your solution here: https://leetcode.com/problems/move-zeroes/
     */


    public void moveZeroes(int[] nums) {
        int index = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }

        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
