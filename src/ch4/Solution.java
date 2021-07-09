package ch4;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		int[] k = { 1, 2, 3 };
		int[] solve = solve(k);
		System.out.println(Arrays.toString(solve));
	}

	public static int[] solve(int[] k) {
		for (int i = k.length - 1; i >= 0; i--) {
			k[i]++;
			if (k[i] == 10) {
				k[i] = 0;
			} else {
				return k;
			}
		}
		int[] result = new int[k.length + 1];
		result[0] = 1;
		return result;
	}
}
