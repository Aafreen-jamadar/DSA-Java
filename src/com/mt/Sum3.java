package com.mt;

import java.util.Arrays;
import java.util.Scanner;

public class Sum3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Array size :");
		int n=sc.nextInt();
		int num[]=new int[n];
		System.out.println("Enter the Array Element :");
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		Sum3.sum(num);
		

}

	private static void sum(int[] num) {
		int n=num.length;
		Arrays.sort(num);
		boolean found=false;
		for(int i=0;i<n-2;i++)
		{
			if(i>0&& num[i]==num[i-1])
				continue;
			int left=i+1, right=n-1;
			while(left<right)
			{
				int sum=num[i]+num[left]+num[right];
				
				if(sum==0)
				{
					System.out.println("{" +num[i]+" "+num[left]+ " "+num[right]+ " }");
					found=true;
					left++;
					right--;
				}
				else if(sum<0) {
					left++;
					
				}
				else {
					right--;
				}
			}
		}
		
		if(!found) {
            System.out.println("No triplet found!");
        }
		
	}


}
