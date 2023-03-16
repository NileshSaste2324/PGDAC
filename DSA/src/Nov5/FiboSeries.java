package Nov5;

public class FiboSeries {

	public static void main(String[] args) {
		System.out.println(fibo(12));

	}

	private static int fibo(int n) {
		if(n<=1)
			return n;
		return fibo(n-1)+fibo(n-2);
	}

}
