package com.LinkedList;

import java.util.Scanner;

public class InsertAtPos {
	

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
	        

	        
	        head=insertAtPos(head);
	        
//	        After inserting newNode
	        System.out.println("After Inserting at End:");
	        LLUtil.traversal(head);
}
	 private static Node insertAtPos(Node head) {
		 
//		  postion identify
		 System.out.print("Enter the Positon :");
		 int pos=sc.nextInt();
		 
//		  data for new Node
	        System.out.println("Enter the New Value :");
	        int val=sc.nextInt();
	        Node newNode= new Node(val);
	        
	        if (pos == 0) {                 
	            newNode.next = head;
	            return newNode;                
	        }
	        
		 Node temp=head;
		 int counter=0;
		 
		 while(counter<pos-1)
		 {
			 temp=temp.next;
			 counter++;
		 }
		 newNode.next=temp.next;
		 temp.next=newNode;
		
		return head;
	 }


}
