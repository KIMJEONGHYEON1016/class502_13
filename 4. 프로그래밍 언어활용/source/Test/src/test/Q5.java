package test;

import java.util.Arrays;

public class Q5 {

    public static void main(String[] args) {
        int[] nums = { 21, 22, 30, 11, 99, 31 };
        nums = reverse(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] reverse(int[] nums) {
        int[] nums2 = new int[nums.length];

        for (int i = 0, j = nums.length - 1; i < nums.length && j >= 0; i++, j--) {
            nums2[i] = nums[j];
        }

        return nums2;
    }
}
