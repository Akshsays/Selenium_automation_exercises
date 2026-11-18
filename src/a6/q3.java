package a6;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class q3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver myDriver=new ChromeDriver();
		myDriver.navigate().to("https://www.geeksforgeeks.org/");
		
		System.out.println("Navigated to current website");
		Thread.sleep(3000);
		
		WebElement next_webpage=myDriver.findElement(By.linkText("Data Science"));
		next_webpage.click();
		
		Thread.sleep(3000);
		System.out.println("Linked on linktext");
		myDriver.navigate().back();
		Thread.sleep(3000);
		
		System.out.println("Navigated backwards");
		
		
		
	}

}