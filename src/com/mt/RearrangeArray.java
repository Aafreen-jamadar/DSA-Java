package com.mt;

import java.util.Scanner;

public class RearrangeArray {
	
public static void main(String[] args) {
		
	Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Array size :");
		int n=sc.nextInt();
		int num[]=new int[n];
		System.out.println("Enter the Array Element :");
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
			RearrangeArray.arrange(num);
		

}

private static void arrange(int[] num) {
	int n=num.length;
	int result[] =new int[n];
	int positive=0,negative=1;
	for (int i=0;i<n;i++)
	{
		if(num[i]>0)
		{
			result[positive]=num[i];
			positive+=2;
			
		}
		else {
			result[negative]=num[i];
			negative+=2;
		}
	}
  System.out.println("The Array After Arrangment :");
  for (int i:result) {
	  System.out.print(i +" ");
  }
	
	
}

}
