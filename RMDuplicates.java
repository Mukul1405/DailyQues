import java.util.Scanner;

public class RMDuplicates {

	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public static void insert(RMDuplicates li,int data)
	{
		Node newNode=new Node(data);
		newNode.next=null;
		if(li.head==null)
		{
			li.head=newNode;
		}
		else
		{
			Node c=li.head;
			while(c.next!=null)
			{
				c=c.next;
			}
			c.next=newNode;
		}
		
	}
	public static void RemoveDuplicates(RMDuplicates li)
	{
		Node curr = li.head; 
        while (curr != null) { 
             Node temp = curr; 
            while(temp!=null && temp.data==curr.data) { 
                temp = temp.next; 
            } 
            curr.next = temp; 
            curr = curr.next; 
        } 
	}
	public static void display(RMDuplicates li)
	{
		Node c=li.head;
		while(c.next!=null)
		{
			System.out.print(c.data+"-->");
			c=c.next;
		}
	
		System.out.println(c.data);
	}
	public static void main(String args[])
	{
		RMDuplicates li=new RMDuplicates();
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			insert(li,sc.nextInt());
		}
		RemoveDuplicates(li);
		display(li);
	}
}
