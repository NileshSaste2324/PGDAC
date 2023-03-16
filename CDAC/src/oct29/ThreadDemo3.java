package oct29;

public class ThreadDemo3 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"Start");
		PrintMg1 p = new PrintMg1();
		MyRunnable2 m = new MyRunnable2(p);
		Thread th1 = new Thread(m);
		Thread th2 = new Thread(m);
		th1.start();
		th2.start();

		System.out.println(Thread.currentThread().getName()+"Finish");
	}

}
class MyRunnable2 implements Runnable{
	private PrintMg1 pm;
	public MyRunnable2(PrintMg1 pm) {
		this.pm=pm;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"Start");
		
		
				pm.PrintMg1();
			
		
		System.out.println(" ");
		System.out.println(Thread.currentThread().getName()+"Finish");
	}
	
}
class PrintMg1{
	synchronized void PrintMg1() {
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