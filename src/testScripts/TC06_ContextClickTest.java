package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC06_ContextClickTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumE2\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		Actions action = new Actions(driver);
		action.contextClick(driver.findElement(By.id("fname"))).perform();
		
		
//		action.clickAndHold(driver.findElement(By.id("sourceImage"))).build().perform();
//		action.dragAndDrop(driver.findElement(By.id("sourceImage")), driver.findElement(By.id("targetDiv"))).build().perform();		
	}

}
