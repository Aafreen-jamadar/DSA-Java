package com.mt;

import java.util.Scanner;

public class MoveZeroAtEnd {
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
		MoveZeroAtEnd.move(num);
		

}

	private static void move(int[] num) {
	int n=num.length;
	
	int j = 0;

	for(int i = 0; i < n; i++) {
	    if(num[i] != 0) {
	        int temp = num[j];
	        num[j] = num[i];
	        num[i] = temp;
	        j++;
	    }
	}
	
	System.out.println("After Moving Zero At End :");
	for(int i:num)
	{
		System.out.print(i+" ");
	}
	
		
	}
}
