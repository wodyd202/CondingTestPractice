package ch5;

import java.util.Arrays;

// 제로 이동
public class Solution {
	public static void main(String[] args) {
		int[] nums = { 0, 3, 2, 0, 8, 5 };
		int[] solve = solve(nums);
		System.out.println(Arrays.toString(solve));
	}

	public static int[] solve(int[] nums) {
		int zeroCount = 0;
		int nextNumberIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				zeroCount++;
			} else {
				nums[nextNumberIndex++] = nums[i];
			}
		}
		for (int i = 0; i < zeroCount; i++) {
			nums[nextNumberIndex++] = 0;
		}
		return nums;
	}
}
