package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auth {
	
	@Test
	public void auth() {
		System.out.println("I am the best");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		System.out.println("Test passed.Thank God!!");
		System.out.println(driver.findElement(By.cssSelector("h3+p")).getText());
		driver.quit();
	}

}
