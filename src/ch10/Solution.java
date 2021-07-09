package ch10;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
	public static void main(String[] args) {
		int[][] intervals = { { 1, 4 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		int[][] solve = solve(intervals);
		for (int[] val : solve) {
			System.out.println(Arrays.toString(val));
		}
	}

	private static int[][] solve(int[][] intervals) {
		if (intervals.length == 0)
			return new int[0][];
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
		int start = intervals[0][0];
		int end = intervals[0][1];
		Queue<int[]> queue = new PriorityQueue<>((a, b) -> a[0] - b[0]);

		for (int[] val : intervals) {
			if (end > val[0]) {
				end = Math.max(end, val[1]);
			} else {
				queue.add(new int[] { start, end });
				start = val[0];
				end = val[1];
			}
		}
		queue.add(new int[] { start, end });
		return queue.toArray(new int[0][]);
	}
}
