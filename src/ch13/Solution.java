package ch13;

import java.util.Arrays;
import java.util.Stack;

// 일일 온도
public class Solution {
	public static void main(String[] args) {
		int[] nums = { 73, 74, 75, 71, 69, 72, 76, 73 };
		int[] solve = solve_2(nums);
		System.out.println(Arrays.toString(solve));
	}

	public static int[] solve_2(int[] nums) {
		int[] result = new int[nums.length];
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < nums.length; i++) {
			while(!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
				int index = stack.pop();
				result[index] = i - index;
			}
			stack.push(i);
		}
		return result;
	}

	public static int[] solve_1(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int nowTemperature = nums[i];
			for (int j = i; j < nums.length; j++) {
				if (nums[j] > nowTemperature) {
					result[i] = j - i;
					break;
				}
			}
		}
		return result;
	}
}
