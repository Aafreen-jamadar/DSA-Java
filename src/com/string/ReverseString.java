package com.string;

import java.util.Scanner;

public class ReverseString {
        public static void main(String[] args) {
			
        	Scanner sc= new Scanner(System.in);
        	System.out.print("Enter the String :");
        	String str=sc.next();
        	ReverseString.reverse(str);
		}

		private static void reverse(String str) {
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
//		Simple form
//		String reverse=new String(chr);
			
//		System.out.println("The Reverse String is: "+reverse);
		System.out.println("The Reverse String is: ");
		for( int i=0;i<chr.length;i++)
		{
			System.out.print(chr[i] );
		}
}}
