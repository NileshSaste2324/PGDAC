package oct27;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;


public class CollectionDemo10 {

	public static void main(String[] args) {
		ArrayList<Integer> coll = new ArrayList<>();
			coll.add(123);
			coll.add(234);
			coll.add(4);
			coll.add(45);
			coll.add(null);
			
			for(int i=0; i<coll.size();i++) {
				System.out.println(coll.get(i));
			
			}
	}

}
