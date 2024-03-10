package single_number;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {


    public static void main(String[] args) {
        SingleNumber solution = new SingleNumber();

        int[] nums1 = {2, 2, 1};
        System.out.println(solution.singleNumberWithXOR(nums1));

        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println(solution.singleNumberWithXOR(nums2));
    }

    /**
     * Question-1 Single Number
     * Given a non-empty array of integers nums, every element appears twice except for one.
     * Find that single one.
     * Example 1:
     * Input: nums = [2,2,1]
     * Example 3:
     * Input: nums = [1]
     * Constraints:
     * Output: 1
     * Output: 1
     * Example 2:
     * Input: nums = [4,1,2,1,2]
     * Output: 4
     * 1 <= nums.length <= 3 * 104
     * -3*104 <=nums[i]<=3*104
     * Each element in the array appears twice except for one element which appears only once.
     * Follow-up question: Can you implement a solution with
     * a linear runtime complexity and use only constant extra space?
     * Please, try to test your solution via JUnit and also test your solution here:
     */

    public int singleNumberWithXOR(int[] nums) {

        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

//    0 xor 2 = 2
//    2 xor 2 = 0
//    0 xor 0 = 0

    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        return set.iterator().next();
    }
}
