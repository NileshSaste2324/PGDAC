package oct29;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"Start");
		MyRunnable m = new MyRunnable();
		Thread th = new Thread(m);
		th.start();
//		try {
//			th.join();
//		} catch (InterruptedException e) {
//			
//		}
		System.out.println(Thread.currentThread().getName()+"Finish");
	}

}
class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"Start");
		for(int i=0; i<10;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
		System.out.println(" ");
		System.out.println(Thread.currentThread().getName()+"Finish");
	}
	
}
