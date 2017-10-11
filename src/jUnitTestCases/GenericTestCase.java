package jUnitTestCases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tools.Dog;
import tools.GenericMainClass;
import tools.Rabbit;

public class GenericTestCase {

	@Test
	public void test() {
		Dog d = new Dog();		
		GenericMainClass obj = new GenericMainClass();
		String output = obj.CallAnimals(d);  
		assertEquals("Lets take out dog", output);	
		
	}
	
	@Test
	public void test2() {
		Rabbit d = new Rabbit();		
		GenericMainClass obj = new GenericMainClass();
		String output = obj.CallAnimals(d);  
		assertEquals("Lets take out rabbit", output);	
		
	}

}
