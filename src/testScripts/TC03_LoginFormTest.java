package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC03_LoginFormTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumE2\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("D:\\SeleniumE2\\Handson\\Selenium Webdriver\\LoginForm.html");
			driver.manage().window().maximize();

			driver.findElement(By.cssSelector("#loginForm"));

			/* All possible combinations of css selector for username */
//			driver.findElement(By.cssSelector(".inputtext")).sendKeys("TestUser");
//			driver.findElement(By.cssSelector("input[name='username']")).sendKeys("TestUser");
//			driver.findElement(By.cssSelector("input.inputtext")).sendKeys("TestUser");			
//			driver.findElement(By.cssSelector("input#pwd")).sendKeys("TestUser01");

			/* All possible combinations of xpath for username and password */
//			driver.findElement(By.xpath("//input[@class='inputtext' and @type='text']")).sendKeys("TestUser");
//			driver.findElement(By.xpath("//input[@class='inputtext' or @type='text']")).sendKeys("TestUser");
//			driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("TestUser");
//			driver.findElement(By.xpath("//*[@id='pwd' and @type='text']")).sendKeys("TestUser01");
//			driver.findElement(By.xpath("//*[@id='pwd' or @name='password']")).sendKeys("TestUser01");
//			driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("TestUser01");

//			String submitAttribute = driver.findElement(By.xpath("//input[@type='submit']")).getAttribute("value");
//			System.out.println("SubmitAttribute " + submitAttribute);

//			driver.findElement(By.xpath("//input[@type='submit']")).click();
//			driver.findElement(By.xpath("//input[@type='submit']")).submit();
			
//			driver.findElement(By.xpath("//a[contains(text(),'Page')]")).click();
//			driver.findElement(By.xpath("//a[contains(text(),'Page')][2]")).click();
			
//			driver.findElement(By.xpath("//a[starts-with(text(),'Google')]")).click();
//			driver.findElement(By.xpath("//a[starts-with(@name,'Google')]")).click();
			
			driver.findElement(By.xpath("//a[text()='Selenium Tutorial']")).click();
		}

		catch (

		Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			driver.close();
			driver.quit();
		}
	}

}
