package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_click {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniun\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		//a[@id='u_0_0_Kr']                 -- xpath by attributes
		//a[@id='u_0_0_1L']                 -- xpath by attributes
		//a[text()='Create New Account']    -- xpath by text
		
		WebElement createNewAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		createNewAcc.click();
		//input[@id='u_2_6_KZ']
		Thread.sleep(3000);
		
		WebElement customCheckBox = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		customCheckBox.click();
		//select[@aria-label='Select your pronoun']
		Thread.sleep(3000);
		
		WebElement pronoun = driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']"));
		boolean result = pronoun.isDisplayed();
		System.out.println(result);
		
		if(result==true) 
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}

}
