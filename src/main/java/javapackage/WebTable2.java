package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
			
			driver.get("https://money.rediff.com/gainers");
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000); 
			
			//all rows in table
			
			List<WebElement> allrows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")); //1913
			
			System.out.println(allrows.size());
			
			//System.out.println(driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size());
			
			//all Columns in table
			
			System.out.println(driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size()); //5
			
			//list of company name
			
			List<WebElement> allCompanies=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));//1210
			
			System.out.println(allCompanies.size());
			
			for(int i=0; i<allCompanies.size();i++) {
				if (allCompanies.get(i).getText().equalsIgnoreCase("Loyal Textiles M")) {
					
					System.out.println(allCompanies.get(i).getText());
					allCompanies.get(i).click();
					break;
				}
				
			}
			
			
			
					}

}
