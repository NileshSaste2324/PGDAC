package Nov1;

import java.util.Scanner;
 
	

public class ArrayReverse {
	static void reverse(int ar[]) {
		int i=0;
		int j=ar.length-1;
		while(i<j) {
			int temp= ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
			i++;
			j--;
		
		}
		System.out.println("Reverse Array is ");
		for(int a : ar) {
			//System.out.println("Reverse Array is ");
			System.out.print(a+"  ");
		
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int n = sc.nextInt();
		int ar[]= new int [n];
		for(int i=0;i<ar.length;i++) {
			System.out.println("Enter Array Elements :");
			ar[i] = sc.nextInt();
		//	System.out.print(b);
		}
//		for(int b : ar) {
//			System.out.println(b+"  ");
//		}
		
		reverse(ar);
		
	


	}

}
