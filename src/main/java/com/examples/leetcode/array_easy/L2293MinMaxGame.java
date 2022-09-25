package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/min-max-game/ */
public class L2293MinMaxGame {

    public int minMaxGame(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] newNums = new int[nums.length / 2];
        for (int i = 0; i < nums.length / 2; ++i) {
            if (i % 2 == 0) {
                newNums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
            } else {
                newNums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
            }
        }
        return minMaxGame(newNums);
    }
}