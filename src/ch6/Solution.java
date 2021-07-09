package ch6;

import java.util.PriorityQueue;

// k번째 제일큰 원소 (Kth Largest Element In An Array)
public class Solution {
	public static void main(String[] args) {
		int[] nums = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
		int k = 4;
		int solve = solve(nums, k);
		System.out.println(solve);
	}

	public static int solve(int[] nums, int k) {
		PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
		for (int num : nums) {
			queue.add(num);
		}
		int result = 0;
		for (int i = 0; i < k; i++) {
			result = queue.poll();
		}
		return result;
	}
}
