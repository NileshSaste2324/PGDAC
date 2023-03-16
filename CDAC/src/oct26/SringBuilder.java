package oct26;

public class SringBuilder {

	public static void main(String[] args) {

		StringBuilder s  = new StringBuilder("ABCDEF");
		System.out.println(s);
		s.insert(2, "444");
		System.out.println(s); 
	}

}
