package a2;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class q1 {
	
	public static void main(String[] args)
	{
		WebDriver myDriver=new ChromeDriver();
		myDriver.get("https://practicetestautomation.com/practice-test-login/");
		
		WebElement username=myDriver.findElement(By.id("username"));
		username.sendKeys("student");
		WebElement password=myDriver.findElement(By.id("password"));
		password.sendKeys("Password123");
		
		WebElement btn=myDriver.findElement(By.id("submit"));
		btn.click();
		
		System.out.println("Logged In Successfully");
		
		
		WebElement logout_link=myDriver.findElement(By.cssSelector("a[href='https://practicetestautomation.com/practice-test-login/']"));
		logout_link.click();
		System.out.println("Logout");
	}
}
