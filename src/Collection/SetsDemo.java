package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {

	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<String>();
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		Set<String> treeSet = new TreeSet<String>();
		
		
		addSetsElements(treeSet);
		
		/*
		
		//Bringing out common elements from 2 set 
		//First take the copy of the set
		
		Set <String>  commonSet = new HashSet<String>(hashSet);
		commonSet.retainAll(linkedHashSet) ;
		System.out.println(commonSet);
		
		//Different elements of Set
		Set <String>  differenceSet = new HashSet<String>(hashSet);
		differenceSet.removeAll(linkedHashSet) ;
		System.out.println(differenceSet);
		
		 */		
	}
	
	public static void addSetsElements(Set<String> s){

		s.add("XX");
		s.add("VV");
		s.add("SS");
		s.add("ZZ");
		s.add("DD");
		
		for(String se : s){
			System.out.println(se);
		}
		
	}
}
