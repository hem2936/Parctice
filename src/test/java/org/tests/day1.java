package org.tests;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class day1 {
	
	
	@BeforeClass
	public static void beforeclass() {
		System.out.println("Browser configiration");
	}
	
	@AfterClass
	public static void afterclass() {
		System.out.println("close the browser");
	}
	
	@Before
	public void before() {
		Date d = new Date();
		System.out.println("start"+ d);
	}
	@After
	public void after() {
		Date d = new Date();
		System.out.println("End time"+ d);
	}
	@Test
	public void testcase1() {
		System.out.println("1st test case");
	}
	@Test
	public void testcase2() {
		System.out.println("test case 2");
	}
	@Test
	public void testcase3() {
		System.out.println(1);
		System.out.println(12);
		Assert.assertTrue(true);
		System.out.println(3);
		System.out.println(14);
		

	}
	
	
	
	}


