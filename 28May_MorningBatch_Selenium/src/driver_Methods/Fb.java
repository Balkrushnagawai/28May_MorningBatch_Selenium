package driver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Seleniun\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		//driver.navigate().to("https://www.amazon.in");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.manage().window().minimize();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.close();
		Thread.sleep(1000);
		driver.quit();

	}

}
