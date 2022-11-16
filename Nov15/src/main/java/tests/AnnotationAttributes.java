package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnnotationAttributes {

	@Test(description = "This is test case1")
	public void testCase1() {
		System.out.println("Mobile login testcase");
		Assert.assertTrue(false);
	}

	//@Test(description = "This is test case2 ")
	@Test(timeOut = 200,dependsOnMethods = "testCase1")
	public void testCase2() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("web login testcase");
	}

	@Test(description = "This is test case3 ")
	public void testCase3() {
		System.out.println("api login testcase");
	}

	
	
}
