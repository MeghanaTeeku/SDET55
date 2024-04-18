package myProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFilePop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
//		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		WebElement ele=driver.findElement(By.xpath("//input[@id='fileInput']"));
//		ele.sendKeys("C:\\Users\\HP\\Desktop\\demo.docx");
//		WebElement ele1=driver.findElement(By.xpath("//p[text()='demo.docx']"));
//		String st=ele1.getText();
//		System.out.println(st);
		//ele.sendKeys("C:\\Users\\HP\\Desktop\\resume final.docx");
		
		//Multiple Files
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		driver.findElement(By.xpath("//a[text()='Multiple select']")).click();
		WebElement ele2=driver.findElement(By.xpath("//input[@id='fileInput']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		ele2.sendKeys("C:\\Users\\HP\\Desktop\\demo.docx");
//		ele2.sendKeys("C:\\Users\\HP\\Desktop\\resume final.docx");
		ele2.sendKeys(System.getProperty("user.dir")+"/src/test/resources/hello.txt");

	
	}

}
