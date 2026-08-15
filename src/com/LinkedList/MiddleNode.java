package com.LinkedList;

import java.util.Scanner;

public class MiddleNode {
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
     
      
        Node newNode=middle(head);
        System.out.println("Middle is :" + newNode.data);
        
        

}

	private static Node middle(Node head) {
		Node slow=head;
		Node fast=head;
		
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
}
