package myProject;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DemoAmz {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/HP/Documents/image.html");
		List<WebElement> links=driver.findElements(By.xpath("//img"));
		System.out.println(links.size());
		for(WebElement img:links )
		{
			String image=img.getAttribute("src");
			if(image.equals(0))
			{
				System.out.println("broken");
			}
			
			else
			{
				System.out.println("not broken");
			}
	}
	}
}
