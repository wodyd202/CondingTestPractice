package ch15;

// 빗물 잡기
public class Solution {
	public static void main(String[] args) {
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int solve = solve(height);
		System.out.println(solve);
	}

	private static int solve(int[] height) {
		int result = 0;
		if (height == null || height.length == 0) {
			return result;
		}

		int len = height.length;
		int[] left = new int[len];
		int[] right = new int[len];

		int max = height[0];
		left[0] = height[0];

		for (int i = 1; i < len; i++) {
			if (height[i] > max) {
				max = height[i];
			}
			left[i] = max;
		}

		max = height[len - 1];
		right[len - 1] = max;

		for (int i = len - 2; i >= 0; i--) {
			if (height[i] > max) {
				max = height[i];
			}
			right[i] = max;
		}

		for (int i = 0; i < len; i++) {
			result += Math.min(left[i], right[i]) - height[i];
		}

		return result;
	}
}
