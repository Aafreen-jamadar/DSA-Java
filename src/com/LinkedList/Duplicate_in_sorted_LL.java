package com.LinkedList;

import java.util.Scanner;

public class Duplicate_in_sorted_LL {

	static Scanner sc = new Scanner(System.in);
	 public static void main(String[] args) {
	      

	        System.out.println("Enter number of elements:");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter elements with duplicate in ascending order:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        
	        Node head=LLUtil.ConvertArray2LL(arr);
	        
	        LLUtil.traversal(head);
	     
	      
	        Node newNode=duplicate(head);
	        System.out.println("Afterremoving duplicate:");
	        LLUtil.traversal(newNode);
	 }
	 private static Node duplicate(Node head) {
		 Node temp=head;
		  while(temp!=null && temp.next!=null)
		  {
			  if(temp.data== temp.next.data)
			  {
				  temp.next=temp.next.next;
			  }
			  else {
				  temp=temp.next;
			  }
		  }
	
		return head;
	 }

}
