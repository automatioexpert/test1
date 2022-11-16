package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
/*
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

	} */

	@Test(dataProvider = "data",dataProviderClass=Data.class)
	public void testGoogleSearch(String country, String monument) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");

		WebElement searchBox = driver.findElement(By.cssSelector("input[name='q']"));
		searchBox.sendKeys(country + " " + monument);
		
		driver.findElement(By.name("btnK")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(5500);
		driver.quit();
	}

}
