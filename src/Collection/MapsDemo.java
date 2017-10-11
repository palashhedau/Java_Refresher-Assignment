package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> hashMap = new HashMap<Integer,String>();
		Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
		Map<Integer,String> treeMap = new TreeMap<Integer,String>();
		
		//Tree have sorted value on key basis 
		
		addValues(treeMap);
		
	}
	
	public static void addValues(Map<Integer,String> map){
		
		map.put(10, "S");
		map.put(2, "A");
		map.put(333, "Z");
		map.put(444, "G");
		map.put(5, "X");
		
		
		for(Integer i : map.keySet()){
			
			String value  = map.get(i);
			System.out.println(i + " : " + value);
			
		}
		
		
		
	}
	

}
