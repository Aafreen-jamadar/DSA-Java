package com.LinkedList;

public class CreateLl {
	static class  Node{
		int data;
		Node next;
		
		Node(int data, Node next)
		{
			this.data=data;
			this.next=next;
		}

		 Node(int data) {
			 this.data=data;
			 this.next=null;
			}
	};
	
	public static void main(String[] args) {
		
		int arr[]= {2,5,8,7};
		Node head=new Node(arr[0]);
		System.out.println(head.data);
	}

}
