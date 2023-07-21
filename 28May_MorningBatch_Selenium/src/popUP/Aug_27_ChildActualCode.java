package popUP;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aug_27_ChildActualCode {
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniun\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
	    WebElement alert = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));

		//To get the address of Browser/tab window
	    String mainpage = driver.getWindowHandle(); //Main page Address
	    System.out.println(mainpage);
	   
	    //Set<String> add = driver.getWindowHandles();//main page + all child Browser
        ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
       
        driver.switchTo().window(addr.get(0));
	    
	    
	    
		
		
		
	}

}
