package com.mt;

import java.util.Scanner;

public class RotateArray {
	
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
		
		System.out.print("Enter the k:");
		int k=sc.nextInt();
		 System.out.println("Enter the Choice \n1.Left \n2.Right");
		 int c=sc.nextInt();
		 
		 if(c==1) {
			 reverse(num,0,k-1);
			 reverse(num,k,n-1);
			 reverse(num,0,n-1);
		 }
		 else {
			 k = n - k; 
			 reverse(num,0,n-1);
			 reverse(num,0,k-1);
			 reverse(num,k,n-1);
			 
		 }
		 
		 for(int x:num)
		 {
			 System.out.print( x+"  ");
		 }
}

	private static void reverse(int[] num, int start, int end) {
		while(start<end)
		{
			int temp=num[start];
			num[start]=num[end];
			num[end]=temp;
			start++;
			end--;
		}
		
		
		
	}}
