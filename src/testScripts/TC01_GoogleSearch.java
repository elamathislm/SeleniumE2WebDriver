package testScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01_GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumE2\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {

			String inputText = "Java Tutorial";
			
			//Launched the driver and identified the search element in google
			driver.get("http://www.google.com");		// driver.navigate().to("http://www.google.com");
			driver.manage().window().maximize();			
			WebElement googleSearchElement = driver.findElement(By.name("q"));
			
			// Passed the input text (as a variable) to write in google search box
			googleSearchElement.sendKeys(inputText);
			googleSearchElement.submit();              // googleSearchElement.sendKeys(Keys.ENTER);
			
			System.out.println("Title ->" + driver.getTitle());
			System.out.println("Current URL ->" + driver.getCurrentUrl());
			
			// Navigate 
//			driver.navigate().back();
//			driver.navigate().forward();					
			
//			Thread.sleep(1000);
			
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
//			List<WebElement> listOFElements = driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@class='sbtc']"));
			List<WebElement> listOFElements = driver.findElements(By.xpath("//ul[@role='listbox']//div[@class='sbtc']"));
			
			System.out.println("size" + listOFElements.size());
			boolean val = false;
			for(WebElement webelemnt: listOFElements) {
				if(webelemnt.getText().equalsIgnoreCase("geeksforgeeks")) {
					val = true;
					break;
				}
				
				if(val)
					break;				
				System.out.println(webelemnt.getText());
			}						
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			driver.close();
			driver.quit();
		}
	}

}
