package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aug13_isDisplayed {
	public static void main (String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniun\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement creatNewAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		creatNewAcc.click();
		
		Thread.sleep(5000);
		WebElement customCheckBox = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		customCheckBox.click();
		
		//isDesplayed() use for hidden element
		//To verify WebElement is displayed or not
		//true = Element displayed 
		//false =  Element not displayed
		
		boolean result = customCheckBox.isDisplayed();
		System.out.println(result);
		
		if (result==true)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	
	}
	

}
