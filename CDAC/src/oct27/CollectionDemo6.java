package oct27;
import java.util.ArrayList;
import java.util.Collection;


public class CollectionDemo6 {

	public static void main(String[] args) {
		Collection<Integer> coll = new ArrayList<>();
			coll.add(123);
			coll.add(234);
			coll.add(4);
			coll.add(45);
			
			for(Integer e : coll ) {
				System.out.println(e);
				coll.remove(123);
			
			}
			
			
	}

}
