package com.mt;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
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
		System.out.println("Enter the Target :");
		int target=sc.nextInt();
		TwoSum.sum(num,target);
	}

	private static void sum(int[] num ,int target) {
		int n=num.length;
		HashMap<Integer, Integer>map=new HashMap<>();
		boolean found=false;
		for(int i=0;i<n;i++)
		{
			
			
			int complement=target-num[i];
			if(map.containsKey(complement))
			{
				found=true;
				System.out.println("Pair "+complement+ " "+num[i]);
				System.out.println("Indiaces :"+map.get(complement)+ " " +i);
				break;
			}
			map.put(num[i],i);
		}
		
		if(!found) {
			System.out.println("No pair Exist");
		}
			
		
	}

}
