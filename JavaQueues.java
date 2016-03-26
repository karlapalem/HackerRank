class JavaQueues{

public class PriorityQueue{
	
	Node head = null;

	class Node{
		int data;
		Node next;

		Node(int d){
			data = d;
			next = null;
		}
	}

	void insertValue(int i){
		Node new_node = new Node(i);
		new_node.next = head;
		head = new_node;
	}

	int getSmallestValue(){
		int small = head.data;
		Node nodePtr = head;
		while(nodePtr != null){
			if(nodePtr.data < small){
				small = nodePtr.data;
			}
			nodePtr = nodePtr.next;
		}
		return small;
	}
}
	
	public static void main(String[] args){
		JavaQueues jq = new JavaQueues();
		PriorityQueue pq = new jq.PriorityQueue();
		jq.pq.insertValue(21);
		jq.pq.insertValue(10);
		jq.pq.insertValue(15);
		jq.pq.insertValue(20);
		jq.pq.insertValue(23);
		jq.pq.insertValue(30);
		int s = jq.pq.getSmallestValue();
		System.out.println(s);

	}
}


