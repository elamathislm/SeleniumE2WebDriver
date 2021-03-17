package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC14_FramesAndAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumE2\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("https://www.stqatools.com/demo/Frames.php");
			driver.manage().window().maximize();
						
			String header = driver.findElement(By.xpath("//strong/div[@id='mytext']")).getText();
			System.out.println("Header value " + header);			
			
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='Alerts.php']")));			
			driver.findElement(By.xpath("//button[@id='btnAlert']")).click();
			driver.findElement(By.xpath("//div[@id='ezAlerts-footer']//button[@class='btn btn-danger']")).click(); // not working need to checkdd
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
