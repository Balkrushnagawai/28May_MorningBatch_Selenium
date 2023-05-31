package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_DateTime_WithName {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.policybazaar.com");
		for(int i=0; i<5; i++)
		{
			Date  date = new Date();
			String st=date.toString ().replace(":"," " ).replace("-", "_")+"jpg";
			TakesScreenshot take = (TakesScreenshot)driver;
			File src =take.getScreenshotAs(OutputType.FILE);
			File dest = new File("E:\\28th May batch 1\\Auto ScreenShot\\AkshayB"+i+st);
			FileHandler.copy(src, dest);
		}
	}
}
