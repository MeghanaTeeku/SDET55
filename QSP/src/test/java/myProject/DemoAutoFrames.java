package myProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAutoFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
//		WebElement frame=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
//		driver.switchTo().frame(frame);
//		WebElement frame1=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
//		driver.switchTo().frame(frame1);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
		
		
		
		
	}

}
