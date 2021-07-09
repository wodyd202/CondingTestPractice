package ch2;

import java.util.HashSet;
import java.util.Set;

// 보석과 돌
public class Solution {
	public static void main(String[] args) {
		String jew = "aA";
		String stones = "aAAbbb";

		int solve = solve(jew, stones);
		System.out.println(solve);
	}

	public static int solve(String jew, String stones) {
		int result = 0;
		Set<Character> set = new HashSet<>();
		char[] jewArr = jew.toCharArray();
		for(char value : jewArr) {
			set.add(value);
		}
		
		char[] stonesArr = stones.toCharArray();
		for(char value : stonesArr) {
			if(set.contains(value)) {
				result++;
			}
		}
		
		return result;
	}
}
