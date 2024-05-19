package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver Bali=new ChromeDriver();
		
		Bali.get("https://jqueryui.com/droppable/"); // launching web app
		
		Bali.manage().window().maximize();
		
		Thread.sleep(2000);
		List <WebElement> totalFrame=Bali.findElements(By.tagName("iframe")); //2
		Thread.sleep(2000);
		
		//we are validating drag me to
		
		for (int i=0;i<totalFrame.size();i++) {
			
			Bali.switchTo().frame(i);  //i=0 >frame1
		}
		
		if (Bali.findElement(By.xpath("//div[@id='draggable']")).isDisplayed()) {
			System.out.println(Bali.findElement(By.xpath("//div[@id='draggable']")).getText());
			
		}

}
}
