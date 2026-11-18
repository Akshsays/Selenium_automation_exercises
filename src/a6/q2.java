package a6;
import org.openqa.selenium.*;
import java.io.File;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class q2 {

	public static void main(String[] args) {
		
		WebDriver myDriver=new ChromeDriver();
		myDriver.get("https://practicetestautomation.com/practice-test-login/");
		
		try
		{
			WebDriverWait ws=new WebDriverWait(myDriver,Duration.ofSeconds(30));
			
			WebElement username=myDriver.findElement(By.id("username"));
			username.sendKeys("student");
			WebElement password=myDriver.findElement(By.id("password"));
			password.sendKeys("Password123");
			
			WebElement btn=myDriver.findElement(By.id("submit"));
			btn.click();
			
			ws.until(ExpectedConditions.visibilityOfElementLocated(By.className("post-header")));
			
			TakesScreenshot ts=(TakesScreenshot)myDriver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File destination=new File("/home/aksh/Desktop/Selenium/ST_Solutions/Lab_assignment/src/a6/screenshot/login_successful.png");
			Boolean result=src.renameTo(destination);
			
			System.out.println("Login & screenshot taken:"+result);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
