package oct27;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.TreeSet;


public class CollectionDemo13 {

	public static void main(String[] args) {
		TreeSet<Integer> coll = new TreeSet<>();
			coll.add(123);
			coll.add(234);
			coll.add(4);
			coll.add(45);
		//	coll.add(null);
			
			System.out.println(coll);
//				System.out.println(coll.get(0));
//			coll.remove(0);
//			System.out.println(coll);
//			System.out.println(coll.get(0));
			
	}

}
