package oct28;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapDemo3 {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("RNo", 23);
		map.put("Name", "Ram");
		map.put("Fee", 45454.5);
		System.out.println("Traverse Key");
		Collection<Object> vals = map.values();
		for(Object obj : vals) {
			System.out.println(obj);
		}
		
		
		
	}

}
