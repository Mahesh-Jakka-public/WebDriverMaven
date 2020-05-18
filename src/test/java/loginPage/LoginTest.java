package loginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
 
 public static void main(String[] args) {
 String exePath = "F:\\chromedriver.exe";
 System.setProperty("webdriver.chrome.driver", exePath);
 WebDriver driver = new ChromeDriver();
 driver.get("http://toolsqa.com/automation-practice-form/");
 }
}