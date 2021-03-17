package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC12_WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumE2\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("https://www.stqatools.com/demo/Windows.php");
			driver.manage().window().maximize();
			
			/***************************************** New tab ****************************************************/
			
			
			String parentTab = driver.getWindowHandle();
			driver.findElement(By.xpath("//div[@class='container']//a/button[contains(text(),'open new Tab')]"))
					.click();
			Set<String> multipleTabs = driver.getWindowHandles();
			for (String childTab : multipleTabs) {
				if (!childTab.equalsIgnoreCase(parentTab)) {
					driver.switchTo().window(childTab);
					break;
				}
			}

			driver.findElement(By.xpath("//span[contains(text(),'Selenium')]")).click();
			Thread.sleep(1000);
			driver.close();

			driver.switchTo().window(parentTab);
			
//			driver.findElement(By.xpath("//*[contains(text(),'Home')]")).click();
//			driver.findElement(By.xpath("//a[@id='navbarDropdownPortfolio' and contains(text(),'Switch')]")).click();
//			driver.findElement(By.xpath("//a[@class='dropdown-item' and contains(text(),'Windows')]")).click();
						
			/***************************************** New window ****************************************************/
			
			driver.findElement(By.xpath("//div[@class='container']//a/button[contains(text(),'open new Window')]")).click();
			String parentWindow = driver.getWindowHandle();
			Set<String> multipleWindows = driver.getWindowHandles();
			for(String childWindow : multipleWindows) {
				if(!parentWindow.equalsIgnoreCase(childWindow) && (!parentTab.equalsIgnoreCase(childWindow))) {
					driver.switchTo().window(childWindow);					
				}
			}
			
			driver.findElement(By.xpath("//div[@class='container']//a/button[contains(text(),'New Message')]")).click();
			String newMessageWindow = driver.getWindowHandle();
			Set<String> newMessageMultipleWindows = driver.getWindowHandles() ;
			for(String messageMultipleWindows : newMessageMultipleWindows) {
				if(!parentWindow.equalsIgnoreCase(messageMultipleWindows) && (!parentTab.equalsIgnoreCase(messageMultipleWindows)) 
						&& (!newMessageWindow.equalsIgnoreCase(messageMultipleWindows))) {
					driver.switchTo().window(messageMultipleWindows);
				}
			}
			
			driver.close();			
			
			driver.switchTo().window(newMessageWindow);			
			driver.close();
			
			driver.switchTo().window(parentWindow);
			driver.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
//			driver.close();
//			driver.quit();
		}
	}

}
