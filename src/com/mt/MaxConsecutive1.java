package com.mt;

import java.util.Scanner;

public class MaxConsecutive1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Element :");
		int n=sc.nextInt();
		int num[]=new int[n];
		System.out.println("Enter the Array Element :");
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		MaxConsecutive1.max(num);
		

}

	private static void max(int[] num) {
		int n=num.length;
		int count=0,maxCount=0;
		for(int i=0;i<n;i++)
		{
			if(num[i]==1)
			{
				count++;
				maxCount=Math.max(maxCount, count);
			}
			else {
				count=0;
			}
		}
			
		 System.out.println("Max Consecutive 1s: " + maxCount);
	}

}
