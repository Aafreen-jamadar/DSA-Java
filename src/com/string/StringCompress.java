package com.string;

import java.util.Scanner;

public class StringCompress {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String :");
		String str = sc.next();
		StringCompress.compress(str);
	}

	private static void compress(String str) {
		
		int count=1,n=str.length();
		StringBuilder result=new StringBuilder();
		
		for(int i=1;i<=n;i++)
		{
			if(i<n&& str.charAt(i)==str.charAt(i-1))
			{
				count++;
			}
			else {
				result.append(str.charAt(i-1));
				result.append(count);
				count=1;
			}
		}
		System.out.println("Compressed: "+result);
		
	}

}
