package Nov1assignment;
import java.util.Scanner;
public class BinarySearch {
	static void binarySearch(int ar[],int key) {
		int si =0;
		int ei= ar.length-1;
		while(si<ei) {
			int mid = (ei+si)/2;
			if(ar[mid]==key){
				System.out.println("Index of Key "+key+" is "+mid);
				return;
			}else if (ar[mid]<key) {
				si=mid+1;
			}else {
				ei=mid-1;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Key to find");
		int key = sc.nextInt();
		System.out.println("Enter the Array Size");
		int n = sc.nextInt();
		int ar[]= new int [n];
		for(int i=0;i<ar.length;i++) {
			System.out.println("Enter Array Elements :");
			ar[i] = sc.nextInt();
		}
		//int ar[]= {1,3,4,5,6,7,8,9};
		binarySearch(ar, key);
	}
}
