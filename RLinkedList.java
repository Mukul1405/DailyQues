import java.util.Scanner;

	public class RLinkedList
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
		public static RLinkedList insert(RLinkedList li,int data) {
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
		public static void display(RLinkedList li) {
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
			RLinkedList li=new RLinkedList();
			int n=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				li.insert(li,sc.nextInt());
			}
			head=li.reverse(head);
			display(li);
		}
}
