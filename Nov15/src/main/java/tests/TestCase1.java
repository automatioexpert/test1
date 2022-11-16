package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest ");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After test ");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method...");

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After method \n");
	}

	@Test
	public void test1() {
		System.out.println("This is test1");
	}

	@Test
	public void test2() {
		System.out.println("This is test2 \n");
	}

}
