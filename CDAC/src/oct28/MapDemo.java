package oct28;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("RNo", 23);
		map.put("Name", "Ram");
		map.put("Fee", 45454.5);
		System.out.println(map);
		map.put("Fee", 65656.55);
		System.out.println(map);
		Object obj = map.get("Name");
		System.out.println(obj);
		map.remove("Fee");
		System.out.println(map);
		
		
	}

}
