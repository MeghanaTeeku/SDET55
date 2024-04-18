package myProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoMultiNest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		WebElement frame1=driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
		WebElement frame2=driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
		driver.switchTo().frame(frame1);	
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		driver.findElement(By.id("password")).sendKeys("abc");
		driver.findElement(By.id("confirm-password")).sendKeys("abc");
		driver.findElement(By.id("submitButton")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(frame2);
		driver.findElement(By.id("username")).sendKeys("abc.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.switchTo().defaultContent();
		driver.switchTo().frame(frame1);
		driver.findElement(By.id("password")).sendKeys("abc");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.findElement(By.id("password")).sendKeys("abc");
		driver.findElement(By.id("submitButton")).click();
		
	}

}
