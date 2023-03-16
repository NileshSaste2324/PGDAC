package oct27;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;


public class CollectionDemo9 {

	public static void main(String[] args) {
		HashSet<Integer> coll = new HashSet<>();
			coll.add(123);
			coll.add(234);
			coll.add(4);
			coll.add(45);
			coll.add(null);
			
			System.out.println(coll);
//				System.out.println(coll.get(0));
//			coll.remove(0);
//			System.out.println(coll);
//			System.out.println(coll.get(0));
			
	}

}
