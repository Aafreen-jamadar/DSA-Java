package com.LinkedList;

import java.util.Scanner;

public class SearchLL {
	 static Scanner sc = new Scanner(System.in);
	 public static void main(String[] args) {
	      

	        System.out.println("Enter number of elements:");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        
	        Node head=LLUtil.ConvertArray2LL(arr);
	        
	        LLUtil.traversal(head);
			System.out.println("Enter the target :");
			int target=sc.nextInt();
	        boolean found=serach(head,target);
	        if(found)
	        {
	        	 System.out.println(target + " found in the list!");
	        }
	        else {
	        	 System.out.println(target + "  Not found in the list!");
	        }

}

	 private static boolean serach(Node head, int target) {

		Node temp=head;
		while(temp!=null)
		{
			if(temp.data==target)
			{
				return true;
			}
			temp=temp.next;
		}
		
		return false;
		
	 }
}