package xyz;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginPageTest extends BaseClass{
public static WebDriver driver =null;


	
	@Test
	public void T1() throws Exception{
		driver=setup();
		driver.get(baseUrl);
		Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase(baseUrl));
		
	}
	

	@Test
	public void T2() throws Exception{
		
		
		WebElement username=driver.findElement(By.id("username"));
		
		WebElement password=driver.findElement(By.id("password"));
		
		WebElement logIn=driver.findElement(By.id("log-in"));
		
		WebElement Header=driver.findElement(By.xpath("//h4[@class='auth-header']"));
		
		WebElement username_Text=driver.findElement(By.xpath("//label[contains(text(),'Username')]"));
		
		WebElement password_text=driver.findElement(By.xpath("//label[contains(text(),'Password')]"));
		
		WebElement rememberME=driver.findElement(By.xpath("//label[@class='form-check-label']"));
		
		WebElement twitterIMG=driver.findElement(By.xpath("//img[@src='img/twitter.png']"));
		
		WebElement facebookIMG=driver.findElement(By.xpath("//img[@src='img/facebook.png']"));
		
		WebElement linkedinIMG=driver.findElement(By.xpath("//img[@src='img/linkedin.png']"));
		
		WebElement pass_Fingerprint=driver.findElement(By.xpath("//div[@class='pre-icon os-icon os-icon-fingerprint']"));
		
		WebElement user_circle=driver.findElement(By.xpath("//div[@class='pre-icon os-icon os-icon-user-male-circle']"));
		
		Assert.assertEquals(true, username.isDisplayed());
		Assert.assertEquals(true, password.isDisplayed());
		Assert.assertEquals(true, logIn.isDisplayed());
		Assert.assertEquals(true, Header.isDisplayed());
		Assert.assertEquals(true, username_Text.isDisplayed());
		Assert.assertEquals(true, password_text.isDisplayed());
		Assert.assertEquals(true, rememberME.isDisplayed());
		Assert.assertEquals(true, twitterIMG.isDisplayed());
		Assert.assertEquals(true, facebookIMG.isDisplayed());
		Assert.assertEquals(true, linkedinIMG.isDisplayed());
		Assert.assertEquals(true, pass_Fingerprint.isDisplayed());
		Assert.assertEquals(true, user_circle.isDisplayed());
		//close(driver);
	}
	
	
	
	
	
}
