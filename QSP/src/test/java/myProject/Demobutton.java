package myProject;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demobutton {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		WebElement drop=driver.findElement(By.xpath("//button[@id='btn30']"));
		Actions act=new Actions(driver);
		act.contextClick(drop).perform();
		 driver.findElement(By.xpath("//div[text()='Yes']")).click();
		 WebElement yes=driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']"));
		 String st=yes.getText();
		 if(st.contains("Yes"))
		 {
			//System.out.println("present"); 
		 }
		 driver.findElement(By.xpath("//a[.='Double Click']")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	WebElement dd= driver.findElement(By.xpath("//button[@id='btn20']"));
	act.doubleClick(dd);
	
	}

}
