package com.mt;

import java.util.Scanner;

public class PairSum {
	 
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
		System.out.print("ENter target Number :");
		int k=sc.nextInt();
		PairSum.sum(num,k);
		

}

	private static void sum(int[] num,int target) {
		
		int n=num.length;
		int l=0,r=n-1;
		  boolean found = false;
		while(l<r)
		{
			int sum=num[l]+num[r];
			
			if(sum==target) {
				System.out.println("Pair is :"+num[l]+" "+num[r]);
				found=true;
				break;
				
			}
			else if(sum>target)
				r--;
			else
				l++;
		}
		if(!found) {
            System.out.println("No pair exists");
        }
		
	}
}
