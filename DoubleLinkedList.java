class JavaList{

	class DoubleLinkedList {
 
	    Node head = null;
 	
 	   private class Node {
 
    	    int data;
        	Node next, prev;
 
        Node(int d) {
            data = d;
            next = null;
	    prev = null;
        }
    }
 
  
    void deleteNode() {

	if(head != null){
		head = head.next; 
	}
    }
 
    void insertNode(int val){
    	
	Node new_head = new Node(val);
	new_head.prev = null;
	new_head.next = head;
	head = new_head;
    }
 
    void printList() {
    	Node node_ptr = head;
        while (node_ptr != null) {
            System.out.print(node_ptr.data + " ");
            node_ptr = node_ptr.next;
        }
    }
	}


 
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        list.insertNode(2);
        list.insertNode(4);
        list.insertNode(8);
        list.insertNode(10);
 
        System.out.println("Linked list ");
        list.printList();
 
		System.out.println("List after adding 3: ");
		list.insertNode(3);
		list.printList();

		System.out.println("List after deleting: ");
        list.deleteNode();
        list.printList();
    }
}

