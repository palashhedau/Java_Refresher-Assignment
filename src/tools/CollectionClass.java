package tools;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionClass {

	public int mapsCollection(Map<Integer,String> map , String nameToFInd){
	/*	Map<Integer,String> hashMap = new HashMap<Integer,String>();
		Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
		Map<Integer,String> treeMap = new TreeMap<Integer,String>();*/
		
		map.put(10, "SAM");
		map.put(2, "ANNIE");
		map.put(333, "ZORA");
		map.put(444, "GAO");
		map.put(5, "XAVI");
		
		for(Integer i : map.keySet()){
			if(map.get(i).equalsIgnoreCase(nameToFInd)){
				System.out.println(map.get(i) + " found at "+ i );
				return i ; 
			};
			
		}
		return 0 ; 
	}
	
	public Set<String> setsCollection(Set<String> set){

		/*Set<String> s = new HashSet<String>();
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		Set<String> treeSet = new TreeSet<String>();*/
		
		set.add("XX");
		set.add("VV");
		set.add("SS");
		set.add("ZZ");
		set.add("DD");
		
		
		return set ; 
	}

	public void listCollection(List<Integer> lst){
	
	}

}
