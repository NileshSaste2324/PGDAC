package oct26;

public class SringBuilder2 {

	public static void main(String[] args) {
		String s = "ABCDEF";
		StringBuilder sb  = new StringBuilder(s);
		sb.reverse();
		s = sb.toString();
		System.out.println(s); 
	}

}
