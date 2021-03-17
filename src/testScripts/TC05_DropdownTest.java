package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC05_DropdownTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumE2\\WebDrivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
			driver.manage().window().maximize();
			Select selectElement = new Select(driver.findElement(By.id("select-demo")));
			List<WebElement> listOFElements = selectElement.getOptions();
			for (WebElement webElement : listOFElements) {
				System.out.println(webElement.getText());
			}

			selectElement.selectByValue("Wednesday");

			Select selectMultipleElement = new Select(driver.findElement(By.id("multi-select")));
			if (selectMultipleElement.isMultiple()) {
				selectMultipleElement.selectByValue("California");
				selectMultipleElement.selectByVisibleText("Texas");
				selectMultipleElement.selectByIndex(1);
				selectMultipleElement.selectByVisibleText("New York");
				List<WebElement> listOfSelectedElements = selectMultipleElement.getAllSelectedOptions();
				for (WebElement selectedElement : listOfSelectedElements) {
					System.out.println(selectedElement.getText());
				}

//			selectMultipleElement.deselectAll();
				selectMultipleElement.deselectByIndex(7);
			}
		} catch (Exception e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
//		driver.close();
//		driver.quit();
		}

	}

}
