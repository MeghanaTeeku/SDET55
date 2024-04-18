package myProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoDropOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		WebElement drop=driver.findElement(By.id("select3"));
		Select country=new Select(drop);
		List<WebElement> options=country.getOptions();
		boolean flag=false;
		for(WebElement ele:options)
		{
			String text=ele.getText();
			System.out.println(text);
			if(text.equals("India"))
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("Not present");
		}

		
	}

}
