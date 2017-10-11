package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		//ArrayList uses array internally
		// use it when you want to add in the end
		// fast when added in the end
		ArrayList<Integer> arr = new ArrayList<>();
		
		
		//LinkedList uses reference to other objects
		//use this when you want to add anywhere 
		//fast when added to the front
		LinkedList<Integer> link = new LinkedList<>();
		
		doTiming("ArrayList : ", arr);
		doTiming("LinkedList : ", link);
	}

	public static void doTiming(String type , List<Integer> list){
		
		for (int i = 0; i < 10000; i++) {
			list.add(i);
		}
		
		
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) {
			list.add(0,i);
		}
		
		
		long stop = System.currentTimeMillis();
		
		System.out.println(type + " " + (stop - start));
		
		
	}
}
