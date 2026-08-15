package com.LinkedList;

public class DeteactLoop {
	
	public static void main(String[] args) {
		 Node head=new Node(1);
		 Node second=new Node(2);
		 Node third=new Node(3);
		 Node fourth=new Node(4);
		 Node fifth=new Node(5);
		 Node six=new Node(6);
		 
		 head.next=second;
		 second.next=third;
		 third.next=fourth;
		 fourth.next=fifth;
		 fifth.next=six;
		 six.next=second;
		 
		 boolean result=detect(head);
		 System.out.println(result? "Loop Detected ": " No LOOP");
		 
		 
	}

	private static boolean detect(Node head) {
		Node slow=head;
		Node fast=head;
		
		while(fast!=null&& fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow==fast)
			{
				return true;
			}
		}
		return false;
	}

}
