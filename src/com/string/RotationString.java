package com.string;

import java.util.Scanner;

public class RotationString {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String 1 :");
		String str1 = sc.next();
		System.out.print("Enter the String 2:");
		String str2 = sc.next();
		  if(rotation(str1, str2)) {
	            System.out.println(str2 + " is a rotation of " + str1 + " ");
	        } else {
	            System.out.println(str2 + " is NOT a rotation of " + str1 + " ");
	        }
	}

	private static boolean rotation(String str1, String str2) {
	
		
		if(str1.length() != str2.length()) {
			return false;
			
		}
			String combined=str1+str1;
			return combined.contains(str2);
			
		}
	
	
}
