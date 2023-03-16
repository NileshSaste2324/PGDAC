package oct28;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
class Product{
	
	int prodNo;
	String prodName;
	public Product(int prodNo, String prodName) {
		super();
		this.prodNo = prodNo;
		this.prodName = prodName;
	}
	@Override
	public String toString() {
		return  prodNo + " " + prodName ;
	}
	
}
public class MapDemo7 {

	public static void main(String[] args) {
		TreeMap<String, Object> map = new TreeMap<>();
		map.put("p1", new Product(10,"PC"));
		map.put("p2", new Product(20,"Mobile"));
		map.put("p3", new Product(30,"AC"));
		System.out.println(map);
		
		
		
		
	}

}
