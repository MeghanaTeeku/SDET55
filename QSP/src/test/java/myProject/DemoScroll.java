package myProject;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoScroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com");
		WebElement ele1=driver.findElement(By.xpath("//input[@type='text']"));
		Actions act=new Actions(driver);
		act.click(ele1).sendKeys("puma").perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		WebElement ele=driver.findElement(By.xpath("//span[contains(.,'Back to top')]"));
		Point loc=ele.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		
		act.scrollByAmount(x, y).perform(); //act.scrollToElement(ele).perform();
		
	
		}

}
