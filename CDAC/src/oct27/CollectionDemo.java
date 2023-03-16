package oct27;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection coll = new ArrayList();
			coll.add(123);
			coll.add(234);
			coll.add("Nilesh");
			coll.add(45.67);
			System.out.println(coll);
			coll.remove(123);
			System.out.println(coll);
			
	}

}
