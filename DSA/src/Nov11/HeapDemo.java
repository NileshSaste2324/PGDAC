package Nov11;

import java.util.PriorityQueue;

public class HeapDemo {
	public static class Pair{
		int ele;
		int i;
		int j;
		Pair(){}
		public Pair(int ele, int i, int j) {
			this.ele = ele;
			this.i = i;
			this.j = j;
		}
		
	}
	public static int kthSmallest(int[][]arr,int k) {
		PriorityQueue<Pair> pq = new PriorityQueue<>((Pair a,Pair b) ->{
			return a.ele-b.ele;
		});
		int n = arr.length;
		int m = arr[0].length;
		for(int i=0;i<n;i++) {
			pq.add(new Pair (arr[i][0],i,0));
		}
		while(--k>0) {
			Pair p =pq.poll();
			int val = p.ele;
			int x = p.i;
			int y = p.j;
			if(++y <m) {
				pq.add(new Pair(arr[x][y],x,y));
			}
		}
		Pair ans = pq.poll();
		int final_ans = ans.ele;
		return final_ans;
	}

	public static void main(String[] args) {
		int arr[][]= {{2,3,5,8},
					{4,5,8,9},
					{5,8,9,10},
					{8,9,11,12}};
		System.out.println(kthSmallest(arr,13));
	}
}
