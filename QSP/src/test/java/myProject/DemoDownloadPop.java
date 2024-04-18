package myProject;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoDownloadPop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		WebDriver driver=new FirefoxDriver();
//		driver.navigate().to("https://www.amazon.com");
//		ChromeOptions options=new ChromeOptions();
//		HashMap<String, Object> map=new HashMap<String, Object>();
//		options.setExperimentalOption("Prefs", chromePrefs);
//		chromePrefs.put("download.default_direcoty","");
//		WebDriver driver=new ChromeDriver(options);
//		driver.get("");
		
			//authentication popup
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		String username="admin";
//		String password="admin";
//		String url="https://"+username+":"+password+"@"+"basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app";
//		driver.get(url);
		
//		Model Notification(single)
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/modal?sublist=0");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		driver.findElement(By.id("modal1")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("closeModal")).click();
		
//		Model Notification(Multiple)
		
//		WebDriver driver=new FirefoxDriver();
//		driver.get("https://demoapps.qspiders.com/ui/modal/multiModal?sublist=1");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		WebElement we=driver.findElement(By.id("multiModalButton"));
//		we.click();
//		Thread.sleep(2000);
//		System.out.println( we.getText());	
//		driver.findElement(By.id("multiClosemodal")).click();
//		WebElement ele1=driver.findElement(By.xpath("//p[.='This is the secondary modal']"));
//		System.out.println(ele1.getText()); 
//		driver.findElement(By.xpath("//button[.='close']")).click();
//		driver.findElement(By.xpath("//section[@class='flex justify-end pt-2']//button[@id='multiclose2']")).click();
//		

//		ChromeOptions opt=new ChromeOptions();
//		opt.addArguments("--use-fake-ui-for-media-stream");
//		WebDriver driver=new ChromeDriver(opt);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		driver.get("https://mictests.com");
//		driver.findElement(By.xpath("//button[.='Test my mic']")).click();
		
// 		WebDriver driver=new FirefoxDriver();
//		driver.get("https://www.amazon.com");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		driver.get("https://www.facebook.com");
//		driver.get("https://www.flipkart.com");
//		driver.close();
		// to open windows in new tab
//		WebDriver driver=new FirefoxDriver();
//		driver.navigate().to("https://www.amazon.com");
		//driver.navigate().to("https://www.facebook.com");
		//driver.navigate().to("https://www.amazon.com");
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://www.google.com");
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.navigate().to("https://www.amazon.com");
//		driver.switchTo().newWindow(WindowType.TAB);
//		for(int i=0;i<4;i++)
//		{
//			driver.switchTo().newWindow(WindowType.TAB);	
		}
	}
	


