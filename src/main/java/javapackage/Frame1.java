package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	
	public static void main(String[] args) throws Exception {
		
		WebDriver Bali=new ChromeDriver();
		
		Bali.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		Bali.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//click on sign in button
		
		Bali.findElement(By.xpath("//spam[text()='Sign In']")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> totalFrame=Bali.findElements(By.tagName("iframe")); //2
		
		Thread.sleep(2000);
		
		for (int i=0;i<totalFrame.size();i++) {
			
	    Bali.switchTo().frame(i);  //i=0  >frame1 i=1 >frame2
	    
	    if(Bali.findElement(By.xpath("//a[text()='term of use']")).isDisplayed()) {
	    	Bali.findElement(By.xpath("//a[text()='term of use']")).click();
	    	break;
	    }
			
			
		}
	}
}
