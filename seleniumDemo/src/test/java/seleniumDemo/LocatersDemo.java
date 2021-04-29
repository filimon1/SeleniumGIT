package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatersDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.sugarcrm.com/request-demo/");
		driver.manage().window().maximize();
		
		WebElement scrollTo=driver.findElement(By.xpath("//div[@id='field19']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(scrollTo);
		actions.perform();
		
		Thread.sleep(2000);
		
		WebElement radioBox2=driver.findElement(By.id("doi1"));
		radioBox2.click();
		
		Thread.sleep(2000);
		WebElement RadioBox1=driver.findElement(By.xpath("//input[@id='doi0' and @name='doi']"));
		RadioBox1.click();
		System.out.println(radioBox2.isSelected());
		
		
		// select dropdown
		WebElement dropDownAddress=driver.findElement(By.xpath("//select[@name='employees_c']"));
		Select companySizeDropDown=new Select(dropDownAddress);
		companySizeDropDown.selectByIndex(5);
		Thread.sleep(2000);
		
	    companySizeDropDown.selectByValue("level2");
		Thread.sleep(2000);

		companySizeDropDown.selectByVisibleText("10,000+ employees");
		
		
		
		
		
		
		
	}

}
