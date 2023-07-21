package wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sep03_01ExpliciteWait {
	public static void main (String[]args) {
		System.setProperty("webdriver.chrome driver", "D:\\Seleniun\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Explicit wait = waiting time + Condition(only specific condition)
		
		//3.141.59
		//WebDriverWait Wait = new WebDriverWait(driver,20); //20sec
		
		//4.0.0
		//Maximum Waiting ->10sec
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//condition - to visible Element
		//WebElement e4 = wait.until
		
	}

}
