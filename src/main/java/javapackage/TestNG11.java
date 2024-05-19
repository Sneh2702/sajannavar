package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG11 {
	TestNG10 t1=new TestNG10();
	
	 // SoftAssert soft= new SoftAssert();// 1
	@Test
	public void Alert() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automatation\\chromedriver-win64\\chromedriver.exe");
		
		t1.driver=new ChromeDriver();
		
		t1.driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		t1.driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Click on signin Button without entering username and password
		
		t1.driver.findElement(By.xpath("//input[@name='proceed']")).click(); //it will click on sign in button
		
		Thread.sleep(2000);
		
		String expected="Please enter a valid user name";
		System.out.println(expected);
		
		String actual=t1.driver.switchTo().alert().getText();
		System.out.println(actual);
		Thread.sleep(2000);
		
		//soft.assertEquals(actual, expected,"Both should be equal");//failed >validation purpose// soft assertion//2
		
		System.out.println("Assertion will get verified");
		Thread.sleep(2000);
		
		t1.driver.switchTo().alert().accept();//accept the alert that means click on Ok button
	}
	
	@Test(groups = {"FacebookApp"})// it will only luanch fb.
	public void facebook() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automatation\\chromedriver-win64\\chromedriver.exe");
		  t1.driver=new ChromeDriver();
		
		t1.driver.get("https://wwwfacebook.com/");
		Thread.sleep(2000);
		
		t1.driver.manage().window().maximize();
		Thread.sleep(2000);
		
		t1.driver.findElement (By.xpath("//input[@id='email']")).sendKeys("snehsajannavar@gmail.com");
		Thread.sleep(2000);
		
		t1.driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
		Thread.sleep(2000);
	}
 	
	@AfterMethod
	public void takescreenshotfailure(ITestResult result) throws Exception {
		t1.captureScreenshot(result);
		}

}
