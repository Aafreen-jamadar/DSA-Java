package com.LinkedList;

import java.util.Scanner;

public class DeleteAtPos {
 

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
	     
	      
	        Node newNode=node(head);
	        System.out.println("After Deleting at given position :");
	        LLUtil.traversal(newNode);
	 }
	 private static Node node(Node head) {
		 
		 Node temp=head;
		System.out.println("Enter the position :");
		 int pos=sc.nextInt();
		 int counter=0;
		 if( pos==0)
		 {
			 head=head.next;
			 return head;
		 }
		 
		 while(counter<pos-1)
		 {
			 temp=temp.next;
			 counter++;
			 
		 }
		 temp.next=temp.next.next;
		return head;
	 }
}
