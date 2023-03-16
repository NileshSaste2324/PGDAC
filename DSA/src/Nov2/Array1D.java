package Nov2;

public class Array1D {


	public static void main(String[] args) {
		int ar[] = {1,0,1,0,0,1,0,1,0,0};
		counter01(ar);
	}

	private static void counter01(int[] ar) {
		int itr=0;
		int ptr=0;
		while(itr<ar.length) {
			if(ar[itr]==0) {
				swap(ar,itr,ptr);
				ptr++;
			}
			itr++;
		}
		for(int a:ar) {
			System.out.print(a+" ");
		}
		
	}
	public static void swap(int ar[],int itr,int ptr) {
		int temp=ar[itr];
		ar[itr]=ar[ptr];
		ar[ptr]=temp;
	}
}
