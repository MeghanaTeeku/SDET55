package Assignments;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class Work1 {

	public void launchbrowser() {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		for(int i=0;i<2;i++)
		{
			driver.switchTo().newWindow(WindowType.WINDOW);
		}
		Set<String> ids = driver.getWindowHandles();
		int count=0;
		for(String id:ids)
		{
			driver.switchTo().window(id);
			count++;
			if(count==2)
			{
				driver.close();
				break;
			}
		}

	}
	//xpath-->a[@class='js-spp-link product-brief__extras-link']
	//span[.='SHOP']
	
	
	public void teeku() {
	System.out.println("Megha Good Evening");
	System.out.println("good evening madhu");
	
	
	}
//changes approved
}
