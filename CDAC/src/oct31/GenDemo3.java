package oct31;

public class GenDemo3 {
	static <T> void show(T t) {
		System.out.println(t);
	}
	public static void main(String[] args) {
		show(123);
		show("Nilesh");
		show(true);
	}

}
