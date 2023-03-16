package oct29;

public class ThreadCommunication {

	public static void main(String[] args) {
		Adder a = new Adder();
		Reader r = new Reader(a);
		Thread th1 = new Thread(a);
		Thread th2 = new Thread(r);
		
		th2.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		th1.start();
		
	}

}
class Adder implements Runnable{
	int sum;
	boolean flag = false;
	@Override
	synchronized public void run() {
		System.out.println("Adder Start");
		for(int i=0;i<=1000;i++) {
			sum +=i;
		}
		flag=true;
		notify();
		System.out.println("Notified");
		System.out.println("adder Completed");
	}
}
class Reader implements Runnable{
	Adder ad;
	Reader(Adder ad){
		this.ad=ad;
	}
	@Override
	public void run() {
		System.out.println("Reader Start");
		synchronized (ad) {
			if(!ad.flag) {
			try {
					System.out.println("Waiting To be Notified");
					
					ad.wait();
				} catch (InterruptedException e) {
					
				}
			}
		}
		System.out.println(ad.sum);
		System.out.println("Reader Complete");
		
	}
	
}