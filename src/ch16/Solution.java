package ch16;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		String s = "1111111";
		int[] solution = solution(s);
		System.out.println(Arrays.toString(solution));
	}

	public static int[] solution(String s) {
		int[] answer = {};
		int[] count = { 1, 0 };
		answer = countZero(s, count);
		System.out.println(Arrays.toString(answer));
		return answer;
	}

	private static int[] countZero(String s, int[] count) {
		if (s.equals("1")) {
			return count;
		}
		if (s.indexOf("0") != -1) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '0') {
					count[1]++;
				}
			}
			return countZero(s.replace("0", ""), count);
		} else {
			String binaryString = Integer.toBinaryString(s.length());
			count[0]++;
			return countZero(binaryString, count);
		}
	}
}