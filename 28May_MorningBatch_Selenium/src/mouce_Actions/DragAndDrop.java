package mouce_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		//img[@id='drag1']
		//div[@id='div2']
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniun\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/HTML/html5_draganddrop.asp");
		
		WebElement img = driver.findElement(By.xpath("//img[@id='drag1']"));
		WebElement box = driver.findElement(By.xpath("//div[@id='div2']"));
		
		//How to drag and drop mouse action
		Actions act = new Actions(driver); 
		
		act.dragAndDrop(img, box).perform();//if this is not working then try below one
		
		//or
		act.dragAndDrop(img, box).build().perform();

		
		

		


	}

}
