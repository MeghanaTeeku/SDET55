package myProject;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.findElement(By.xpath("//button[@id='buttonAlert2']")).click();
		Alert a=driver.switchTo().alert();
		 String st=a.getText();
		 System.out.println(st);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		a.accept();
	
		//Confirm ALert
		driver.findElement(By.xpath("//a[.='Confirm']")).click();
		driver.findElement(By.xpath("//button[.='Confirm Box']")).click();
		a.accept();	
		//a.dismiss();
		
		//Prompt Alert
		driver.findElement(By.xpath("//a[.='Prompt']")).click();
		driver.findElement(By.xpath("//button[.='Prompt Alert Box']")).click();
		Alert ac=driver.switchTo().alert();
		ac.sendKeys("no");
		ac.accept();
		
		WebElement ele =driver.findElement(By.xpath("//p[.='You selected no']"));
				String s=ele.getText();
				if(s.contains("no"))
						{
					System.out.println("You selected no");
						}
				else
				{
					System.out.println("You selected yes");
				}
}}
