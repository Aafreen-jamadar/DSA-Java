package com.mt;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Scanner;

public class SubArraySumK {
	
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
		SubArraySumK.sum(num,k);

}

	private static void sum(int[] num,int k) {
		int n=num.length;
		HashMap<Integer,Integer>map=new HashMap<>();
		map.put(0, 1);
		int sum=0,count=0;
		for(int i=0;i<n;i++)
		{
			sum+=num[i];
			
			if(map.containsKey(sum-k))
			{
				count=count+map.get(sum-k);
			}
		map.put	(sum,map.getOrDefault(sum, 0)+1);
		}
		 
        System.out.println("Count: " + count);
		
	}
}
