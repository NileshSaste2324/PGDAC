package oct26;

public class SringBuilder4 {

	public static void main(String[] args) {

		StringBuilder s  = new StringBuilder("ABCDEF");
		System.out.println(s);
		s.replace(2, 4, "444777777");
		System.out.println(s); 
	}

}
