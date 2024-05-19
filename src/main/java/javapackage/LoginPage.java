package javapackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	public static void main(String[] args) throws Exception {
		
		//VIP- Could you please write a systax(code) of property file - need to write below  code line till Pro.load(fis);
		
		//1.specify the location of properties file with the help of creating object of file class
		
		File scr=new File("C:\\Users\\LENOVO\\eclipse-workspace\\BAT22MavenProject\\PageLocator\\Login.properties");
		
		//2. we need to create object of FileInputStream to load the file class refernce (scr)
		
		FileInputStream fis=new FileInputStream(scr);
		
		//3 Create object of Properties class
		Properties pro=new Properties();
		pro.load(fis); // read the properties
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(pro.getProperty("email"))).sendKeys("Snehsajannavar@gmailcom");
		Thread.sleep(2000);
		//Email will use that path we write in login property
		
		driver.findElement(By.xpath(pro.getProperty("password"))).sendKeys("1234");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(pro.getProperty("login"))).click();
		Thread.sleep(2000);
		

		
	}

}
