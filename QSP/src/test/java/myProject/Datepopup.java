package myProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Datepopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		driver.get("https://goibibo.com");
//		String MandY="April 2024";
//		int date=2;
//		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
//		driver.findElement(By.xpath("//span[@class='sc-12foipm-22 cUvQPq fswDownArrow']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[text()='"+MandY+"']//ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://goibibo.com");
		String MandY="May 2024";
		int date=2;
		
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//span[@class='sc-12foipm-22 cUvQPq fswDownArrow']")).click();
		Thread.sleep(1000);
		for(;;) {
			try {
		
		driver.findElement(By.xpath("//div[text()='"+MandY+"']//ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click();
		break;
	}
		catch(Exception e)
		{
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		}
	}
		driver.findElement(By.xpath("//span[text()='Return']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@alt='close icon']")).click();
}}
