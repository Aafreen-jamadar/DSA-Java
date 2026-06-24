package com.LinkedList;

import java.util.Scanner;

import com.mt.MoveZeroAtEnd;

public class Array2LL {
//	Create Node
	static class Node{
		int data;
		 Node next;
		 Node(int data,Node next)
		 {
			 this.data=data;
			 this.next=next;
		 }
		 
//		 for tail or there is no next data
		 Node(int data)
		 {
			 this.data=data;
			 this.next=null;
		 }
	}
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Element :");
		int n=sc.nextInt();
		int num[]=new int[n];
		System.out.println("Enter the Array Element :");
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
           Node head= convertArry2LL(num);
           System.out.println(head.data);
	}

	private static Node convertArry2LL(int[] num) {
		Node head=new Node(num[0]);
		Node mover=head;
		for( int i=1;i<num.length;i++)
		{
			Node temp=new Node(num[i]);
			mover.next=temp;
			mover=temp;
		}
		return head;
		
	}

}
