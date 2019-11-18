import java.util.Scanner;

import LinkedList.Node;

public class RmDuplicatesLL {
	
	static Scanner sc = new Scanner(System.in);
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	public static RmDuplicatesLL  insert(RmDuplicatesLL li,int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		if(li.head==null) {
			li.head = newNode;
	
		}
		else {
			Node last = li.head;
			while(last.next!=null) {
				last = last.next;
			}
			last.next = newNode;

		}
		return li;
	}
	public static RmDuplicatesLL sort(RmDuplicatesLL li)
	{
		int temp=0;
		Node current =li.head;
		while(current!=null)
		{
			Node c=li.head;
			while(c!=null)
			{
				if(current.data<c.data)
				{
					temp=current.data;
					current.data=c.data;
					c.data=temp;
				}
				c=c.next;
			}
			current=current.next;
		}
		return li;
	}
	public static void RemoveDuplicates(RmDuplicatesLL li)
	{	sort(li);
		Node current=li.head;
		Node c=current.next;
		while(c!=null)
		{
         if(current.data==c.data)
         {
        	 delete(li,c.data);
        	 current=c;
        	 c=c.next;
         }
         else
         {
        	 current=c;
        	 c=c.next;
         }
		}
	}
	public static void delete(RmDuplicatesLL li, int data) {
	
		Node current=li.head;
		while(current.next.data!=data)
		{
			current=current.next;
		}
		Node c=current.next.next;
		current.next=null;
		current.next=c;
	}
	public static void display(RmDuplicatesLL li) {
		if(li.head==null)
			System.out.println("No linked list available");
		else {
			Node current = li.head;
			System.out.println("Here is the updated linked list : ");
			while(current!=null) {
				System.out.print(current.data+" ");
				current = current.next;
			}
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		RmDuplicatesLL li=new RmDuplicatesLL();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of LinkedList");
		int n=sc.nextInt();
		System.out.println("Enter values of LL");
		for(int i=0;i<n;i++)
		{
			li.insert(li, sc.nextInt());
		}
		RemoveDuplicates(li);
		display(li);
	}

}
