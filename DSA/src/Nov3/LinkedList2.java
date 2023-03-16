package Nov3;
public class LinkedList2 {
	public static class Node{
		int data;
		Node next;
		public Node(int data) {	
			this.data = data;
		}
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
	public static Node head = null;
	public static Node tail = null;
	public static void addStart(int data) {
		Node newNode= new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}else {
		newNode.next=head;
		head=newNode;
		}
	}
	public static void addLast(int data) {
		Node newNode= new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}else {
		tail.next=newNode;
		tail=newNode;
		}
	}
	static void largestElement(Node head){ 
	    int max = Integer.MIN_VALUE;
	    while (head != null) {
	        if (max < head.data)
	            max = head.data;
	        head = head.next;
	    }
	    System.out.println("Largest Element in Lilnked list: "+max);
	}
	static void smallestElement(Node head){
	    int min = Integer.MAX_VALUE;
	    while (head != null){
	        if (min > head.data)
	            min = head.data;
	        head = head.next;
	    }
	    System.out.println("Smallest Element in Lilnked list: "+min);
		
	}
	
	public static void display() {
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
	public static void main(String[] args) { 
		addStart(10);
		addLast(20);
		addStart(30);
		addLast(40);
		display();
		System.out.println();
		smallestElement(head);
		largestElement(head);
	}
}
