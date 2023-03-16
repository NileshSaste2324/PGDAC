package oct28;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("Start");
		MyThread mt = new MyThread();
		mt.start();
		System.out.println("Finish");
	}

}
class MyThread extends Thread{

	@Override
	public void run() {
		for(int i=0; i<10;i++) {
			System.out.print(i+" ");
		}
	}
	
}
