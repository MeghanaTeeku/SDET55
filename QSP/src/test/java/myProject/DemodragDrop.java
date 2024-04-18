package myProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DemodragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		//WebElement src=driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		//WebElement dst=driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		//Actions act=new Actions(driver);
		//act.dragAndDrop(src,dst).perform();
		//driver.findElement(By.xpath("//a[text()='Drag Multiple']")).click();
		
		WebElement src1=driver.findElement(By.xpath("//div[text()='Mobile"));
		WebElement src2=driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement dst1=driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(src1,dst1).keyDown(Keys.CONTROL).click(src2).perform();
		
	}

}
