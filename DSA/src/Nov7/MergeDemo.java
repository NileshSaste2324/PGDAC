package Nov7;
public class MergeDemo {
	public static void main(String[] args) {
		int ar[]= {3,5,1,2,7,9,-1,4};
		int[] ans= mergeSort(ar,0,ar.length-1);
		display(ans);
	}
	private static int[] mergeSort(int[] ar, int lo,int hi) {
		if(lo==hi) {
			int base[]=new int[1];
			base[0]=ar[lo];
			return base;
		}
		int mid=(lo+hi)/2;
		int left[]=mergeSort(ar,lo,mid);
		int right[]=mergeSort(ar,mid+1,hi);
		int []ans= merge2SortedArrays(left,right);
		return ans;
	}
	public static void display (int[] ar) {
		for(int a:ar) {
		System.out.print(a+" ");
		}
	}
	private static int[] merge2SortedArrays(int[] ar1, int[] ar2) {
		int[]ans=new int[ar1.length+ar2.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<ar1.length && j<ar2.length){
			if(ar1[i]<ar2[j]) {
				ans[k]=ar1[i];
				i++;
				k++;
			}else {
				ans[k]=ar2[j];
				j++;
				k++;
			}
		}
		while(i<ar1.length) {
			ans[k]=ar1[i];
			i++;
			k++;
		}
		while(j<ar2.length) {
			ans[k]=ar2[j];
			j++;
			k++;
		}
		return ans;
	}
}
