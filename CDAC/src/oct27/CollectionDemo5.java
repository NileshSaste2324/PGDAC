package oct27;
import java.util.ArrayList;
import java.util.Collection;


public class CollectionDemo5 {

	public static void main(String[] args) {
		Collection<Integer> coll = new ArrayList<>();
			coll.add(123);
			coll.add(234);
			coll.add(4);
			coll.add(45);
			int sum = 0;
			for(Integer i : coll ) {
				
				sum += i;
			}
			System.out.println(sum);
			
	}

}
