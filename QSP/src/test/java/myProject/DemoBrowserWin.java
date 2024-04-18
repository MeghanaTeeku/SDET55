package myProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import generic.WebdriverUtil;

public class DemoBrowserWin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//button[@id='browserButton3']")).click();
		
		WebdriverUtil web =new WebdriverUtil();
		driver.findElement(By.id("browserButton2")).click();
		web.switchWindow(driver, "SignUp");
		driver.findElement(By.id("username")).sendKeys("abcc");
		
	}

}
