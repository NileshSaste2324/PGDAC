package oct28;

public class ThreadDemo1 {

	public static void main(String[] args) {
		System.out.println("Start");
		MyThread1 mt = new MyThread1();
		mt.start();
		System.out.println("Finish");
	}

}
class MyThread1 extends Thread{

	@Override
	public void run() {
		for(int i=0; i<10;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
			System.out.print(i+" ");
		}
	}
	
}
