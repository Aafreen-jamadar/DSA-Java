package com.mt;

import java.util.Scanner;

public class RemoveDuplicate {
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
		RemoveDuplicate.remove(num);
		

}

	private static void remove(int[] num) {
		if(num.length==0)
			return;
		int i=0;
		 for(int j=1;j<num.length;j++)
		 {
			 if(num[j]!=num[i])
			 {
				 i++;
				 num[i]=num[j];
			 }
		 }
		 System.out.println(i+1);;
		 for(int j=0;j<=i;j++)
		 {
			 System.out.println(num[j]);
		 }
	}
}
