package com.mt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeadearArray {
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
			LeadearArray.leader(num);
		}

	 private static void leader(int[] num) {
		 int n=num.length;
	ArrayList<Integer>al=new ArrayList();
	int max=num[n-1];
	al.add(max);
	
	for(int i=n-2;i>=0;i--)
	{
		if(num[i]>max)
		{
			al.add(num[i]);
			max=num[i];
		}
	}
	
	Collections.reverse(al);
	System.out.println("The Leaders are :");
	for( int i: al)
	{
		System.out.println(i);
	}
	 }
}
