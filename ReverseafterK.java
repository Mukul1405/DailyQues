import java.util.Scanner;

public class ReverseafterK {

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
	public static ReverseafterK insert(ReverseafterK li,int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		if(li.head==null) {
			li.head = newNode;
			System.out.println("element added !");
		}
		else {
			Node last = li.head;
			while(last.next!=null) {
				last = last.next;
			}
			last.next = newNode;
			System.out.println("element added !");
		}
		return li;
	}
	public static void display(ReverseafterK li) {
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
	
	public static Node reverse(Node head,int k)
	{
		Node next=null;
		Node current=head;
		Node prev=null;
		int count=0;
		while(current!=null && count<k)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			count++;
		}
		if(next!=null)
		{
			head.next=reverse(next,k);
		}
		head=prev;
		return head;
	}

	public static void main(String args[])
	{
		ReverseafterK li=new ReverseafterK();
		int n=sc.nextInt();
		int k;
		for(int i=0;i<n;i++)
		{
			li.insert(li,sc.nextInt());
		}
		k=sc.nextInt();
		
		head=li.reverse(head,k);
		display(li);
	}
}
