package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aug27_01_iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniun\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
	  //  WebElement alert = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));

	}

}
