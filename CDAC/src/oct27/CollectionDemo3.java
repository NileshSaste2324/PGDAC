package oct27;
import java.util.ArrayList;
import java.util.Collection;


public class CollectionDemo3 {

	public static void main(String[] args) {
		Collection coll = new ArrayList();
			coll.add(123);
			coll.add(234);
			coll.add(4);
			coll.add(45);
			int sum = 0;
			for(Object i : coll ) {
				Integer j = (Integer)i;
				sum += j;
			}
			System.out.println(sum);
			
	}

}
