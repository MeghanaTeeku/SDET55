package myProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Datepopup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ChromeOptions opt= new ChromeOptions();
//		opt.addArguments("--disable-notifications");
//		WebDriver driver=new ChromeDriver(opt);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
		
//		driver.get("https://www.irctc.co.in/nget/train-search");
//	String month="May";
//	int date=20;
//		driver.findElement(By.xpath("//span[@class='ng-tns-c58-10 ui-calendar']")).click();
//		driver.findElement(By.xpath("//span[text()=;Month']/ancestor::div[@class='ui-datepicker-group ui-widget-content ng-tns-c58-10 ng-star-inserted']//a[.='27']")).click();
//		driver.findElement(By.xpath("//span[text()='"+month+"']/ancestor::div[@class='ui-datepicker-group ui-widget-content ng-tns-c58-10 ng-star-inserted']//a[.='"+date+"']")).click();
	
	
	
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.ksrtc.in/oprs-web/");
		driver.findElement(By.name("txtJourneyDate")).click();
		driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//ancestor::div[@id='ui-datepicker-div']//a[.='28']")).click();
		driver.findElement(By.xpath("//input[@id='txtReturnJourneyDate']")).click();
		driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//ancestor::div[@id='ui-datepicker-div']//a[.='30']")).click();
	}

}
