package oct31;

import java.util.ArrayList;

public class GenDemo5 {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		ArrayList<Number> l1 = new ArrayList<Number>();
		ArrayList<Object> l2 = new ArrayList<Object>();
		show(l);
		show(l1);
		show(l2);
	}
	static void show(ArrayList<?> lst) {
		System.out.println(lst);
	}
}
