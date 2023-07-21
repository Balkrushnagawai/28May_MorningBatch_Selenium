package driver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize_setPositon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniun\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    Dimension d = new Dimension(300, 600);
	    driver.manage().window().setSize(d);
	    Thread.sleep(2000);
	    Point p = new Point(300, 200);
	    driver.manage().window().setPosition(p);
	}

}
