package Nov11;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		map.put("India", 20200);
		map.put("USA", 100);
		map.put("Russia", 300);
		map.put("India", 25000);
		System.out.println(map);
		System.out.println(map.get("India"));
		System.out.println(map.containsKey("Russia"));
		System.out.println(map.getOrDefault("India", 300));
		System.out.println(map.containsValue(200));
		System.out.println(map.remove("USA"));
		System.out.println(map);
	}

}
