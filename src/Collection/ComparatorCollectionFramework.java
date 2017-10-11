package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorCollectionFramework {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("mamarrrrrrrr");
		list.add("mamaqqqqqqqqqqqqqqqqqq");
		list.add("mama333333333");
		list.add("mama2222222222222");
		list.add("mama222222");
		
		Collections.sort(list);
		
		for(String s : list){
			System.out.println(s);
		}
		
		
		System.out.println();
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(5);
		list2.add(33);
		list2.add(2);
		list2.add(1);
		list2.add(0);
		
		Collections.sort(list2);
		
		for(int s : list2){
			System.out.println(s);
		}
		
		System.out.println();
		
		// Sorting on the basis of string length
		
		List<String> list3 = new ArrayList<String>();
		list3.add("mamarrrrrrrr");
		list3.add("mamaqqqqqqqqqqqqqqqqqq");
		list3.add("mama333333333");
		list3.add("mama2222222222222");
		list3.add("mama222222");
		
		Collections.sort(list, new StringLengthComparator());
		
		for(String s : list){
			System.out.println(s);
		}
		
		System.out.println();

		
		
		//Object
		List<Person>  list4 = new ArrayList<>();
		
		
		list4.add(new Person(22222,"Sam"));
		list4.add(new Person(222,"Sam"));
		list4.add(new Person(2222,"Sam"));
		list4.add(new Person(2,"Sam"));
		list4.add(new Person(122,"Sam"));
		
		
		Collections.sort(list4 , new Comparator<Person>(){

			@Override
			public int compare(Person p1, Person p2) {
				if(p1.getId() > p2.getId()){
					return 1;
				}else if (p1.getId() < p2.getId()){
					return -1 ; 
				}
				return 0;
			}
			
		});
		
		
		for(Person p : list4){
			System.out.println(p.getData()); 
		}
		
		
		
		
		
		
	}

}


class Person{
	private int id ; 
	private String name ;
	
	public Person(int id , String name){
		this.id = id ; 
		this.name = name ;	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	
	public String getData(){
		return id +" : " + name ; 
	}
	
	
}


class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String arg0, String arg1) {
		
		
		
		if(arg0.length() > arg1.length()){
			return 1 ;
		}else if(arg0.length() < arg1.length()){
			return -1 ;
		}else{
			return 0;
		}
		
	}
	
}


