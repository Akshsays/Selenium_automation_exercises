package a1;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver; // present just need to import note:firefox must be installed

public class q2 {

	public static void main(String[] args) {
		
		WebDriver myDriver=new FirefoxDriver();
		myDriver.get("https://google.com");
		
		System.out.println("Title:"+myDriver.getTitle());

	}

}
