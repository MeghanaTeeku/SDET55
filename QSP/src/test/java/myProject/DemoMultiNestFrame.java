package myProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoMultiNestFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(frame);
		WebElement child=driver.findElement(By.xpath("//section[@class='main_form_container']//iframe"));
		driver.switchTo().frame(child);
		System.out.println(driver.findElement(By.xpath("//h2[.='Login']")).getText());
		driver.switchTo().frame(0);
		driver.findElement(By.name("email")).sendKeys("abc.com");
		driver.switchTo().parentFrame() ;		
		driver.switchTo().frame(1);
		
		driver.findElement(By.name("Password")).sendKeys("abc123");
		driver.switchTo().parentFrame() ;		
		driver.switchTo().frame(2);
		driver.findElement(By.name("confirm")).sendKeys("abc123");		
	}
}
