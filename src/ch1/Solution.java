package ch1;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 고유한 이메일 문제
public class Solution {
	public static void main(String[] args) {
		String[] emails = {"test.email+james@coding.com","test.e.mail+toto.jane@coding.com","testemail+tom@cod.ing.com"};
		int solve = solve(emails);
		System.out.println(solve);
	}
	
	public static int solve(String[] emails) {
		Set<String> collect = Stream.of(emails)
			.map(email->email.split("@"))
			.map(email->{
				email[0] = email[0].replace(".", "");
				int indexOf = email[0].indexOf("+");
				if(indexOf != -1) {
					email[0] = email[0].substring(0, indexOf);
				}
				return email[0] + email[1];
			})
			.collect(Collectors.toSet());
		return collect.size();
	}
}
