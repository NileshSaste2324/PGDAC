package oct27;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class CollectionDemo8 {

	public static void main(String[] args) {
		Collection<Integer> coll = new ArrayList<>();
			coll.add(123);
			coll.add(234);
			coll.add(4);
			coll.add(45);
			
			Iterator<Integer> it = coll.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
				it.remove();
			}
				System.out.println(coll);
			
			
	}

}
