package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC09_KeyboardEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumE2\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demo.opencart.com/");
		
		driver.findElement(By.name("search")).sendKeys("Laptops");
		driver.findElement(By.xpath("//*[@id='search])/span/button")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.name("search")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.name("search")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.name("search")).sendKeys(Keys.chord(Keys.SHIFT,"P"));
	}

}
