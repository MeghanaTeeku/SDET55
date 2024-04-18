package myProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoframesNest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		WebElement parframe=driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		//driver.switchTo().frame(parframe);
		WebElement Childframe=driver.findElement(By.xpath("//section[@class='main_form_container']//iframe"));
		driver.switchTo().frame(parframe);		
		WebElement ele=driver.findElement(By.xpath("//p[text()='Admin@gmail.com']"));
		String email=ele.getText();
		driver.switchTo().frame(Childframe);
		driver.findElement(By.id("email")).sendKeys(email);
		
	}

}
