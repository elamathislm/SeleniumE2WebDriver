package testScripts;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC02_TestAndQuiz {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumE2\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			
			//Launched the driver and identified the search element in google
			driver.get("https://www.testandquiz.com/selenium/testing.html");
			driver.manage().window().maximize();			
			//driver.getTitle();
			driver.findElement(By.id("fname")).sendKeys("Elamathi");
			driver.findElement(By.xpath("//button[@title='Click me!!']")).click();
			driver.findElement(By.xpath("//input[@name = 'gender' and @value ='female']")).click();
			driver.findElement(By.cssSelector(".Automation")).click();		
			
			System.out.println(driver.findElements(By.tagName("input")).size());
			List<WebElement> listofInputTag = driver.findElements(By.tagName("input"));
			for(WebElement element : listofInputTag)
			{
				System.out.println(element.getAttribute("name"));				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			driver.close();
		}
		
	}

}
