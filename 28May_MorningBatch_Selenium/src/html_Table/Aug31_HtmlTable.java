package html_Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aug31_HtmlTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Seleniun\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']//tr[2]//td[1]"));
		System.out.println(table);

		
	}
		

}
