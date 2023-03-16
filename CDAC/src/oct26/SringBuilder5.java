package oct26;

public class SringBuilder5 {

	public static void main(String[] args) {

		StringBuilder s  = new StringBuilder();
		System.out.println(s.capacity());
		
		System.out.println(s.length());
		s.append("12233445545");
		System.out.println(s.capacity());
		
		System.out.println(s.length());
		s.append("0000077777");
		System.out.println(s.capacity());
		
		System.out.println(s.length());
		
	}

}
