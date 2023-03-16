package Nov1;

import java.util.Scanner;

public class Fabonacci {
static void fab(int n) {
	int i=0;
	int j=1;
	int sum =0;
	while(j<n) {
		sum = i+j;
		i=j;
		j=sum;
		System.out.print(sum+" ");
	}
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		fab(n);

	}

}
