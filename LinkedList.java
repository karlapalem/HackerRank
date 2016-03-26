import java.util.*;

public class LinkedList{
	
	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public static void main (String[] args)
	{
		LinkedList list = new LinkedList();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);
		list.head.next.next.next.next.next = new Node(6);

		Node current = head;
		Node middle = head;
		int length = 0;

		while(current.next != null)
		{
			++length;
			if (length%2 == 0)
			{
				middle = middle.next;
			}
			current = current.next;
		}

		System.out.println("The length is:" + ++length);
		System.out.println("The middle node is: " + middle.data);

	}
}
