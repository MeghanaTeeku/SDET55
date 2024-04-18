package myProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoMultidrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		WebElement drop=driver.findElement(By.xpath("//label[contains(.,'Country')]/following-sibling::div/select"));
		Select opt=new Select(drop);
		opt.selectByVisibleText("Germany");
		opt.selectByVisibleText("Poland");
		opt.selectByVisibleText("India");
		
		//WebElement drop=driver.findElement(By.xpath("//label[contains(.,'Country')]/following-sibling::div/select"));
		//Select opt=new Select(drop);
		
		WebElement drop1=driver.findElement(By.id("phoneInput"));
		Select opt1=new Select(drop1);
		opt1.selectByVisibleText("+01");
		driver.findElement(By.id("keypoint")).sendKeys("123457");
		
		WebElement drop2=driver.findElement(By.id("select40"));
		Select opt2=new Select(drop2);
		opt2.selectByVisibleText("Female");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}

	