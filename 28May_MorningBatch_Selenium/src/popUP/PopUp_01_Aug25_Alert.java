package popUP;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp_01_Aug25_Alert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniun\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//Handling Alert PopUp
		
		Alert alt = driver.switchTo().alert();
		alt.accept();  //click on OK,yes accept,approve,continue button
		alt.dismiss();  //click on No,deny,disagree,cancel button
		String text = alt.getText(); //to get the text present on alert popup
		alt.sendKeys("data");  //to  send the data on alert popup
		// there are 4 methods of alert Interface
	}


}
