package oct28;

import java.util.ArrayDeque;
import java.util.Enumeration;
import java.util.Vector;

public class CollectionDemo3 {

	public static void main(String[] args) {
		ArrayDeque<String> ad = new ArrayDeque<>();
		ad.add("ac");
		ad.add("Ram");
		ad.add("rrr");
		ad.add("Tuu");
		
				
		System.out.println(ad);
	System.out.println(ad.peek());
	System.out.println(ad.poll());
	System.out.println(ad);
	System.out.println(ad.pop());
	System.out.println(ad);
	
	}

}
