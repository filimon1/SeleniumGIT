import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	System.setProperty("webdriver.chrome.driver", "C://Users//admin//Documents//BrowserDrivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C://Users//admin//Documents//BrowserDrivers\\geckodriver.exe");
		
	//	WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.get("https://www.saucedemo.com/");
		
		//ID to locate and to type we use sendKeys
	//	driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		
		//NAme to locate and type 
	//	driver.findElement(By.name("user-name")).sendKeys("standard_user");
		
		//className to laote and type
		//driver.findElement(By.className("input_error form_input")).sendKeys("standard_user");
				
				
		//ChromeDriver driver=new ChromeDriver();
	   //	driver.get("http://www.google.com");
		
		
		//css selector and type
	//	driver.findElement(By.cssSelector("#user-name")).sendKeys("whatever");
		
		
		// xpath
 //   	driver.findElement(By.xpath("//*GotoClass=Form_Name/[2]@classname=98" [@id=\"user-name\"]")).sendKeys("whatever to say");
		
		//linkpath
	//	driver.findElement(By.linkText("See how Google AI is helping people restore our oceans, trees and wildlife")).click();
		
		
		//partial link text
		driver.findElement(By.partialLinkText("See how Google AI ")).click();
	}

}
