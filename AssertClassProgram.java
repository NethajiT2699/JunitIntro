package junitIntro;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.Test;

public class AssertClassProgram {
	
	@Test
	public void testAssertEquals() {
		assertEquals(10,10);
	}
	@Test
	public void testAssertNotEqu() {
		assertNotEquals('c','b');
	}
	@Test
	public void assertNulltest() {
		assertNull("java","");    
	}
	@Test
	public void assertSameTest() {
		assertSame("hello","java");
	}
	@Test
	public void assertNotNullTest() {
		assertNotNull(null,null);
	}
	@Test
	public void testBoolean() {
		String x="hello world";
		String y="hello";
		assertTrue(x.equals(y));
	}
	@Test
	public void testArray() {
		int[] x= {12,4,1};
		int[] y= {12,4,1};
		assertArrayEquals(x, y);
	}
	
	
	

}
