package a5;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class a1 {

	public static void main(String[] args) {
		
		WebDriver myDriver=new ChromeDriver();
		
		try
		{
			myDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			myDriver.get("https://practicetestautomation.com/practice-test-login/");
			WebElement username=myDriver.findElement(By.id("username"));
			username.sendKeys("student");	
			WebElement password=myDriver.findElement(By.id("password"));
			password.sendKeys("Password123");
			
			WebElement btn=myDriver.findElement(By.id("submit"));
			btn.click();
			
			System.out.println("Login successful");
			
			
		}catch(Exception e)
		{
			System.out.println("Login failed:"+e.getStackTrace());
		}
		
	}

}
