package Nov5;

public class minMax {

	public static void main(String[] args) {
		int ar[]= {1,2,3,4,6,7,5,-2,9,12,5};
		System.out.println(minI(ar,0));
		System.out.println(maxI(ar,0));
	}

	private static int maxI(int[] ar, int idx) {
		if(idx==ar.length-1) {
			return ar[idx];
		}
		int ans = maxI(ar,idx+1);
		if(ar[idx]>ans){
			ans= ar[idx];
		}
		return ans;
	}

	private static int minI(int[] ar, int idx) {
		if(idx==ar.length-1) {
			return ar[idx];
		}
		int ans = minI(ar,idx+1);
		if(ar[idx]<ans){
			ans= ar[idx];
		}
		return ans;
	}

}
