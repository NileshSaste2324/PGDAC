package Nov1assignment;
import java.util.Scanner;
public class LinearSearch {
	static void linearSearch(int ar[],int key) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==key) {
				System.out.println("Index of Key "+key+" is "+i);
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
		for(int a:ar) {
			System.out.print(a+" ");
		}
		System.out.println();
		//int ar[]= {1,3,4,5,6,7,8,9};
		linearSearch(ar, key);
	}
}
