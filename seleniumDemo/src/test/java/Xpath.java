import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://developer.salesforce.com/signup");
		//driver.get("https://secure.rezserver.com/flights/home/?refid=5696");
		
		//basic xpath
		driver.findElement(By.xpath("//input[@placeholder='First']")).sendKeys("Testing");
		
		//contains
		driver.findElement(By.xpath("//input[contains(@name,'user[last_name]')]")).sendKeys("Demo");		
		
		// ANd and OR
		////input[@type='text'and @class='textField'] this one showed 3 elements
		
		driver.findElement(By.xpath("//input[@type='text'and @name='user[postal_code]']")).sendKeys("20011");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//basic xpath
	//	driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Fil");
		
		//contains xpath
	//	driver.findElement(By.xpath("//input[contains(@placeholder,'Last')]")).sendKeys("Test");
	//	
		
		//text method
	//	driver.findElement(By.xpath("//a[text()=' Terms of Use']")).click();
		
		
		//And OR
	//	driver.findElement(By.xpath("//input[@type='text' and @name='user[first_name]' ]")).sendKeys("Tom");
		
		//using basic tag
		WebElement radio1=driver.findElement(By.xpath("//input[@data-product='one_way']"));
		radio1.click();
		System.out.println(radio1.isSelected());
		
		
		
	}

}
