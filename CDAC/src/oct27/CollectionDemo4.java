package oct27;
import java.util.ArrayList;
import java.util.Collection;


public class CollectionDemo4 {

	public static void main(String[] args) {
		Collection coll = new ArrayList();
			coll.add(123);
			coll.add(234);
			coll.add("Nilesh");
			coll.add(45.67);
			System.out.println(coll);
		Collection coll1 = new ArrayList();
			coll1.add(234);
			coll1.add("Nilesh");
			coll1.add(45.90);
			System.out.println(coll1);
			
			coll.retainAll(coll1);
			System.out.println(coll);
			System.out.println(coll1);
			
	}

}
