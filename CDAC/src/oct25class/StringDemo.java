package oct25class;

public class StringDemo {

	public static void main(String[] args) {
		String s ="abcd";
		System.out.println(s);
		char ar[] = {'a','v','c','d'};
		String s1 = new String(ar);
		System.out.println(s1);
		byte ar1 [] = {65,56,78,69};
		String s2 = new String(ar1);
		System.out.println(s2);
		char ch = '\u0061';
		System.out.println(ch);
		String s3 = new String(s);
		System.out.println(s3);
		
	}

}
