package popUP;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aug26_03_Child_Task {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniun\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		// Sir gave task
		//Compaire click and gotten result sequencially
		//we noted result at the bottom of page
		
	    WebElement alert = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
	    WebElement confirm = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
	    WebElement prompt = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
	    WebElement line = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
	    
	    alert.click();
	    confirm.click();
	    prompt.click();
	    line.click();
	    
	    //To get the address of Browser/tab window
	   String mainpage = driver.getWindowHandle(); //Main page Address
	   System.out.println(mainpage);
	   
	   //Set<String> add = driver.getWindowHandles();//main page + all child Browser
	    ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
	    
	    System.out.println(addr.get(0));
	    System.out.println(addr.get(1));
	    System.out.println(addr.get(2));
	    System.out.println(addr.get(3));
	    System.out.println(addr.get(4));
	    
	    driver.switchTo().window(addr.get(0));
	    System.out.println(driver.getCurrentUrl());
	    
	    driver.switchTo().window(addr.get(1));
	    System.out.println(driver.getCurrentUrl());
	    
	    driver.switchTo().window(addr.get(2));
	    System.out.println(driver.getCurrentUrl());
	    
	    driver.switchTo().window(addr.get(3));
	    System.out.println(driver.getCurrentUrl());
	    
	    driver.switchTo().window(addr.get(4));
	    System.out.println(driver.getCurrentUrl());
	    
	    //Result of Task given by Sir
	    //Which sequence we click thats opposite sequence we got child browsers addresses
	    //Practically when multiple child browser opened then whic sequence we click on that then we got opposite index of child browser address
	    //At 0th index we always got main page address
	}
}
