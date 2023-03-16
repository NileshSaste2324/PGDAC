package oct28;

import java.util.Enumeration;
import java.util.Vector;

public class CollectionDemo2 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("aaa");
		v.add("bc");
		v.add("Ns");
		v.add("Rs");
		v.add(null);
		System.out.println(v);
	
		Enumeration<String> en = v.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
