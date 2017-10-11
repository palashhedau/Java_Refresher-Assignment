package jUnitTestCases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tools.InterfaceClass;
import tools.InterfaceClassEmployee;
import tools.InterfaceClassManager;

public class InterfaceTestCase {

	@Test
	public void test() {
		InterfaceClass iC = new InterfaceClass() ; 
		int avgSal = iC.testCaseInterface( new InterfaceClassManager());
		System.out.println(avgSal);
		assertEquals(50, avgSal);		
	}


	@Test
	public void test2() {
		InterfaceClass iC = new InterfaceClass() ; 
		int avgSal = iC.testCaseInterface( new InterfaceClassEmployee());
		System.out.println(avgSal);
		assertEquals(25, avgSal);		
	}
	
	
}
