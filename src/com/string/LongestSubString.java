package com.string;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String :");
		String str = sc.next();
		LongestSubString.string(str);
	}

	private static void string(String str) {
		int n = str.length();
		HashSet<Character> set = new HashSet<>();
		int left = 0, maxlen = 0;
		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);
			while (set.contains(ch)) {
				set.remove(str.charAt(left));
				left++;
			}
			set.add(ch);
			maxlen = Math.max(maxlen, i - left + 1);
		}
		System.out.println("Longest SubString length with No repeating: " + maxlen);
	}
}