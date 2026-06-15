package com.mt;

import java.util.Scanner;

public class PrefixSum {

	 static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Enter the Array size :");
		int n=sc.nextInt();
		int num[]=new int[n];
		System.out.println("Enter the Array Element :");
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
			PrefixSum.sum(num);
		

}

	private static void sum(int[] num) {
		int n=num.length;
		int sum[]=new int[n];
		sum[0]=num[0];
		for(int i=1;i<n;i++)
		{
			sum[i]=sum[i-1]+num[i];
		}
		int add;
		System.out.println("Enter Left :");
		int L=sc.nextInt();
		System.out.println("Enter Right :");
		int R=sc.nextInt();
		if(L==0)
		{
			add=sum[R];
		}
		else {
			add=sum[R]-sum[L-1];
		}
		
		System.out.println("The SUm is :" +add);
			
		
	}

}
