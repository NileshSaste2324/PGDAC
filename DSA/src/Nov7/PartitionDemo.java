package Nov7;

public class PartitionDemo {

	public static void main(String[] args) {
		int ar []= {4,3,6,2,5,7,9,8,1};
		int target =5;
		System.out.println(partitionArray(ar,target));
		quickSort(ar,0,ar.length-1);
		for(int a:ar) {
			System.out.print(a+" ");
		}
	}

	private static void quickSort(int[] ar, int lo, int hi) {
		if(lo>hi) {
			return;
		}
		int pivot= ar[hi];
		int pi=partitionArray(ar,pivot);
		quickSort(ar,lo,pi-1);
		quickSort(ar,pi+1,hi);
		
	}

	private static int partitionArray(int[] ar, int target) {
		int start=0;
		int end= ar.length-1;
		int itr=0,ptr=0;
		while(itr<=end) {
			if(ar[itr]<=target) {
				swap(ar,itr,ptr);
				itr++;
				ptr++;
				
			}else {
				itr++;
			}
		}
		return(ptr-1);
	}

	private static void swap(int ar[],int itr, int ptr) {
		int temp=ar[itr];
		ar[itr]=ar[ptr];
		ar[ptr]=temp;
		
	}

}
