package popUP;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aug26_01_ChildAlert {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\Seleniun\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.w3schools.com/js/js_popup.asp");
		    //Thread.sleep(200);
		    WebElement tryIt = driver.findElement(By.xpath("//a[text()='Try it Yourself »']"));
		    tryIt.click();//New Browser / new Object
		    //To get the address of Browser / tab window
		    String mainPage = driver.getWindowHandle();//main page Address
		   
		    //To switch Selenium focus from one Browser to another Browser/Tab
		    Set<String> add = driver.getWindowHandles();//main page + all child Browser
		    
		    driver.switchTo().window("adress of new window/object of crome");

		   
		   

	}

}
