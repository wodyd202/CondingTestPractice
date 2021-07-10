package ch12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 두개 합(Two Sum)
public class Solution {
	public static void main(String[] args) {
		int[] nums = { 3, 2, 4};
		int target = 6;
		int[] solve = solve(nums, target);
		System.out.println(Arrays.toString(solve));
	}

	public static int[] solve(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				return new int[] { map.get(nums[i]), i + 1 };
			} else {
				map.put(target - nums[i], i + 1);
			}
		}
		return nums;
	}
}
