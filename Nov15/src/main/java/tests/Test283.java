package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test283 {

	@Test
	public void verify() {
		SoftAssert sa= new SoftAssert();
		sa.assertTrue(true);
		sa.assertTrue(false);
		sa.assertTrue(true);
		sa.assertTrue(false);
		sa.assertTrue(false);
		sa.assertTrue(false);
		sa.assertTrue(false);
		sa.assertAll();
		System.out.println("Test passed");
	}
}
