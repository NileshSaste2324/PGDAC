package Nov4;

public class RecursionDemo {
	public static void inc(int a,int b) {
		if(a==b+1)
			return;
		inc(a,b-1);
		System.out.print(b+" ");
		
	}
	public static void dec(int a, int b) {
		if(a==b+1) {
			return;
		}
		System.out.print(b+" ");
		dec(a,b-1);
	}
	public static void evenOdd(int a, int b) {
		if(a==b+1)
			return;
		if(b%2!=0)
			System.out.print(b+" ");
		evenOdd(a,b-1);
		if(b%2==0)
			System.out.print(b+" ");
	}

	public static void main(String[] args) {
		inc(1,10);
		System.out.println();
		dec(1,10);
		System.out.println(" ");
		evenOdd(1,10);

	}

}
