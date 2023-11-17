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
	public static void addfirst(int data)
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

	public static void addlast(int data)
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

	public static void addany(int data, int key)
	{
		if(key==0)
		{
			addfirst(data);
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

	public static void delfirst()
	{
		if(head==null)
			System.out.println("Linked list is empty");
		if(head.next==tail)
			head = null;
		head = head.next;
	}

	public static void dellast()
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

	public static void delany(int key)
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

	public static void print()
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

	public static void reverse()
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
			      System.out.print("Enter element: ");
			      int x = sc.nextInt();
				  addfirst(x);
				  break;
			case 3:
				  System.out.print("Enter element: ")
			      int y = sc.nextInt();
			      addlast(y);
				  break;
			case 4:
			      System.out.print("Enter element and position: ");
				  int z = sc.nextInt(), p = sc.nextInt();
				  addany(z, p);
				  break;
			case 5:
				  delfirst();
				  break;
			case 6:
				  dellast();
				  break;
			case 7:
			      System.out.print("Enter position to delete: "));
				  int q = sc.nextInt();
				  delany(q);
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