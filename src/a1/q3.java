package a1;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
public class q3 {

	public static void main(String[] args) {
		
		
		WebDriver myDriver=new EdgeDriver();
		myDriver.get("Https://google.com");
		
		System.out.println("Title:"+myDriver.getTitle());

	}

}
		