package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC07_DoubleClickTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumE2\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.stqatools.com/demo/DoubleClick.php");
		
		Actions action = new Actions(driver);
		action.doubleClick(driver.findElement(By.xpath("//button[contains(text(),'Click Me')]"))).build().perform();
		Thread.sleep(1000);
		action.click(driver.findElement(By.xpath("//button[contains(text(),'Click Me')]"))).build().perform();
		Thread.sleep(1000);
		action.doubleClick(driver.findElement(By.xpath("//button[contains(text(),'Click Me')]"))).build().perform();
		action.click(driver.findElement(By.xpath("//button[contains(text(),'Click Me')]"))).build().perform();	
	}

}
