package ch8;

import java.util.Arrays;

// 미팅룸(Meeting Room) 
public class Solution {

	public static void main(String[] args) {
		int[][] intervals = { { 6, 10 }, { 1, 3 } };
		boolean solve = solve(intervals);
		System.out.println(solve);
	}

	public static boolean solve(int[][] intervals) {
		if (intervals.length == 0)
			return true;

		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
		for (int i = 0; i < intervals.length - 1; i++) {
			int frontEnd = intervals[i][1];
			int backStart = intervals[i + 1][0];

			if (frontEnd > backStart) {
				return false;
			}
		}
		return true;
	}
}
