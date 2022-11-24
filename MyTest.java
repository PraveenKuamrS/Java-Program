package com.edu;



import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyTest {

	@Test
	public void test() {
		System.out.println("Inside test");
		//fail("Not yet implemented");
	}
@Test
	public void test1() {
		String s="hi";
		System.out.println("inside test1");
		assertEquals("h",s);
	}

@Before
public void beforeTest() {
	System.out.println("before each testcase");
}
@After
public void afterTest() {
	System.out.println("after each testcase");
	
}
@BeforeClass
public static  void beforeClass() {
	System.out.println("Before all the method");
}

@AfterClass
public static void afterClass() {
	System.out.println("After all the method");
}
}
