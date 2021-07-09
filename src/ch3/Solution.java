package ch3;

public class Solution {
	public static void main(String[] args) {
		String s = "8F3Z-2e-9-w";
		int k = 4;
		String solve = solve(s, k);
		System.out.println(solve);
	}

	public static String solve(String s, int k) {
		s = s.toUpperCase();
		s = s.replace("-", "");
		StringBuilder resultStr = new StringBuilder(s);
		for (int i = k; i < s.length(); i += k) {
			resultStr.insert(s.length() - i, "-");
		}
		return resultStr.toString();
	}
}
