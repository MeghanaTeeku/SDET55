package myProjectBank;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Olympics {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.manage().window().maximize();
		driver.get("https://www.prokabaddi.com");
		Thread.sleep(3000);
		//List<WebElement> tab = driver.findElements(By.xpath("//span[@class='sc-giHCsP iWHypR']"));
		List<WebElement> tab = driver.findElements(By.xpath("//p[@class='name']/ancestor::div[@class='row-head']//following-sibling::div[@class='table-data team']"));
	
		for (WebElement tables:tab)
		{
			String text = tables.getText();
			//System.out.println(text);
			if(text.contains("Bengaluru"))
			{
				List<WebElement> score = driver.findElements(By.xpath("//div[@class='table-data score-diff']"));
				 
				 for(WebElement scores:score)
				 {
					String text1 = scores.getText();
					System.out.println(text1);
				 }
			}
		}
	 
	}

}
