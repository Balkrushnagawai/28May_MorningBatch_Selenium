package wait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sept02_01ImplicitWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Seleniun\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("");
		
		//Delay    Waiting
		
		//Delay   -> One Time
		//Waiting -> Time + Condition + Frequency
		
		//Waits in Selenium -> Waiting Time + Condition + Frequency
		//Implicite Wait -> Waiting time 
		//Explicite Wait -> Waiting Time + Condition
		//Fluent Wait    -> Waiting time + Condition + Frequency
		
	}

}
