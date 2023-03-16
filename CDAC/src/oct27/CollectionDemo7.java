package oct27;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;


public class CollectionDemo7 {

	public static void main(String[] args) {
		Collection<Integer> coll = new ArrayList<>();
			coll.add(123);
			coll.add(234);
			coll.add(4);
			coll.add(45);
			
			ListIterator<Integer> it = ((ArrayList<Integer>) coll).listIterator();
			while(it.hasNext()) {
				System.out.println(it.next());
				
			}
				System.out.println("========");
				while(it.hasPrevious()){
					System.out.println(it.previous());
				}
					
			
	}

}
