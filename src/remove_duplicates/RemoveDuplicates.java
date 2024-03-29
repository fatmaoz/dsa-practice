package remove_duplicates;

public class RemoveDuplicates {

    public static void main(String[] args) {
        RemoveDuplicates solution = new RemoveDuplicates();
        
        int[] nums1 = {1, 1, 2};
        int k1 = solution.removeDuplicates(nums1);
        System.out.print(k1 + ", nums = [");
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i]);
            if (i < k1 - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]"); // 2, nums = [1, 2]

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = solution.removeDuplicates(nums2);
        System.out.print(k2 + ", nums = [");
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i]);
            if (i < k2 - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]"); // 5, nums = [0, 1, 2, 3, 4]
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int index = 1;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                nums[index++] = nums[i];
            }
        }

        return index;
    }

    /**
     * Question-2 Remove Duplicates from Sorted Array
     * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
     * The relative order of the elements should be kept the same.
     * Since it is impossible to change the length of the array in Java,
     * you must instead have the result be placed in the first part of the array nums.
     * More formally, if there are k elements after removing the duplicates,
     * then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
     * Return k after placing the final result in the first k slots of nums.
     * Do not allocate extra space for another array. You must do this by modifying the input array in-place with
     * O(1) extra memory.
     * Example 1:
     * Input: nums = [1, 1, 2] Output: 2, nums = [1, 2,_]
     * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
     * It does not matter what you leave beyond the returned k (hence they are underscores).
     * Example 2:
     * Input:nums=[0,0,1,1,1,2,2,3,3,4] Output:5,nums=[0,1,2,3,4,_,_,_,_,_]
     * Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
     * It does not matter what you leave beyond the returned k (hence they are underscores).
     * Constraints:
     * 1 <= nums.length <= 3 * 104
     * -100 <= nums[i] <= 100
     * nums is sorted in non-decreasing order.
     * Please, test your solution here: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
     */



}
