package html_Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aug31_MultipleElementHavingSameXpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Seleniun\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//Multiple WebElement
		//To find multiple web Element having same path
		
        List<WebElement>cells = driver.findElements(By.xpath("//table[@id='customers']//th")); 
		List<WebElement>cells1 = driver.findElements(By.xpath("//table[@id='customers']//td"));
		
		WebElement cell = cells.get(0);
		String text = cell.getText();
		System.out.println(text);
		
		//Or
		
		String t = cells.get(0).getText();
		System.out.println(t);
		
		//Or Direct print
		
		System.out.println(cells.get(0).getText());
		Thread.sleep(5000);
		
		for(int i=0; i<cells1.size();i++)
		{
			System.out.println(cells1.get(i).getText());
		}
		
		
	}
	

}
