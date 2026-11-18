package a2;
import org.openqa.selenium.*;
import java.util.Scanner;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		int choice=0;
		Scanner myobj=new Scanner(System.in);
		
		System.out.println("1.Id locator");
		System.out.println("2.Name");
		System.out.println("3.Class name");
		System.out.println("4.xpath locator");
		System.out.println("5.CssSelector");
		System.out.println("6.Exit");
		
		System.out.print("Select choice:");
		choice=myobj.nextInt();
		myobj.close();
		
		switch(choice)
		{
			case 1:
				try
				{
				WebDriver myDriver=new ChromeDriver();
				myDriver.get("https://practicetestautomation.com/practice-test-login/");
				
				WebElement username=myDriver.findElement(By.id("username"));
				username.sendKeys("student");
				WebElement password=myDriver.findElement(By.id("password"));
				password.sendKeys("Password123");
				
				WebElement btn=myDriver.findElement(By.id("submit"));
				btn.click();
				
				System.out.println("Login successful");
				}catch(Exception e)
				{
					System.out.println("Something went wrong in id");
				}
				break;
			
		case 2:
			try
			{
				WebDriver myDriver=new ChromeDriver();
				myDriver.get("https://practicetestautomation.com/practice-test-login/");
				
				WebElement username=myDriver.findElement(By.name("username"));
				username.sendKeys("student");
				WebElement password=myDriver.findElement(By.name("password"));
				password.sendKeys("Password123");
				
				WebElement btn=myDriver.findElement(By.id("submit"));
				btn.click();
				
				System.out.println("Login successful");
			}catch(Exception e)
			{
				System.out.println("Something went wrong in id");
			}
			break;
			
			case 3:
				break;
			
			case 4:
				try
				{
				WebDriver myDriver=new ChromeDriver();
				myDriver.get("https://practicetestautomation.com/practice-test-table/");
				
				WebElement btn=myDriver.findElement(By.xpath("//input[@value='Java']"));
				btn.click();
				String btn_name=btn.getAccessibleName().toString();
				System.out.println("Button:"+btn_name);
				
				}catch(Exception e)
				{
					System.out.println("Something went wrong in xpath");
				}
				break;
			
			case 5:
				try
				{
				WebDriver myDriver=new ChromeDriver();
				myDriver.get("https://practicetestautomation.com/practice-test-table/");
				
				WebElement btn=myDriver.findElement(By.cssSelector("input[value='Java']"));
				btn.click();
				String btn_name=btn.getAccessibleName().toString();
				System.out.println("Button:"+btn_name);
				
				}catch(Exception e)
				{
					System.out.println("Something went wrong in css");
				}
				break;
			
			case 6:
				System.exit(choice);
				break;
		}

	}

}
