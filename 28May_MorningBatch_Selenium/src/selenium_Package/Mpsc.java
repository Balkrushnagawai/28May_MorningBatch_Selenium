package selenium_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mpsc {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniun\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mpsconline.gov.in");
	}

}
