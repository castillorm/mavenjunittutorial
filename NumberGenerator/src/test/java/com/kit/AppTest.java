package com.kit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void testLengthOfTheUniqueKey() {

		App obj = new App();
		assertEquals(36, obj.generateUniqueKey().length());

	}
	
	public void testSayHello() {

		App obj = new App();
		assertEquals("Hello World!", obj.sayHello());

	}
}
