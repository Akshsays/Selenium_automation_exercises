package a3;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class q2 {

	public static void main(String[] args) {
		
		WebDriver myDriver=new ChromeDriver();
		myDriver.get("file:///home/aksh/Desktop/Selenium/ST_Solutions/Lab_assignment/src/a3/login.html");
		
		WebElement menu=myDriver.findElement(By.id("course"));
		Select selection=new Select(menu);
		selection.selectByValue("BCA");
		selection.selectByIndex(1);
		selection.selectByContainsVisibleText("BCA");
		
		System.out.println("Value selected");
	}

}
