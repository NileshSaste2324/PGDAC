package Nov1;

import java.util.Scanner;

public class rotateOfArray {
	public static void reverse(int ar[],int si,int ei) {
		while(si<ei) {
			swap(ar,si,ei);
			si++;
			ei--;
		}
		
	}
	public static void swap(int ar[],int i,int j) {
		int temp = ar[i];
		ar[i]=ar[j];
		ar[j]=temp;
	}
	public static void rotateArray(int ar[],int n,int k) {
		k=k%n;
		if(k<0) {
			k=k+n;
		}
		reverse(ar,n-k,n-1);
		reverse(ar,0,n-k-1);
		reverse(ar,0,n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int n = sc.nextInt();
		int ar[]= new int [n];
		int k = sc.nextInt();
		for(int i=0;i<ar.length;i++) {
			System.out.println("Enter Array Elements :");
			ar[i] = sc.nextInt();
		}
		for(int b:ar) {
			System.out.print(b+" ");
			
		}
		System.out.println();
		rotateArray(ar,n,k);
		for(int a:ar) {
			System.out.print(a+" ");
		}
	}

}
