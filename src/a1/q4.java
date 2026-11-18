package a1;
import org.openqa.selenium.*;
import org.openqa.selenium.safari.SafariDriver;

public class q4 {
	
	public static void main(String[] args)
	{
		WebDriver myDriver=new SafariDriver();
		myDriver.get("Https://google.com");
		
		System.out.println("Title:"+myDriver.getTitle());
	}		
}
