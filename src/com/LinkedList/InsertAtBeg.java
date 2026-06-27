package com.LinkedList;

import java.util.Scanner;

public class InsertAtBeg {

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
	        System.out.println("Enter the New Value :");
	        int val=sc.nextInt();
	        Node newNode=node(head,val);
	        System.out.println("After Inserting at Beginning:");
	        LLUtil.traversal(newNode);
}
	 private static Node node(Node head, int val) {
		 Node newNode=new Node(val);
		 newNode.next=head;
		 head=newNode;
		
		return newNode;
	 }

}
