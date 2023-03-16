package Nov7;
public class InsertionSort {
	public static void main(String[] args) {
		int ar[]= {4,6,3,9,5,7,2};
		insertionSort(ar);
	}
	private static void insertionSort(int[] ar) {
		for(int i=1;i<ar.length;i++) {
			for(int j=i-1;j>=0;j--) {
				if(ar[j]>=ar[j+1]) {
					swap(ar,j,j+1);
				}else {
					break;
				}
			}
		}
		for(int a:ar) {
			System.out.print(a+" ");
		}	
	}
	private static void swap(int[] ar, int j, int i) {
		int temp=ar[j];
		ar[j]=ar[i];
		ar[i]=temp;	
	}
}
