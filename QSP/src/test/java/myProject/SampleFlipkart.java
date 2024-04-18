package myProject;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleFlipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebElement ele=driver.findElement(By.xpath("//input[@type='text']"));
		ele.sendKeys("Shirt");
		Thread.sleep(1000);
		//List<WebElement> ele1=driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//div"));
		List<WebElement> ele1=driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//div"));
		Thread.sleep(1000);
		for(WebElement we:ele1)
		{
			String st=we.getText();
			//System.out.println(st);
			if(st.contains("Shirts"))
			{
				
				System.out.println(st);
			}
			
			
			//JavascriptExecutor e= (JavascriptExecutor)driver; ////a[@class='oleBil']//div//img[@class='_2puWtW _3a3qyb']
			
//			TreeSet<String> st1=new TreeSet<String>();
//			st1.add(st);
//		System.out.println(st1);img[@class='_2puWtW _3a3qyb'] //a[@class='oleBil']//div[2] //ul[@class='_1sFryS _2x2Mmc _3ofZy1']//div"
		
	}
	
	}	
}
