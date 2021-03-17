package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC04_WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumE2\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("D:\\SeleniumE2\\Handson\\Selenium Webdriver\\WebTable.html");
			driver.manage().window().maximize();
			
			List<WebElement> tableElement = driver.findElements(By.xpath("//table/tbody/tr"));
			System.out.println("Table Size =>" + tableElement.size());
			
			for(WebElement webelement : tableElement)
				System.out.println(webelement.getText());			

			driver.findElement(By.xpath("//td[contains(text(),'HardDisk')]//preceding-sibling::td//input[@type='checkbox']")).click();
			String laptopprice = driver.findElement(By.xpath("//td[contains(text(),'HardDisk')]//following-sibling::td")).getText();
			System.out.println("Laptop price " + laptopprice);
			
		}		
		catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					driver.close();
					driver.quit();
				}

	}

}
