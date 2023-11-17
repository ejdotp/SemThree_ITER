import java.util.*;
public class SingleLinkedList{
	static class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public static Node head;
	public static Node tail;
	public void addFirst(int data)
	{
			Node newNode = new Node(data);
			if(head==null)
			{
				head = tail = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
	}

	public void addlast(int data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head=tail=newNode;
			return;
		}
		tail.next=newNode;
		tail=newNode;
	}

	public void addany(int data, int key)
	{
		if(key==0)
		{
			addFirst(data);
			return;
		}
		Node newNode = new Node(data);
		Node temp=head;
		int i=0;
		while(i<key-1)
		{
			temp=temp.next;
			i++;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}

	public void delfirst()
	{
		if(head==null)
			System.out.println("Linked list is empty");
		if(head.next==tail)
			head = null;
		head = head.next;
	}

	public void dellast()
	{
		if(head==null)
			System.out.println("Linked list is empty");
		if(head.next==tail)
			head = null;
		Node temp = head;
		while(temp.next.next!=tail)
			temp=temp.next;
		temp.next = tail;
	}

	public void delany(int key)
	{
		if(head==null)
			System.out.println("Linked list is empty");
		if(head.next==tail)
			head = null;
		Node temp=head;
		int i=0;
		while(i<key-1)
		{
			temp=temp.next;
			i++;
		}
		temp.next = temp.next.next;
	}

	public void print()
	{
		if(head==null)
			System.out.println("Linked list is empty");
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}

	public void reverse()
	{
		if(head==null)
			System.out.println("Linked list is empty");
		Node curr=head, prev=null, temp;
		while(curr.next!=null)
		{
			temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		curr.next=prev;
		head=curr;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println();
			System.out.println("Enter Choice");
			System.out.println("1: Exit the matrix \n2: Insert at Beginning \n3: Instert at End \n4: Insert at any \n5: Delete Beginning \n6: Delete End Node \n7: Delete Any \n8: Print \n9: Reverse");
			int n=sc.nextInt();
			switch(n)
			{
			case 1:
				  System.exit(0);
			case 2:
				  addfirst();
				  break;
			case 3:
				  addlast();
				  break;
			case 4:
				  addany();
				  break;
			case 5:
				  delfirst();
				  break;
			case 6:
				  dellast();
				  break;
			case 7:
				  delany();
				  break;
			case 8:
				  print();
				  System.out.println();
				  break;
			case 9:
				  reverse();
				  print();
				  System.out.println();
				  break;
			}
		}
	}
}