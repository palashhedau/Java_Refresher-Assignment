package jUnitTestCases;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

import tools.QueueClass;

public class QueueTestCase {

	@Test
	public void test() {
		QueueClass q = new QueueClass();
		boolean valueReturned = q.queueTestproblem(new LinkedList<String>());
		
		assertEquals(true, valueReturned);
		
	}

}
