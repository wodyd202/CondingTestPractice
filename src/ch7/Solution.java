package ch7;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

// 원점에 가장 가까운 지점 (K Closest Points to Origin) 
public class Solution {
	public static void main(String[] args) {
		int[][] points = { { 1, 3 }, { -2, 2 } };
		int k = 1;
		int[][] solve = solve(points, k);
		for (int i = 0; i < solve.length; i++) {
			System.out.println(Arrays.toString(solve[i]));
		}
	}

	public static int[][] solve(int[][] points, int k) {
		Queue<int[]> queue = new PriorityQueue<>((a, b) -> {
			return (a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1]);
		});
		for (int[] point : points) {
			queue.add(point);
		}
		int[][] result = new int[queue.size() - 1][];
		for (int i = 0; i < k; i++) {
			result[i] = queue.poll();
		}
		return result;
	}
}
