package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorCLass {

	public static void main(String[] args) {

		List<Integer> list2 = new ArrayList<>();
		list2.add(5);
		list2.add(33);
		list2.add(2);
		list2.add(1);
		list2.add(0);
		
		
		Iterator<Integer> it = list2.iterator(); 		

		
		System.out.println();
		
		while(it.hasNext()){
			int no = it.next();
			System.out.println(no);
			
			if(no == 1){
				it.remove();
			}
			
			
		}
		
		System.out.println();
		for(int s : list2){
			System.out.println(s);
		}
		
		
		
		
	}

}
