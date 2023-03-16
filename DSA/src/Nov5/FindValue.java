package Nov5;

public class FindValue {

	public static void main(String[] args) {
		int ar[]= {5,1,3,2,4,8,9,10};
		System.out.println(find(ar,0,13));
	

	}

	private static boolean find(int[] ar, int idx, int data) {
		if(idx==ar.length) {
			return false;
		}
		if(ar[idx]==data) {
			return true;
		}
		boolean ans = find(ar,idx+1,data);
		return ans;
	}
}