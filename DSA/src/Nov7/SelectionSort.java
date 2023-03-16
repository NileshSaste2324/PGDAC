package Nov7;
public class SelectionSort {
	public static void main(String[] args) {
		int ar[] = {2,5,3,9,6,4,8};
		selectionSort(ar);
		System.out.println();
		System.out.println("Sum of Even Element in Array:");
		System.out.println(sumEvenNum(ar));
	}
	private static void selectionSort(int[] ar) {	
		for(int i=0;i<ar.length-1;i++) {
			int idx=i;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[j]<ar[idx]) {
					idx=j;
				}
			}
			swap(ar,i,idx);
		}
		for(int a:ar) {
			System.out.print(a+" ");
		}
	}
	private static void swap(int[] ar, int i, int j) {
		int temp= ar[i];
		ar[i]=ar[j];
		ar[j]=temp;	
	}
	private static int sumEvenNum(int[] ar) {
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0)
				sum = sum+ar[i];
		}
		return sum;
	}
	

}
