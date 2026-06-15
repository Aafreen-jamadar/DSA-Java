package com.mt;

import java.util.Scanner;

public class ContainerWithWater {
	
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
		ContainerWithWater.water(num);
		

}

	private static void water(int[] num) {
	int n=num.length;
	int left=0,right=n-1,maxWater=0;
	while(left<right)
	{
		int water=Math.min(num[left], num[right])*(right-left);
		maxWater=Math.max(maxWater, water);
		
		if(num[left]<num[right])
		{
			left++;
		}
		else
			right--;
		
	}
		System.out.println("Max Water :"+maxWater);
	
		
	}


}
