package com.mt;

import java.util.Scanner;

public class KaddensAlgo {
	public static void Max(int[]num) {
		int n=num.length;
		long maxSum=Long.MIN_VALUE;
		int sum=0;
		for(int i=0;i<n;i++) {
			
			sum=sum+num[i];
			if(sum>maxSum) 
				maxSum=sum;
			
			if(sum<0)
				sum=0;
			
	
	}
		System.out.println("The Maximum Sum of Array is : "+ maxSum);
	
	}
	
	
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
		KaddensAlgo.Max(num);
		

}
}


