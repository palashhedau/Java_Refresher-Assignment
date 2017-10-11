package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//ArrayList
		System.out.println("Array List");
		ArrayList<String> list = new ArrayList<>();
		list.add("asas");
		list.add("asas");
		list.add("asas");
		list.add("asas");
		
		
		for(String s : list){
			System.out.println(s);
		}
		
		list.remove(1);
		System.out.println("After removing");
		for(String s : list){
			System.out.println(s);
		}
		
		System.out.println("List");
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(2);
		list1.add(66);
		
		for(int i : list1){
			System.out.println(i);
		}
		
		
	}

}
