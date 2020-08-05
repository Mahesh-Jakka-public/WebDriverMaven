package loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp()  {
	System.setProperty("webdriver.chrome.driver", "F:\\SeleniumJars\\chromedriver.exe");
	driver = new ChromeDriver();
	   }
	
	@Test
	public void doLogin() throws InterruptedException {
		
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("trainer@way2automation.com");
		Thread.sleep(1000);
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("sdss");
		Thread.sleep(1000);
		
		
		
	}

	@Test
	public void print(){
	
	System.out.println("Method Printed");

	}
	
	@AfterTest
	public void tearDown() {
	driver.quit();
	}

}
