package testScripts;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC17_Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumE2\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("https://chercher.tech/practice/frames");
			driver.manage().window().maximize();
			
			String topic = driver.findElement(By.xpath("//div[@class='content-wrapper']//span")).getText();
			System.out.println("Topic " + topic);
			
			driver.switchTo().frame("frame1");
			WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
			textBox.sendKeys(topic);
			
			WebElement thirdFrame = driver.findElement(By.id("frame3"));
			driver.switchTo().frame(thirdFrame);
			driver.findElement(By.xpath("//input[@id='a' and @type='checkbox']")).click();
			
			driver.switchTo().parentFrame();
			textBox.clear();
			textBox.sendKeys("Hello World!!");
			
			driver.switchTo().defaultContent();
			driver.switchTo().frame("frame2");
			Select selectElement = new Select(driver.findElement(By.id("animals")));
//			selectElement.selectByValue("babycat");
			selectElement.selectByVisibleText("Baby Cat");
			
			TakesScreenshot takescreenshot = (TakesScreenshot)driver;
			File sourceFile = takescreenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(sourceFile, new File("D:\\SeleniumE2\\Workspace\\Webdriver\\src\\Screenshots\\TC13_IFrames.jpg"));
			
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
