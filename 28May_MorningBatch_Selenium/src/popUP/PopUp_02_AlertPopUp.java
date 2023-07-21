package popUP;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp_02_AlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniun\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
	    WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
	    submit.click();
	    Thread.sleep(2000);
	    //how  to close alert popup
	    Alert alt = driver.switchTo().alert();
	    String text = alt.getText();
	    System.out.println(text);
	    
	    alt.accept();
	   
	   //OR
	    driver.switchTo().alert().accept();   //we can directly write this code but using one object we have to do multiple action
	    
	}

}
