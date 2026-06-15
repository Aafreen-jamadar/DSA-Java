package com.mt;

import java.util.Scanner;


public class MissingNumber {
			

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Range :");
		int n=sc.nextInt();
		System.out.println("Enter the Array size :");
		int size=sc.nextInt();
		int num[]=new int[size];
		System.out.println("Enter the Array with Missing one element :");
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		MissingNumber.Miss(num,n);
		

}

	private static void Miss(int[] num, int n) {
		 int Asum=(n*(n+1))/2;
		 int sum=0;
		 for (int i=0;i<num.length;i++)
		 {
			 sum=sum+num[i];
		 }
		System.out.println("Missing Number is :"+(Asum-sum));
	}
}
