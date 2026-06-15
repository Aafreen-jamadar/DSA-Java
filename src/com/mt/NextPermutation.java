package com.mt;

import java.util.Scanner;

public class NextPermutation {
	
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
		NextPermutation.next(num);
		

}

	private static void next(int[] num) {
		int n=num.length;
		int index=-1;
		for(int i=n-2;i>=0;i--)
		{
			if(num[i]<num[i+1])
			{
				index=i;
				break;
			}
		}
		
		if(index!=-1)
		{		
		 for(int i=n-1;i>=0;i--)
		   {
			 	if(num[i]>num[index])
			 	{
			 		int temp=num[i];
			 		num[i]=num[index];
			 		num[index]=temp;
			 		break;
			 	}
		    }
		}
		
		int start=index+1,end=n-1;
		while(start<end)
		{
			int temp=num[start];
	 		num[start]=num[end];
	 		num[end]=temp;
	 		start++;
	 		end--;
		}
	
	System.out.println("Next Permutation is :");
	for(int i:num)
	{
		System.out.print(i + " ");
	
	}
	
	
	
	}
	
	
	
	}


