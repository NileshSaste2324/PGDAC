package Nov10;
public class Queue {
	int[] que;
	int head=0;
	int tail=-1;
	int size=0;
	public Queue(int size) {
		que = new int[size];
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public void push(int data) {
		if(size==que.length) {
			System.out.println("Queue is Full");
			return;
		}
		tail=(tail+1)%que.length;
		que[tail]=data;
		size++;
	}
	public int pop() {
		if(size==0) {
			System.out.println("Queue is Empty");
			return -1;
		}
		int val = que[head];
		que[head]=0;
		size--;
		head=(head+1)%que.length;
		return val;
	}
	public int front() {
		if(size==0) {
			System.out.println("Queqe is Empty");
			return -1;
		}
		return que[head];
	}
	public int rear() {
		if(size==0) {
			System.out.println("Queqe is Empty");
			return -1;
		}
		return que[tail];
	}
	public void displayQueue() {
		for(int i=head;i<=tail;i++) {
			System.out.print(que[i]+" ");
		}
	}
	public static void main(String[] args) {
		Queue q = new Queue(6);
		System.out.println("Size of Queue: "+q.size());
		System.out.println("Queue is Empty: "+q.isEmpty());
		q.push(2);
		q.push(4);
		q.push(6);
		q.push(8);
		q.push(10);
		q.push(12);
		System.out.println("Queue: ");
		q.displayQueue();
		System.out.println();
		System.out.println("Head: "+q.front());
		System.out.println("Tail: "+q.rear());
		q.pop();
		q.pop();
		System.out.println("Queue: ");
		q.displayQueue();
	}

}
