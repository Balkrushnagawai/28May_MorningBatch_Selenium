package mouce_Actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpAndScrollDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/HTML/html5_draganddrop.asp");
		Thread.sleep(2000);
		
		//How to perform Scroll up and Scroll Down
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scroll(0,4000)"); //for Scroll Down
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-3000)");  //for Scroll Down
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(2000,0)");  //for Scroll right
		Thread.sleep(2000);
		
		js.executeAsyncScript("window.scrollBy(-2000,0)");  //for scroll Left


	}

}
