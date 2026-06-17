package com.string;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateChar {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String :");
		String str = sc.next();
		RemoveDuplicateChar.duplicate(str);
	}

	private static void duplicate(String str) {
	int n=str.length();
	
	StringBuilder build= new StringBuilder();
	HashSet<Character> set=new HashSet<Character>();
	
	for(int i=0;i<n;i++)
	{
		 char ch=str.charAt(i);
		if(!set.contains(ch))
		{
			build.append(ch);
			set.add(ch);
			
		}
	}
	 System.out.println("After removing duplicates: " + set);
		
	}


}
