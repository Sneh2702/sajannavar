package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookWebloginRadioButton {
	
public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");  //lunching facebook web app
		Thread.sleep(2000);
		
		driver.manage().window().maximize(); //maximize
		Thread.sleep(2000);
		
		//click on Create new account button with the help of text()
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
		//findelements() >It is used to find mulyiple web element
		
		//List<WebElement> radios= driver.findElements(By.xpath("//input[@type='radio']"));// 3 we have top store those 3 web element in one list ref
		
		
		List<WebElement> radios= driver.findElements(By.xpath("//input[contains(@type,'rad')]"));// using contains executing the command
		System.out.println(radios.size());
		Thread.sleep(2000);
		
				//female radio button
				radios.get(0).click();
				Thread.sleep(2000);
				
				//male radio button
				radios.get(1).click();
				
				//custom radio button
				radios.get(2).click();
				
				//isselected command
				
				System.out.println(radios.get(2).isSelected()); //true
				
				System.out.println(radios.get(1).isSelected()); //False
				
				
				
				
}

}