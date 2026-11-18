package a1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class a1 {
	
	public static void main(String[] args) {
		
		WebDriver myDriver=new ChromeDriver();
		myDriver.get("https://www.google.com");
		
		System.out.println("Title:"+myDriver.getTitle());

	}

}
