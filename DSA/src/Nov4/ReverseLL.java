package Nov4;
public class ReverseLL {
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
	public static void reverse(Node head) {
		Node curr= head;
		Node prev = null;
		while(curr!=null) {
			Node temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr= temp;
		}
		while(prev!=null) {
			System.out.print(prev.data+" ");
			prev=prev.next;
		}
	}
	public static void display() {
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}

	public static void main(String[] args) {
		addStart(30);
		addLast(40);
		addStart(20);
		addLast(50);
		addStart(10);
		addLast(60);
		display();
		
		System.out.println();
		reverse(head);
		

	}

}
