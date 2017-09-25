package jUnitTestExamplePackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitTesting addtestStrings = new jUnitTesting();
		String result = addtestStrings.add1("Indu", "Yadav");
		assertEquals("InduYadav",result);
	}

}
