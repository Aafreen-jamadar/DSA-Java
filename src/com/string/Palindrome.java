package com.string;

import java.util.Scanner;

public class Palindrome {
	  public static void main(String[] args) {
			
      	Scanner sc= new Scanner(System.in);
      	System.out.print("Enter the String :");
      	String str=sc.next();
      	Palindrome.palindrom(str);
		}

	  private static void palindrom(String str) {
		  String org=str;
		  char[] chr=str.toCharArray();
			int left=0,right=chr.length-1;
			while(left<right)
			{
				char temp=chr[left];
				chr[left]=chr[right];
				chr[right]=temp;
				left++;
				right--;
			}
			String rev= new String(chr);
			if(org.equals(rev))
			{
				System.out.println("The given String is Palindrom");
			}
			else {
				System.out.println("The given String is  Not Palindrom");
			}
		
	  }
}
