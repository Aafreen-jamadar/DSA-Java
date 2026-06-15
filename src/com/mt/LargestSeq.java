package com.mt;

import java.util.HashSet;
import java.util.Scanner;

public class LargestSeq {
	
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
		LargestSeq.seq(num);
		

}

	private static void seq(int[] num) {
	HashSet<Integer>set=new HashSet<>();
	int max=0;
	for(int i: num)
		set.add(i);
		
	for(int x:num)
	{
		if(!set.contains(x-1))
		{
			int curr=x;
			int len=1;
			
			while(set.contains(curr+1))
			{
				curr++;
				len++;
			}
			max=Math.max(len, max);
		}
	}
	System.out.println("Length:  "+max);

}
}
