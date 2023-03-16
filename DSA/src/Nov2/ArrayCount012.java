package Nov2;

public class ArrayCount012 {


	public static void main(String[] args) {
		int ar[] = {1,0,2,1,0,2,2,0,0};
		counter012(ar);
	}

	private static void counter012(int ar[]) {
		int itr=0;
		int ptr1=0;
		int ptr2=ar.length-1;
		
		while(itr<=ptr2) {
			if(ar[itr]==0) {
				swap(ar,itr,ptr1);
				itr++;
				ptr1++;
					
			}else if (ar[itr]==2){
				swap(ar,itr,ptr2);
				ptr2--;
			}else {
			itr++;
			}
		}
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		
	}
	public static void swap(int ar[],int itr,int ptr) {
		int temp=ar[itr];
		ar[itr]=ar[ptr];
		ar[ptr]=temp;
	}
}
