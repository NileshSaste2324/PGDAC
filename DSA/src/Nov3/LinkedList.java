package Nov3;
public class LinkedList {
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
	public static void addAt(int data,int position) {
		Node newNode =new Node(data);
		Node curr = head;
		position--;
		while(position!=0) {
			curr=curr.next;
			position--;
		}
		Node curr01 = curr.next;
		curr.next=newNode;
		newNode=curr01;
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
		addAt(30,2);
		display();
	}
}
