package mouce_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsOnAmazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniun\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    Thread.sleep(2000);
	    WebElement accAndList = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	    //WebElement accAndList = driver.findElement(By.xpath("//span[@class='nav-icon nav-arrow']"));

	    Thread.sleep(2000);
	    WebElement YourOrders = driver.findElement(By.xpath("//span[text()='Your Orders']"));

	    Actions act = new Actions(driver);
	    act.moveToElement(accAndList).moveToElement(YourOrders).click(YourOrders).build().perform();
	    
}

}
