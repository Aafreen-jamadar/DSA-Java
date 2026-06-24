package com.LinkedList;

import java.util.Scanner;

public class lengthOfLL {

		static class Node{
			int data;
			Node next;
			 Node(int data, Node next) {
			
				this.data = data;
				this.next = next;
			}
			 Node(int data) {
					
					this.data = data;
					this.next = null;
				}
			
		};
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
	         
			 int len = length(head);
			 System.out.println("The length of Linked List is : " + len);
		}
		
//		1.Convert into LinkedList
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
		
		
//		2. then count the length
		private static int length(Node head) {
			int counter=0;
			Node temp=head;
			while(temp!=null)
			{
				counter++;
				temp=temp.next;
			}
			return counter;
			
		}

	}

	

