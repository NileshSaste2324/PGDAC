package Nov1;

import java.util.Scanner;
 
	

public class BinaryLowerBoundSearch {
	static void binaryLowerBound(int ar[],int target) {
		int si =0;
		int ei= ar.length-1;
		while(si<ei) {
			int mid = (ei+si)/2;
			if(ar[mid]==target){
				if((mid-1 >= 0) && (target == ar[mid-1])) {
					ei = mid-1;
				}else {
				System.out.println(mid);
				return;
				}
				
			}else if (ar[mid]<target) {
				si=mid+1;
			}else if (ar[mid]>target) {
				ei=mid-1;
			}
		}
	}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Element to find");
//		int target = sc.nextInt();
//		System.out.println("Enter the Array Size");
//		int n = sc.nextInt();
//		
//		int ar[]= new int [n];
//		for(int i=0;i<ar.length;i++) {
//			System.out.println("Enter Array Elements :");
//			ar[i] = sc.nextInt();
//	
//		}
		int ar[]= {1,3,4,5,6,6,6,7,8,9};
		int target = 6;
		binaryLowerBound(ar, target);
		
	


	}

}
