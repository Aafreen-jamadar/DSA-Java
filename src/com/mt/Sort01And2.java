package com.mt;

import java.util.Scanner;

public class Sort01And2 {
	 public static void main(String[] args) {
			
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Array Element :");
	int n=sc.nextInt();
	int num[]=new int[n];
	System.out.println("Enter the Array Element :");
	for(int i=0;i<n;i++)
	{
		num[i]=sc.nextInt();
	}
	Sort01And2.sort(num);
}

	 private static void sort(int[] num) {
		int n=num.length;
		int low=0,mid=0,high=n-1;
		while(mid<=high)
		{
			
			if(num[mid]==0)
			{
				int temp=num[low];
				num[low]=num[mid];
				num[mid]=temp;
				low++;
				mid++;
			}
			else if(num[mid]==1)
			{
				mid++;
			
			}
			else {
				int temp=num[mid];
				num[mid]=num[high];
				num[high]=temp;
				
				high--;
			}
			
		}
		
		System.out.println("Te sorted Array is :");
		for(int i=0;i<n;i++)
		{
			System.out.println(num[i]);
		}
	 }
}
