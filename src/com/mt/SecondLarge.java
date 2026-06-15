package com.mt;

import java.util.Scanner;

public class SecondLarge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Array size :");
		int n=sc.nextInt();
		int num[]=new int[n];
		System.out.println("Enter the Array Element :");
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		SecondLarge.Max(num);
		

}

	private static void Max(int[] num) {
	
		int n=num.length;
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(num[i]>max)
			{
				smax=max;
				max=num[i];
			}
			else if(num[i]>smax && num[i]!=max)
			{
				smax=num[i];
			}
		}
		System.out.println("The second Max Element :"+smax);
	}

}
