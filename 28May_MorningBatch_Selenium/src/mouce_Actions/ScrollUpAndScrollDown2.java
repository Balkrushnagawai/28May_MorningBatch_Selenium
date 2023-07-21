package mouce_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpAndScrollDown2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniun\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/HTML/html5_draganddrop.asp");
		
		WebElement moreExamples = driver.findElement(By.xpath("//h2[text()='More Examples']"));
		
		//How to perform scroll up and scroll up
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].scrollIntoView(true);",moreExamples);

	}

}
