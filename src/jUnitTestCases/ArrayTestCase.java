package jUnitTestCases;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import tools.ArrayClass;

public class ArrayTestCase {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		ArrayClass aC = new ArrayClass() ; 
		int occurance = aC.calculateOccurance(100, 3);
		
		assertEquals(19,occurance);
		
	}

}
