package jUnitTestCases;

import static org.junit.Assert.assertEquals;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.junit.After;
import org.junit.Test;

import tools.CollectionClass;

public class CollectionTestCase {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		CollectionClass c = new CollectionClass();
		Map<Integer,String> treeMap = new TreeMap<Integer,String>();
		int output = c.mapsCollection(treeMap,"GAO");
		
		assertEquals(444,output );
		
		
	}
	
	@Test
	public void test2() {
		CollectionClass c = new CollectionClass();
		Set<String> treeSet = new TreeSet<String>();
		Set<String> treeSetClone = c.setsCollection(treeSet);
		
		Set<String> treeSet2 = new LinkedHashSet<String>();
		treeSet2.add("DD");
		treeSet2.add("SS");
		treeSet2.add("VV");
		treeSet2.add("XX");
		treeSet2.add("ZZ");
		System.out.println();
		
		assertEquals(treeSet2.size(),treeSetClone.size() );
		
	}

}
