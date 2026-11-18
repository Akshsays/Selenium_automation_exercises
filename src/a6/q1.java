package a6;
import java.io.File;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class q1 {

	public static void main(String[] args) {
		
		
		WebDriver myDriver=new ChromeDriver();
		myDriver.get("https://youtube.com");
		
		TakesScreenshot ts=(TakesScreenshot)myDriver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File destination=new File("/home/aksh/Desktop/Selenium/ST_Solutions/Lab_assignment/src/a6/screenshot/youtube.png");
		Boolean result=src.renameTo(destination);
		
		System.out.println("Screenshot taken:"+result);
		
		myDriver.quit();
	}

}
