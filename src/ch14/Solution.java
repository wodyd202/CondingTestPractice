package ch14;

// SubArray 최대값
public class Solution {
	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int solve = solve(nums);
		System.out.println(solve);
	}

	private static int solve(int[] nums) {
		int currentMax = nums[0];
		int allMax = nums[0];
		for (int i = 1; i < nums.length; i++) {
			currentMax = Math.max(nums[i], currentMax + nums[i]);
			allMax = Math.max(currentMax, allMax);
		}
		return allMax;
	}
}
