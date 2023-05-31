package howToHandle_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("\\https:www.facebook.com");
		
		//How to handle the dropdown
		//Step1--> first we have to identity or locate webElement on browser
		WebElement dayDropDown =driver.findElement(By.xpath(""));
		
		//Step2--> Create object of select element class 
		           //and pass above created webelement referance in argument of select
		Select s = new Select(dayDropDown);
		
		//Step3--> By using object of select class use that three methods of select class
		//s.selectByIndex();
		//s.selectByValue(null);
		//s.selectByVisibleText(null);
	}

}
