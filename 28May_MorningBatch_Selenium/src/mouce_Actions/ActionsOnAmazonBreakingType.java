package mouce_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsOnAmazonBreakingType {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniun\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
	   
		WebElement accAndList = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	   
		WebElement yourelement = driver.findElement(By.xpath("//span[text()='Your Orders']"));

		//how to perform mouce action
		Actions act =new Actions(driver);
		act.moveToElement(accAndList).perform();
		Thread.sleep(2000);
		act.moveToElement(yourelement).perform();
		act.click().perform();
		
	    

	    
	    
	}

}
