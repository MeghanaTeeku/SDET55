package myProject;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://nhai.gov.in");
		
	 List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
	//Thread.sleep(1000);
	  System.out.println(allLinks.size());
	  
	  for(WebElement eachLink: allLinks)
	  {
	String	link = eachLink.getAttribute("href");
	
	try {
	 URL url = new URL(link);
	 
	//HTTP connection;
	 
	HttpsURLConnection httpCon=(HttpsURLConnection)url.openConnection();
	int statuscode=httpCon.getResponseCode();
	//System.out.println(statuscode);
	if(statuscode>=400 && statuscode!=0)
	{
		
		System.out.println(link+"-->"+statuscode);
	}
		  
	  }
		
catch(Exception e) {}
}
}}
