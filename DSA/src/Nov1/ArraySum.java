package Nov1;

public class ArraySum {

	public static void main(String[] args) {
		int a[] = {3,5,6};
		int b[] = {7,8,2};
		int[] c = new int [a.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i]+b[i];
		}
		for(int ar:c) {
			System.out.print(ar+" ");
		}
	}

}
