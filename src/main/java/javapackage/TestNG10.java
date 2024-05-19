package javapackage;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TestNG10 {
	
	WebDriver driver;
	public void captureScreenshot (ITestResult result) {
		
		if(ITestResult.FAILURE==result.getStatus()) {
			//create object of TakeScrreenshot and tpe cast with driver
			
			TakesScreenshot ts =(TakesScreenshot)driver;
			
			
			//call method to capture the screenshot and store interns of file
			
			File scr=ts.getScreenshotAs(OutputType.FILE); //scr co24 2ntains failed screenshot
			
		// copy (scr)and paste it at ur our project level
		// O(/) i want to store scrrenshot at project evel
		//FileUtil.copyFile(scr,new File("./screenshot/"+result.getName()+".png"));
		
		}
	}

}
