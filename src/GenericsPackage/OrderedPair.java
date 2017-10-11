package GenericsPackage;

import java.util.Iterator;
import java.util.List;

public class OrderedPair<K, V> implements Pair<K, V> {
	public K key ; 
	public V value ; 
		
	public OrderedPair(K key , V value) {
		this.key = key ; 
		this.value = value ; 
	}
	
	
	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return this.key;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return this.value;
	}

	//Adding Generics at method level
	
	public <U> void printObject(U u ){
		System.out.println(key.getClass().getName());
		System.out.println(u.getClass().getName());
		
	}
	
	//bounded
	public <U extends Number> void printObjectBounded(U u ){
		System.out.println(key.getClass().getName());
		System.out.println(u.getClass().getName());
		
	}
	
	//Wild Card
	public void calculateSum(List<? extends Number> numbers){ //UpperBound .. as Number is higher class
		int total = 0 ; 
		for(Number n : numbers){
			total += n.intValue() ;
		}
		
		System.out.println("SUm is " + total);
	}
	
	
	
}
