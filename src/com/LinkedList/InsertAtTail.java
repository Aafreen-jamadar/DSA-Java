package com.LinkedList;

import java.util.Scanner;

public class InsertAtTail {
	

	static Scanner sc = new Scanner(System.in);
	 public static void main(String[] args) {
	      

	        System.out.println("Enter number of elements:");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        
//	        convert to Linked List
	        Node head=LLUtil.ConvertArray2LL(arr);
	        
	        
//	         travese the List
	        LLUtil.traversal(head);
	        
//	        data for new Node
	        System.out.println("Enter the New Value :");
	        int val=sc.nextInt();
	        
	        head=insertAtTail(head,val);
	        
//	        After inserting newNode
	        System.out.println("After Inserting at End:");
	        LLUtil.traversal(head);
}
	 private static Node insertAtTail(Node head, int val) {
		Node newNode= new Node(val);
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
		
		return head;
	 }

}
