package myProject;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoNotifPop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("--disable-notifications");
		//WebDriver driver=new ChromeDriver(opt);
		//FirefoxOptions opt = new FirefoxOptions();
		//opt.addPreference("--disable-notifications", true);
		//WebDriver driver=new FirefoxDriver();
		//driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		//driver.findElement(By.xpath("//button[.='Notification']")).click();
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[contains(@aria-label,'BUSES')]")).click();
		//driver.get("https://www.bus.irctc.co.in/home");
		Set<String> win=driver.getWindowHandles();
		for (String st : win) 
		{
			driver.switchTo().window(st);
			String title=driver.getCurrentUrl();
			System.out.println(title);
		if(title.contains("Bus"))
			{
				break;
			}
		}
	
		driver.findElement(By.id("goingTo")).sendKeys("Bang");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
//		driver.findElement(By.xpath("//div[.='Bangalore']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		//driver.findElement(By.xpath("//input[@id='goingTo']")).sendKeys("Hassan");
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.))
		
		
	}

}
