package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap <Integer,String> map = new  HashMap<Integer,String>();
		
		map.put(1, "KAKAKqqqqqqqqq");
		map.put(2, "KAKAKyhyyyyyyyy");
		map.put(3, "KAKAKfffffff");
		map.put(4, "KAKAKzzzzzzzzzz");
		map.put(5, "KAKcxcx xcxAK");
		map.put(6, "KAKAffgK");
		
		
		for(Map.Entry<Integer, String> mapEntries : map.entrySet()){
			
			System.out.println(mapEntries.getKey() + " : " + mapEntries.getValue());
			
		}
		
		

	}

}
