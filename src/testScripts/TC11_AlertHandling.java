package testScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC11_AlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumE2\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("D:\\SeleniumE2\\Handson\\Selenium Webdriver\\AlertBoxDemos.html");
			driver.manage().window().maximize();

			driver.findElement(By.id("alert")).click();
			Alert simpleAlert = driver.switchTo().alert();
			System.out.println(simpleAlert.getText());
			simpleAlert.accept();
			
			driver.findElement(By.id("confirm")).click();
			Alert confirmAlert = driver.switchTo().alert();
			System.out.println(confirmAlert.getText());
			confirmAlert.dismiss();
			
			driver.findElement(By.id("prompt")).click();
			Alert promptAlert = driver.switchTo().alert();
			System.out.println(promptAlert.getText());
			promptAlert.sendKeys("Elamathi");
			promptAlert.accept();			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}