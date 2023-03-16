package Nov5;

public class BubbleSortAlgo {

	public static void main(String[] args) {
		int ar[]= {2,4,6,3,7,1,9,5};
		for(int b:ar) {
			System.out.print(b+" ");
		}
		System.out.println();
		bubbleSort(ar);

	}

	private static void bubbleSort(int[] ar) {
//		int n= ar.length;
		for(int i=1;i<ar.length;i++) {
			for(int j=0;j<ar.length-i;j++){
				if(ar[j]>ar[j+1]) {
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		for(int a:ar) {
			System.out.print(a+" ");
		}
	}

}
