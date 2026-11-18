package a3;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class q3 {

	public static void main(String[] args) {
		
		WebDriver myDriver=new ChromeDriver();
		myDriver.get("file:///home/aksh/Desktop/Selenium/ST_Solutions/Lab_assignment/src/a3/login.html");
		
		WebElement name=myDriver.findElement(By.id("username"));
		name.sendKeys("Aksh");
		WebElement email=myDriver.findElement(By.id("email"));
		email.sendKeys("nonecares@gmail.com");
		
		WebElement gender=myDriver.findElement(By.id("male"));
		gender.click();
		String gen=gender.getAccessibleName();
		System.out.println("Gender:"+gen);
		
		WebElement course=myDriver.findElement(By.id("course"));
		Select select=new Select(course);
		select.selectByValue("BCOM");
		
		WebElement checkbox=myDriver.findElement(By.id("C"));
		checkbox.click();
		String sub=checkbox.getAccessibleName();
		System.out.println("Subject:"+sub);
		
		WebElement sbt_btn=myDriver.findElement(By.id("submit"));
		sbt_btn.click();
		
		System.out.println("Login successful!");
	}

}
