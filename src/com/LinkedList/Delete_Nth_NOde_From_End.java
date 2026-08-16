package com.LinkedList;

import java.util.Scanner;

public class Delete_Nth_NOde_From_End {
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
	        System.out.println("Enter Nth Node from End:");
	        int pos= sc.nextInt();
	     
	      
	        Node newNode=node(head,pos);
	        System.out.println("After Deleting "+pos+"th Node From end :");
	        LLUtil.traversal(newNode);
		
	}
	 private static Node node(Node head, int pos) {
        Node fast=head;
        Node slow=head;
        
        for(int i=0;i<pos;i++)
        {
        	fast=fast.next;
        }
        
        while(fast .next!= null)
        {
        	slow=slow.next;
        	fast=fast.next;
        }
        
        slow.next=slow.next.next;
		return head;
	 }
	 

}
