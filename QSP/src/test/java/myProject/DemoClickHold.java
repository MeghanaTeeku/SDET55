package myProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoClickHold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		WebElement ele=driver.findElement(By.xpath("//div[@id='circle']"));
		Actions act=new Actions(driver);
		act.clickAndHold(ele).pause(3000).perform();
		act.release().perform();
		
	}

}
