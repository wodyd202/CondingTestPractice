package ch17;

public class Solution {
	public static void main(String[] args) {
		long[] numbers = new long[100000];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1; 
		}
		long[] solution = solution(numbers);
//		System.out.println(Arrays.toString(solution));
	}

	public static long[] solution(long[] numbers) {
		long[] result = new long[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			result[i] = calcaulte(Long.toBinaryString(numbers[i]), numbers[i]);
		}
		return result;
	}

	private static long calcaulte(String originBinary, long number) {
		if (number % 2 == 0) {
			return number + 1;
		}
		if (!originBinary.contains("0")) {
			originBinary = "10" + originBinary.substring(1, originBinary.length());
			return Long.parseLong(originBinary, 2);
		}
		int indexOf = originBinary.lastIndexOf("0");
		originBinary = originBinary.substring(0, indexOf) + "10"+ originBinary.substring(indexOf + 2, originBinary.length());
		return Long.parseLong(originBinary, 2);
	}
}
