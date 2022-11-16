package tests;

import org.testng.annotations.DataProvider;

public class Data {
	

	@DataProvider(name = "data")
	public Object[][] searchData() {
		Object[][] searchKey = new Object[3][2];
		searchKey[0][0] = "India";
		searchKey[0][1] = "Qutub Minar";

		searchKey[1][0] = "Agra";
		searchKey[1][1] = "Taj mahal";

		searchKey[2][0] = "Hyderabad";
		searchKey[2][1] = "charminar";

		return searchKey;

	}


}
