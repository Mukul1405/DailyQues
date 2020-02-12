import java.util.Scanner;


public class Swap {
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}  
	public static Swap insert(Swap li,int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		if(li.head==null) {
			li.head = newNode;
			//System.out.println("element added !");
		}
		else {
			Node last = li.head;
			while(last.next!=null) {
				last = last.next;
			}
			last.next = newNode;
			//System.out.println("element added !");
		}
		return li;
	}

	public static void swap(Swap li)
	{
		Node curr=head;
		int d;
		while(curr.next!=null)
		{
			d=0;
			d=curr.data;
			curr.data=curr.next.data;
			curr.next.data=d;
			curr=curr.next.next;
		}
	}
	public static void display(Swap li) {
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
		Swap li=new Swap();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of inputs");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			li.insert(li,sc.nextInt());
		}
		swap(li);
		display(li);
	}

}
