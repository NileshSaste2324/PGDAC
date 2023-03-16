package Nov9;

public class BinaryTree {
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
	public static int height(Node node) {
		if(node==null)
			return 0;
		return Math.max(height(node.left), height(node.right))+1;
	}
	public static int size(Node node) {
		if(node==null)
			return 0;
		return size(node.left) + size(node.left) + 1;
	}
	static int mini=Integer.MAX_VALUE;
	public static void mini(Node node) {
		if(node==null)return;
		mini(node.left);
		mini(node.right);
		mini= Math.min(mini, node.data);
	}
	static int maxi=Integer.MIN_VALUE;
	public static void maxi(Node node) {
		if(node==null)return;
		maxi= Math.max(maxi, node.data);
		maxi(node.left);
		maxi(node.right);	
	}
	public static void inorderTraversal(Node node) {
		if(node==null) {
			return;
		}
		inorderTraversal(node.left);
		System.out.print(node.data+" ");
		inorderTraversal(node.right);
	}
	public static void preorderTraversal(Node node) {
		if(node==null) {
			return;
		}
		System.out.print(node.data+" ");
		preorderTraversal(node.left);
		preorderTraversal(node.right);
	}
	public static void postorderTraversal(Node node) {
		if(node==null) {
			return;
		}
		postorderTraversal(node.left);
		postorderTraversal(node.right);
		System.out.print(node.data+" ");
	}
	public static void main(String[] args) {
		int ar[]= {10,20,40,-1,-1,50,-1,-1,30,60,-1,-1,70,-1,-1};
		tree(ar);
		System.out.println("Height : "+height(root));
		System.out.println("Size : "+size(root));
		mini(root);
		System.out.println("Mini : "+mini);
		maxi(root);
		System.out.println("Maxi : "+maxi);
		System.out.println("Inorder :");
		inorderTraversal(root);
		System.out.println();
		System.out.println("Preorder :");
		preorderTraversal(root);
		System.out.println();
		System.out.println("Postorder :");
		postorderTraversal(root);
	}

}
