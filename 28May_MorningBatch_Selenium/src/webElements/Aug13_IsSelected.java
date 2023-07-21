package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aug13_IsSelected {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniun\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		//a[text()='Create New Account']
		WebElement creatNewaccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		creatNewaccount.click();
		Thread.sleep(2000);

		WebElement customCheckBox = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		boolean result = customCheckBox.isSelected();
		System.out.println(result);
		
		if(result==false)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
	}

}
