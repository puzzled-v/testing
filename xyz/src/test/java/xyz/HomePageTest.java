package xyz;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

public class HomePageTest extends BaseClass{

	public static WebDriver driver =null;
	
	public void login() throws InterruptedException{
		WebElement username=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement logIn=driver.findElement(By.id("log-in"));
		username.sendKeys("test");
		password.sendKeys("check");
		logIn.click();
		Thread.sleep(5000);
	}
	
	@Test
	public void T() throws Exception{
		driver=setup();
		driver.get(baseUrl);
		login();
		Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://sakshingp.github.io/assignment/home.html"));
		
	}
	
	public ArrayList<String> checkTable(){
		String Bxpath="//*[@id='transactionsTable']/tbody/tr[";
		String Axpath="]/td[5]/span";
		ArrayList<String> amt=new ArrayList<String>();
		for(int i=1;i<=6;i++){
			String amt_Value=driver.findElement(By.xpath(Bxpath+i+Axpath)).getText();
			amt.add(amt_Value);
		}
		return amt;
	}
	
	public  void amount(){
		driver.findElement(By.xpath("//*[@id='amount']")).click();
		driver.findElement(By.xpath("//*[@id='amount']")).click();
	}
	
	@Test
	public void sortCheck() throws Exception {
		amount();
		ArrayList<String> amtValue=	checkTable();
		Boolean flag=false;
		for(int i=1;i<=amtValue.size();i++){
			for(int j=i+1;j<amtValue.size();j++){
				String first=amtValue.get(i);
				String[] parts = first.split("\\s+");
				String first_value=parts[0];
				String first_value1=parts[1];
				String Second=amtValue.get(j);
				String[] parts1 = Second.split("\\s+");
				String Second_value=parts1[0];
				String Second_value1=parts1[1];
				if((first_value.equals("+"))&&(Second_value.equals("+"))){
					
					double FirstValueInteger=Double.parseDouble(first_value1);
					double SecondValueInteger=Double.parseDouble(Second_value1);
					if(FirstValueInteger>SecondValueInteger)
					{
						flag=true;
					}
				}
				else if((first_value.equals("+"))&&(Second_value.equals("-"))){
					flag=true;
				}
				else if((first_value.equals("-"))&&(Second_value.equals("-"))){
					double FirstValueInteger=Double.parseDouble(first_value1);
					double SecondValueInteger=Double.parseDouble(Second_value1);
					if(SecondValueInteger>FirstValueInteger)
					{
						flag=true;
					}
				}

			}
		}
		Thread.sleep(18000);
		Assert.assertTrue(flag);
	}

}
