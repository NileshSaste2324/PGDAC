package oct25Assignment;

import java.util.Scanner;

public class FindVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Person Name :");
		String name = sc.nextLine();
		int count = 0;
		//String name = sc.nextLine();
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u')
				count++;
		}
		System.out.println(" Number of Vowels in Name is " +count);
	}	

}
