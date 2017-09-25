package jUnitTestExamplePackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitTesting addtest = new jUnitTesting();
		int result = addtest.add(25, 55);
		assertEquals(80,result);
		
		
	}

}
