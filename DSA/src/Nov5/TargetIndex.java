package Nov5;

public class TargetIndex {

	public static void main(String[] args) {
		int ar[]= {1,3,4,5,1,2,7,1,3,5,8,1,6,9};
		int target = 1;
		System.out.println(findIndex(ar,1,0));

	}

	private static int findIndex(int[] ar, int target, int idx) {
		if(idx==ar.length) {
			return -1;
		}
		int ans=findIndex(ar,target,idx+1);
		if(ans!=-1) {
			return ans;
		}	
//		}else {
//			if(ar[idx]==target) {
//				return idx;
//			}else {
//				return -1;
//			}
//		}
		return ar[idx]==target ? idx:-1;
	}

}
