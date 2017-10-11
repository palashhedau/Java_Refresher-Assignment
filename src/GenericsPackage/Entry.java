package GenericsPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Entry {

	public static void main(String args[]){
		GenericClass<Juice> obj = new  GenericClass<Juice>();
		Juice j = new Juice() ; 
		obj.liquid = j ; 
		Juice j2 =  obj.liquid ; 
		System.out.println(j2);
		
		
		
		GenericClass<Water> obj2 = new  GenericClass<Water>();
		Water w = new Water() ; 
		obj2.liquid = w ; 
		Water w2 =  obj2.liquid ; 
		System.out.println(w2);
		
		
		/////////////////////////////////////
		
		Color<Red, Green, Blue> color = new  Color<>() ; 
		
		//////////////////
		
		
		Box<String> box1 = new Box<>();
		Box<String> box2 = new Box<>();
		
		box1.setObj("Pala");
		box2.setObj("kaka");
		
		
		List<Box<String>> list = new ArrayList<>();
		list.add(box1);
		list.add(box2);
		
		///////////////////////////////////////
		
		Pair<String,String> p1 = new OrderedPair<>("Palash","Hedau");
		Pair<Integer,String> p2 = new OrderedPair<>(5,"Hedau");
		
		System.out.println(p1.getKey());
		System.out.println(p1.getValue());

		p2.getKey();
		p2.getValue();
		
		
		OrderedPair<Integer, Integer> p3  = new OrderedPair<>(10, 20);
		p3.printObject("asasa"); //unbounded
		p3.printObjectBounded(5555); //bounded
		
		//Wild Card
		p3.calculateSum(Arrays.asList(1,5,6,7));
		
		
		
	}
}
