package ch9;

import java.util.PriorityQueue;
import java.util.Queue;

// 미팅룸2(Meeting Room2) 
public class Solution {
	public static void main(String[] args) {
		int[][] intervals = { { 6, 10 }, { 1, 3 } };
		int solve = solve(intervals);
		System.out.println(solve);
	}

	public static int solve(int[][] intervals) {
		if (intervals.length == 0)
			return 0;

		Queue<int[]> queue = new PriorityQueue<>((a, b) -> a[0] - b[0]);

		int start = intervals[0][0];
		int end = 0;

		for (int i = 0; i < intervals.length - 1; i++) {
			end = intervals[i][1];
			if (end > intervals[i + 1][0]) {
				queue.add(new int[] { start, end });
				start = intervals[i + 1][0];
			}
		}

		queue.add(new int[] { start, intervals[intervals.length - 1][1] });
		return queue.size();
	}
}
