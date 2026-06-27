package com.LinkedList;

public class LLUtil {
	public static Node ConvertArray2LL(int []arr)
	{
		Node head=new Node(arr[0]);
		Node mover=head;
		for(int i=1;i<arr.length;i++)
		{
			Node temp=new Node(arr[i]);
			mover.next=temp;
			mover=temp;
			
		}
		return head;
	}

	public static void traversal(Node head)
	{
		
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ->");
			temp=temp.next;
		}
		System.out.println("null");
	}
}
