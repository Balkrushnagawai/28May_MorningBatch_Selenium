package wait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction;

public class Sep02_02ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		
		//Implicit Wait -> Waiting Time
		//default Implicit wait is 0 sec.
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//or
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		WebElement cells = driver.findElement(By.xpath("//table[@id='customers']//th"));
		WebElement cells1 = driver.findElement(By.xpath("//table[@id='customers']//th"));
		WebElement cells2= driver.findElement(By.xpath("//table[@id='customers']//th"));


	
	}

}
