package jUnitTestCases;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

import tools.StackClass;

public class StackTestCase {

	StackClass s = new StackClass() ; 
	Stack<String> laundryBag = new Stack<String>();
	
	@Test
	public void test() {
	
	laundryBag.empty() ; 
	
	System.out.println("Adding t-shirts sequentially in laundry bag");
	//Putting t-shirts in the laundry bag
	laundryBag.push("CaptainAmerica");
	laundryBag.push("Hulk");
	laundryBag.push("Iron Man");
	laundryBag.push("Batman");
	laundryBag.push("Flash");
	
	int shirtSeqNumber = s.testStackMethod(laundryBag, "Hulk");
	assertEquals(2, shirtSeqNumber);
	}
	
	@Test
	public void test1() {
	
	laundryBag.empty() ;
	
	System.out.println("Adding t-shirts sequentially in laundry bag");
	//Putting t-shirts in the laundry bag
	laundryBag.push("CaptainAmerica");
	laundryBag.push("Hulk");
	laundryBag.push("Iron Man");
	laundryBag.push("Batman");
	laundryBag.push("Flash");
	
	int shirtSeqNumber = s.testStackMethod(laundryBag, "Flash");
	assertEquals(5, shirtSeqNumber);
	}
	
	
}
