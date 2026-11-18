package a5;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class a2 {

	public static void main(String[] args) {
		
		WebDriver myDriver=new ChromeDriver();
		try
		{
			myDriver.get("file:///home/aksh/Desktop/Selenium/ST_Solutions/Lab_assignment/src/a3/login.html");
			
			WebElement username=myDriver.findElement(By.id("username"));
			username.sendKeys("askh");
			WebElement email=myDriver.findElement(By.id("email"));
			email.sendKeys("password@gmail.com");
		
			WebDriverWait wait=new WebDriverWait(myDriver,Duration.ofSeconds(30));
			WebElement btn=wait.until(ExpectedConditions.presenceOfElementLocated(
					By.id("submit")
					));
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.id("submit")
					));
			btn.click();
			System.out.println("Login successful!");
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
