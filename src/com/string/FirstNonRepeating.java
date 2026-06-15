package com.string;

import java.util.Scanner;

public class FirstNonRepeating {
	
	  public static void main(String[] args) {
			
	      	Scanner sc= new Scanner(System.in);
	      	System.out.print("Enter the String :");
	      	String str=sc.next().toLowerCase();
	      	FirstNonRepeating.repeat(str);
			}

	  private static void repeat(String str) {
		int freq[]=new int[26];
		
		for(int i=0;i<str.length();i++)
		{
			freq[str.charAt(i)-'a']++;
		}
		
		for(int i=0;i<str.length();i++)
		{
			if(freq[str.charAt(i)-'a']==1)
			{
				System.out.println("First Non Repeating Character is :" +str.charAt(i));
				return;
			}
		}
		
		System.out.println("NO non Repeating Character");
	  }

}
