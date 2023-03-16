package Nov10;

import java.util.Scanner;

public class RecursionFun {
	public static void reverse(String str) {
		if((str==null)||(str.length()<=1)) {
			System.out.println(str);
		}else {
			System.out.print(str.charAt(str.length()-1));
			reverse(str.substring(0,str.length()-1));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter String: ");
		String str = sc.next();
		//String str="NILESH SASTE";
		reverse(str);
	}
}
