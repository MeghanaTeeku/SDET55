package myProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoJavascriptExc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//TO launch the browser
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.location=arguments[0]", "https://www.flipkart.com");
		
		//Scrolldown till the bottom of the page
		//js.executeScript(("window.scrollBy(0,document.body.scrollHeight)"));
		
		//Thread.sleep(2000);
		//ScrollTo to3p of the page
		//js.executeScript(("window.scrollBy(0,-document.body.scrollHeight)"));
		
		//ScrollTill ELement
//		WebElement	ele=driver.findElement(By.xpath("//a[.='iPhone 15 Plus']"));
//		js.executeScript("arguments[0].scrollIntoView()",ele);
       
		//sendKeys
//		WebElement	ele=driver.findElement(By.xpath("//input[@type='text']"));
//		js.executeScript("arguments[0].value=arguments[1]",ele,"watch");
		
		//click on element
//		WebElement	ele=driver.findElement(By.xpath("//a[.='iPhone 15 Plus']"));
//		js.executeScript("arguments[0].click()",ele);
		
		//get the text
//		WebElement	ele=driver.findElement(By.xpath("//a[.='iPhone 15 Plus']"));
//		String st=(String)js.executeScript("return arguments[0].value;",ele);
//		System.out.println(st);
		
		//Scrollby
		WebElement ele=driver.findElement(By.xpath("//a[.='iPhone 15 Plus']"));
		Point loc=ele.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		js.executeScript("window.scrollBy("+x+","+y+")");
	}

}
