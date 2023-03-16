package Nov9;

import Nov9.BinaryTree.Node;

public class Bst {
	public static class Node{
		int data=0;
		Node left=null;
		Node right=null;
		public Node() {
		}
		public Node(int data) {
			this.data = data;
		}
		public Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}	
	}
	static Node root =null;
	public static void tree(int[]ar) {
		root=construct(ar);
	}
	static int idx = 0; 
	private static Node construct(int[] ar) {
		if(idx>=ar.length || ar[idx]==-1) {
			idx++;
			return null;
		}
		Node node =new Node(ar[idx],null,null);
		idx++;
		
		node.left=construct(ar);
		
		node.right=construct(ar);
		
		return node;
	}
	public static int mini(Node node) {
		Node curr=node;
		while(curr.left != null) {
			curr = curr.left;
		}
		return curr.data;
	}
	public static int maxi(Node node) {
		Node curr=node;
		while(curr.right != null) {
			curr = curr.right;
		}
		return curr.data;
	}
	public static boolean find(Node node,int target) {
		if(node == null) {
			return false;
		}
		if(node.data>target) {
			return find(node.left,target);
		}else if(node.data<target) {
			return find(node.right,target);
		}else if(node.data == target) {
			System.out.println(node.data);
		}
		return true;
	}

	public static void main(String[] args) {
		int ar[]= {40,20,10,-1,-1,25,-1,-1,50,60,-1,-1,70,-1,-1};
		tree(ar);
		int target;
		System.out.println("Mini : "+(mini(root)));
		maxi(root);
		System.out.println("Maxi : "+(maxi(root)));
		System.out.println("find : "+(find(root,40)));
	}

}
