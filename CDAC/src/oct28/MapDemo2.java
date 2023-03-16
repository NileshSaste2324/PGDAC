package oct28;

import java.util.HashMap;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("RNo", 23);
		map.put("Name", "Ram");
		map.put("Fee", 45454.5);
		System.out.println("Traverse Key");
		Set<String> keys = map.keySet();
		for(String s : keys) {
			System.out.println(s);
		}
		
		
		
	}

}
