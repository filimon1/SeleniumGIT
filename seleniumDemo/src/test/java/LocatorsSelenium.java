import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

				
		// ID
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		// name ( we need to make sure we have the "name" attribute inorder to use this
//		driver.findElement(By.name("")).sendKeys("");

		// class Name (not recommended practice since it might be duplicate
//		driver.findElement(By.className("form_input")).sendKeys("standard_user");

		// css selector (right click and copy selector)
//		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		
		// xpath (right click and copy xpath)
//		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		
		// TagName (all the div, input,form,...it will find the first tag with matching tagName
//		driver.findElement(By.tagName("input")).sendKeys("");
		
		//linkText (right click and copy the text under the tag <a href="" "linkText(Getting Started)"
//		driver.findElement(By.linkText("Getting started")).click();
		
		//PartialText (partial text of the link tag 
//		driver.findElement(By.partialLinkText("Getting")).click();
		
		
		
		
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

	}

}
