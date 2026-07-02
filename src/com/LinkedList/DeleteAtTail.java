package com.LinkedList;

import java.util.Scanner;

public class DeleteAtTail {

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
	        System.out.println("After Deleting at Tail:");
	        LLUtil.traversal(newNode);
	 }
	 private static Node node(Node head) {
		 Node temp=head;
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		temp.next=null;
		return head;
	 }
}
