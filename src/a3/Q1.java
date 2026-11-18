package a3;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
	
	public static void main(String[] args)
	{
		WebDriver myDriver=new ChromeDriver();
		myDriver.get("file:///home/aksh/Desktop/Selenium/ST_Solutions/Lab_assignment/src/a3/login.html");
		
		WebElement username=myDriver.findElement(By.id("username"));
		username.sendKeys("askh");
		WebElement password=myDriver.findElement(By.id("password"));
		password.sendKeys("password");
		
		WebElement btn=myDriver.findElement(By.id("submit"));
		btn.click();
		
		System.out.println("Login successful");
	}
}
