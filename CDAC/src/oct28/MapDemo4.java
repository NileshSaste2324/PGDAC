package oct28;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo4 {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("RNo", 23);
		map.put("Name", "Ram");
		map.put("Fee", 45454.5);
		System.out.println("Traverse Key");
		Set<Entry<String, Object>> s = map.entrySet();
		for(Entry<String, Object> en : s ) {
			System.out.println(en.getKey());
			System.out.println(en.getValue());
		}
		
		
	}

}
