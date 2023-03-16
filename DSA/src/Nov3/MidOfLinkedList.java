package Nov3;
//import java.io.*;
public class MidOfLinkedList {
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
		}
		newNode.next=head;
		head=newNode;
		
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
	public static void addAt(int data,int k) {
		Node newNode =new Node(data);
		Node curr = head;
		k--;
		while(k!=0) {
			curr=curr.next;
			k--;
		}
		Node curr01 = curr.next;
		
		curr.next=newNode;
		newNode=curr01;
	
	}
	public static void mid(Node head) {
		if(head == null || head.next==null) {
			System.out.println(head.data);
			return;
		}
		Node slow = head;
		Node fast = head;
		while(fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		System.out.println(slow.data);
	}
	public static void display() {
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
	public static void main(String[] args) {
		// LinkedList list = new LinkedList();
		 
		addStart(10);
		addLast(20);
		addStart(70);
		addLast(60);
		//addAt(20,2);
		addStart(80);
		addLast(30);
		//addAt(40,3);
		display();
		mid(head);
	}
	

}
