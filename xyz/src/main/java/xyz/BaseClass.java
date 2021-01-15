package xyz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseClass {

public static String baseUrl= "https://sakshingp.github.io/assignment/login.html";
	
	
	
	public WebDriver setup() {
		//C:\Users\vilaz\eclipse-workspace\xyz\src\driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vilaz\\eclipse-workspace\\xyz\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		return driver;
		}
	
	public void Closedriver(WebDriver driver) {
		driver.close();
		
	}


}
