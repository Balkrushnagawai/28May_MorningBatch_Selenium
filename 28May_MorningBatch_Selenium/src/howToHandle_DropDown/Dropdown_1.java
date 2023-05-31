package howToHandle_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_1 {
	public static void main(String[] args) {
		System.setProperty("webdrive.chrome.drive","");
		WebDriver driver = new ChromeDriver();
		driver.get("");
		
	WebElement dayDropDown =driver.findElement(By.xpath(""));
	Select s=new Select(dayDropDown);
	s.selectByIndex(0);
	WebElement monthDropDown =driver.findElement(By.xpath(""));
	Select s1=new Select(monthDropDown);
	s.selectByIndex(0);
	WebElement yearDropDown =driver.findElement(By.xpath(""));
	Select s2=new Select(yearDropDown);
	s.selectByIndex(0);
	}

}
