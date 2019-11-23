import java.util.Scanner;
public class LinkedList
{
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
	public static LinkedList insert(LinkedList li,int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		if(li.head==null) {
			li.head = newNode;
			}
		else
		{
			Node last = li.head;
			while(last.next!=null) {
				last = last.next;
			    }
			last.next = newNode;
		}
		return li;
	}
	public static void display(LinkedList li) {
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
	public static Node reverse(Node head)
	{
		Node next=null;
		Node current=head;
		Node prev=null;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
		return head;
	}
	public static void main(String args[])
	{
		LinkedList li=new LinkedList();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			insert(li,sc.nextInt());
		}
		head=li.reverse(head);
		display(li);
	}
	
}
