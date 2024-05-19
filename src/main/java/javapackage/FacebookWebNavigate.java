package javapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookWebNavigate {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");// without get we can luanch the application using navigate.
		Thread.sleep(2000); //stop execution for 2 sec
		
		driver.manage().window().maximize(); //maximize the window
		Thread.sleep(2000); //stop execution for 2 sec
		
		driver.navigate().back(); //backward
		Thread.sleep(2000); //stop execution for 2 sec
		
		driver.navigate().forward(); //forward
		Thread.sleep(2000); //stop execution for 2 sec
		
		driver.navigate().refresh(); //refresh
		Thread.sleep(2000); //stop execution for 2 sec
		
		//driver.manage().window().minimize();
		//Thread.sleep(2000);
		
		
		driver.close();
		
		
		
	}

}

