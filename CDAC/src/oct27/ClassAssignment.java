package oct27;

import java.util.Scanner;

public class ClassAssignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Upper Limit :");
		int n = sc.nextInt();
		for(int i=1; i<=n;i++) {
			if( i%3==0 && i%5==0){
				System.out.println("TrizzFizz");
			}else if (i%3==0){
				System.out.println("Thrizz");
			}else if(i%5==0) {
				System.out.println("Fizz");
			}else
				System.out.println(i);
		
		}
	}

}
