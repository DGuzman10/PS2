package pkgShape;

import static org.junit.Assert.*;

import org.junit.After;

import org.junit.AfterClass;

import org.junit.Before;

import org.junit.BeforeClass;

import org.junit.Test;

public class MyIntegerTestCase {
	
	public static MyInteger object;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		object = new MyInteger(25);
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertFalse(object.isEven());
		
		assertTrue(object.isOdd());
		
		assertFalse(object.isPrime());
		
		assertTrue(object.equals(25));
		
		assertFalse(object.equals(50));
		
		assertTrue(object.equals(object));
	}

}
