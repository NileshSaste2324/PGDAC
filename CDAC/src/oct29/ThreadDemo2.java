package oct29;

public class ThreadDemo2 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"Start");
		PrintMg p = new PrintMg();
		MyRunnable1 m = new MyRunnable1(p);
		Thread th1 = new Thread(m);
		Thread th2 = new Thread(m);
		th1.start();
		th2.start();

		System.out.println(Thread.currentThread().getName()+"Finish");
	}

}
class MyRunnable1 implements Runnable{
	private PrintMg pm;
	public MyRunnable1(PrintMg pm) {
		this.pm=pm;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"Start");
		
			synchronized (pm) {
				pm.printMg();
			}
		
		System.out.println(" ");
		System.out.println(Thread.currentThread().getName()+"Finish");
	}
	
}
class PrintMg{
	void printMg() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
			System.out.print(i+" ");
		}
		System.out.println(" ");
	}
}