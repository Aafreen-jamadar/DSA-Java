package com.LinkedList;

import java.util.Scanner;

public class ReverseLL {
    
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
     
      
        Node newNode=reverseLL(head);
        System.out.println("After Reserse :");
        LLUtil.traversal(newNode);
    }
    
    private static Node reverseLL(Node head) {
    	
    	Node curr=head;
    	Node prev=null;
    	Node next=null;
    	while(curr!=null)
    	{
    		next=curr.next ;
    		curr.next=prev;
    		prev=curr;
    		curr=next;
    		
    	
    	}
		return prev;
        
    }
}