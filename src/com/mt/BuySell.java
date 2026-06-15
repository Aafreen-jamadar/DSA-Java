package com.mt;

import java.util.Scanner;

public class BuySell {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Element :");
		int n=sc.nextInt();
		int price[]=new int[n];
		System.out.println("Enter the Array Element :");
		for(int i=0;i<n;i++)
		{
			price[i]=sc.nextInt();
		}
		BuySell.MaxProfit(price);
}

	private static void MaxProfit(int[] price) {
		int n=price.length;
		int minprice=Integer.MAX_VALUE;
		int maxprofit=0;
		for(int i=0;i<n;i++)
		{
			if(price[i]<minprice)
			{
				minprice=price[i];
			}
			else {
				maxprofit=Math.max(maxprofit, price[i]-minprice);
			}
		}
		System.out.println(maxprofit);
		
	}

}