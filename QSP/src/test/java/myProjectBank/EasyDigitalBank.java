package myProjectBank;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class EasyDigitalBank {
	public static void main(String[] args)  {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.icc-cricket.com/rankings/team-rankings/mens/test");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 List<WebElement> we = driver.findElements(By.xpath("//span[@class='si-sname si-text']"));
		System.out.println("hello ICC");
		for(WebElement name:we) {
			
			String country = name.getText();
			System.out.println(country);
			if(country.contains("Sri Lanka"))
			{
				System.out.println("country is present");
			}
			else
			{
				System.out.println("country is not present");
			}
		}	
	}
	
}
