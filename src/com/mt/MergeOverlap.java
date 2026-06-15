package com.mt;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergeOverlap {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Element :");
		int n=sc.nextInt();
		int interval[][]=new int[n][2];
		System.out.println("Enter the Array Element :");
		for(int i=0;i<n;i++)
		{
			interval[i][0]=sc.nextInt();
			interval[i][1]=sc.nextInt();
		}
	
		overlap(interval);

}

	private static void overlap(int[][] interval) {
		Arrays.sort(interval,(a,b)->a[0]-b[0]);
		List<int[]>list=new ArrayList<>();
		int[] current=interval[0];
		for(int i=1;i<interval.length;i++)
		{
			if(interval[i][0]<=current[1])
			{
				current[1]=Math.max(current[1], interval[i][1]);
			}
			else {
	            list.add(current);
	            current = interval[i];
	        }
	    }
	    list.add(current);
	    System.out.println("Merged Intervals:");
        for(int[] interval1 : list) {
            System.out.println("{" + interval1[0] + "," + interval1[1] + "}");
        }
		
	}

}
