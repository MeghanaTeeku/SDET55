package myProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demodropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		WebElement drop=driver.findElement(By.id("select3"));
		Select opt=new Select(drop);
		opt.selectByVisibleText("India");
		//opt.selectByIndex(3);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		WebElement drop1=driver.findElement(By.id("select5"));
		Select opt1=new Select(drop1);
		opt1.selectByVisibleText("Assam");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		WebElement drop3=driver.findElement(By.id("select1"));
		Select opt3=new Select(drop3);
		opt3.selectByVisibleText("+01");
		driver.findElement(By.id("phone")).sendKeys("12456");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		WebElement drop4=driver.findElement(By.id("select2"));
		Select opt4=new Select(drop4);
		opt4.selectByVisibleText("Male");
		
		WebElement drop5=driver.findElement(By.id("select7"));
		Select opt5=new Select(drop5);
		opt5.selectByVisibleText("2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.id("continuebtn")).click();
		
		WebElement drop2=driver.findElement(By.id("optionCity"));
		Select opt2=new Select(drop2);
		opt2.selectByVisibleText("Cachar");
	}

}
