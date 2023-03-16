package oct28;

import java.util.ArrayList;
import java.util.Collections;


public class CollectionDemo4 {

	public static void main(String[] args) {
		ArrayList<Integer> coll = new ArrayList<>();
		coll.add(11);
		coll.add(22);
		coll.add(14);
		coll.add(45);
	//	coll.add(null);
		System.out.println(coll);
		Collections.sort(coll);
		System.out.println(coll);
	
	}

}
