package com.string;

import java.util.Scanner;

public class Anagram {
	  public static void main(String[] args) {
			
      	Scanner sc= new Scanner(System.in);
      	System.out.print("Enter the String 1:");
      	String str=sc.next().toLowerCase();
      	System.out.print("Enter the String 2:");
      	String str1=sc.next().toLowerCase();
      	Anagram.anagram(str,str1);
		}

	  private static void anagram(String str, String str1) {
		int fre[]=new int[26];
		if(str.length()!=str1.length())
		{
			System.out.println("Not Anagram");
			return;
		}
		
		for(int i=0;i<str.length();i++)
		{
			fre[str.charAt( i)-'a']++;
			fre[str1.charAt(i)-'a']--;
			
		}
		boolean found=true;
		for(int i=0;i<26;i++)
		{
			if(fre[i]!=0)
			{
				found=false;
				break;
			}
		}
		

	      if (found) {
	          System.out.println("Yes, Anagram");
	      } else {
	          System.out.println("Not Anagram");
	      }
		
	  }

}
