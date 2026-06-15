package com.mt;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array 1 :");
		int n1=sc.nextInt();
		
		int num1[]=new int[n1];
	
		System.out.println("Enter the Element  for Array 1:");
		for(int i=0;i<num1.length;i++)
		{
			num1[i]=sc.nextInt();
		}
		System.out.println("Enter the size of Array 2 :");
		int n2=sc.nextInt();
		int num2[]=new int[n2];
		System.out.println("Enter the Element  for Array 2:");
		for(int i=0;i<num2.length;i++)
		{
			num2[i]=sc.nextInt();
		}
		
		MergeSortArray.merge(num1,num2);
		

}

	private static void merge(int[] num1, int[] num2) {
		
		Arrays.sort(num1);
		Arrays.sort(num2);
		int n1=num1.length;
		int n2=num2.length;
		int result[]=new int[n1+n2];
		int i=0,j=0,k=0;
		
		while(i<n1&& j<n2) {
			if(num1[i]<num2[j])
			{
				result[k]=num1[i];
				k++;
				i++;
			}
			else {
				result[k]=num2[j];
				k++;
				j++;
			}
		}
		
		while(i<n1) {
			result[k++]=num1[i++];
		}
		while(j<n2) {
			result[k++]=num2[j++];
		}
		System.out.println("Merge :");
		for(int m:result) {
			System.out.print(m+" ");
		}
	}
}
