package myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleProject {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new FirefoxDriver();
driver.get("https://demoapps.qspiders.com/ui?scenario=1");
driver.findElement(By.id("name")).sendKeys("Abc");
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Abc.com");
Thread.sleep(4000);
//WebElement ele=driver.findElement(By.id("password"));
driver.findElement(By.xpath("//button[@type='submit']")).click();
driver.findElement(By.id("password")).sendKeys("abhdg");
//WebElement ele=driver.findElement(By.xpath("//input[@id='email']"));
	}

}
