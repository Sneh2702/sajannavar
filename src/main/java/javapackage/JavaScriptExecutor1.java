package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor1 {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000); 
			
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			Thread.sleep(2000);
			
			//scroll down
			jse.executeScript("window.scrollBy(0, 400)"); 
			Thread.sleep(2000);
			
			//scroll up
			jse.executeScript("window.scrollBy(0, -400)");
			Thread.sleep(2000);
			
			//Enter data with help of javascriptexecutor
			
			jse.executeScript("document.getElementById('email').value='bali123@@gmail.com'");
			Thread.sleep(2000);
			
			//clickon Create new account button with the help of jse
			
			WebElement createNewAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
			jse.executeScript("arguments[0].click()",createNewAccount);
			Thread.sleep(2000);
			
			//click on check on female radio  button with the help of jse   
			WebElement femaleRadio=driver.findElement(By.xpath("//input[@value='1']"));
			jse.executeScript("arguments[0].checked=true",femaleRadio);
			Thread.sleep(2000);
	}

}
