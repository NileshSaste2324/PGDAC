package Nov10;
public class Stack {
	int[]stack;
	int tos=-1;
	//Stack() {
		//stack = new int[5];
	//}
	Stack(int size) {
		stack = new int[size];
	}
	public int size() {
		return tos+1;
	}
	public boolean isEmpty() {
		return(tos==-1);
	}
	public void push(int data) {
		if(tos== stack.length-1) {
			System.out.println("Stack is Full");
			return;
		}
		stack[++tos] =data;
	}
	public int pop() {
		if(tos== -1) {
			System.out.println("Stack is Empty");
			return -1;
		}
		int val= stack[tos];
		stack[tos]=0;
		tos--;
		return val;
	}
	public int top() {
		return stack[tos];
	}
	public void printStack() {
		for(int i=0; i<=tos;i++) {
			System.out.print(stack[i]+" ");
		}
	}
	public static void main(String[] args) {
		Stack s = new Stack(5);
		System.out.println("Stack Is Empty :"+s.isEmpty());
		s.push(1);
		s.push(2);
		s.push(4);
		s.push(6);
		s.push(8);
		System.out.println("Size of Stack : "+s.size());
		System.out.println("Stack : ");
		s.printStack();
		System.out.println();
		System.out.println("Element at top of Stack : "+s.top());
		System.out.println("Stack Is Empty :"+s.isEmpty());
		s.pop();
		s.pop();
		System.out.println("Stack :");
		s.printStack();
		System.out.println();
		System.out.println("Element at top of Stack : "+s.top());
		
		
	}

}
