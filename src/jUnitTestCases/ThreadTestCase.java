package jUnitTestCases;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Test;

import tools.ThreadA ;

public class ThreadTestCase {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		ThreadA a = new ThreadA();
		boolean output = a.startBooking(5) ; 
		
		assertEquals(false , output) ;
		
	}

}
