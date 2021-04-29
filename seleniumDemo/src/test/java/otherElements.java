import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class otherElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/request-demo/");

		// to maximize the browser
		driver.manage().window().maximize();

		// to scroll
		WebElement scrollTo = driver.findElement(By.xpath("//div[@id='field19']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(scrollTo);
		actions.perform();

		Thread.sleep(2000);

		// to check and uncheck checkbox
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='interest_market_c0']"));
		checkbox1.click();
		Thread.sleep(2000);
		System.out.println(checkbox1.isSelected());

		WebElement uncheckbox1 = driver.findElement(By.xpath("//input[@id='interest_market_c0']"));
		checkbox1.click();
		System.out.println(checkbox1.isSelected());

		// to count number of all the checkboxs

		System.out.println(
				driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']")).size());
		
		
		// select radiobox
		WebElement radio1 = driver.findElement(By.id("doi0"));
		radio1.click();
		Thread.sleep(2000);
		System.out.println(radio1.isSelected());

//		// to close the browser
//		driver.close();
//		
		WebElement dropdown=driver.findElement(By.name("employees_c"));
		Select select=new Select(dropdown);
		select.selectByIndex(2);
		Thread.sleep(2000);
		select.selectByValue("level6");
		Thread.sleep(2000);
		select.selectByVisibleText("10,000+ employees");
		Thread.sleep(2000);

		// Multi selection 
		//WebElement multiDropdown=driver.findElement(By.xpath(//select[))
		
		
		
	}

}
