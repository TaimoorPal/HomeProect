package HomeProject;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Main {
	WebDriver driver;
	POM obj;
	@BeforeTest
	public void Setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\4397\\\\Documents\\\\SQA\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://galaxy.pk/");
		PropertyConfigurator.configure("log4j.properties");
		
	}
	@Test
	public void Test1() throws Exception {
		obj = new POM(driver);
		Thread.sleep(3000);
		obj.laptopButton.click();
		Thread.sleep(3000);

		obj.productButton.click();
		Thread.sleep(3000);

		obj.tabletButton.click();
		Thread.sleep(3000);
		obj.GetTabletNames();
		obj.GetTabletDescription();
		obj.GetTabletPrices();
	}
}
