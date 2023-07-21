package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aug13_EnableDisable {
	public static void main(String[] args) throws InterruptedException {
		//button[@type='submit']
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniun\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(5000);
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		boolean result = login.isEnabled();
		System.out.println(result);
	}

}
