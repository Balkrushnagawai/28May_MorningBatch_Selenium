package screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		Actions act = new Actions(driver);
		WebElement AccAndList = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		act.moveToElement(AccAndList).perform();
		WebElement accountButton =driver.findElement(By.xpath("//span[text()='Account']"));
		act.moveToElement(accountButton).perform();
		act.click().perform();
		
		
	}

}
