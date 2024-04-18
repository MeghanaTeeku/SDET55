package myProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
public class Demo1 {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		// TODO Auto-generated method stub
//		WebDriver driver=new FirefoxDriver();
//		driver.get("https://demoapps.qspiders.com/ui?scenario=4");
		
//		WebElement ele=driver.findElement(By.xpath("//input[@placeholder='Enter Your Email']"));
//	String st=ele.getText();
//	System.out.println(st);		
//		if(st.equals("Enter Your Email"))
//		{
//			System.out.println("Matching");
//		}
//		
//		WebDriver driver=new FirefoxDriver();
//		driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcdefghij@gmail.com");
//		WebElement ele=driver.findElement(By.xpath("//input[@id='password']"));
//		ele.sendKeys("Abcdef");
//		ele.sendKeys(Keys.chord(Keys.CONTROL,"AC"));
//		WebElement ele1=driver.findElement(By.xpath("//input[@id='confirmPassword']"));
//		ele1.sendKeys(Keys.chord(Keys.CONTROL,"v"));
//		WebElement ele2=driver.findElement(By.xpath("//button[@type='submit']"));
//		ele2.sendKeys(Keys.ENTER);
//		
		
//		WebDriver driver=new FirefoxDriver();
//		driver.get("https://www.facebook.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
//		WebElement ele1=driver.findElement(By.xpath("//input[@id='email']"));
//		ele1.sendKeys("abcdefghij@gmail.com");
//		//WebElement ele=driver.findElement(By.xpath("//input[@id='password']"));
//		ele1.sendKeys(Keys.chord(Keys.CONTROL,"AC"));
//		WebElement ele=driver.findElement(By.xpath("//input[@id='pass']"));
//		ele.sendKeys(Keys.chord(Keys.CONTROL,"v"));
//		WebElement ele2=driver.findElement(By.xpath("//button[@type='submit']"));
//		ele2.sendKeys(Keys.ENTER);
		
//		WebDriver driver=new FirefoxDriver();
//		driver.get("https://www.facebook.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xdm");
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_A);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_A);
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_C);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_C);
//		
//		driver.findElement(By.xpath("//input[@id='pass']")).click();
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_V);
//		
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
//		WebDriver driver=new FirefoxDriver();
//		driver.get("https://www.facebook.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
//		driver.findElement(By.xpath("//input[@id='email']"));//.click();
//		String text="dkjkgmail.com";
//		Robot r=new Robot();
//		for(char c:text.toCharArray()) {
//			int finaltext=KeyEvent.getExtendedKeyCodeForChar(c);
//			r.keyPress(finaltext);
//			r.keyRelease(finaltext);
		
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_WINDOWS);
//		r.keyRelease(KeyEvent.VK_WINDOWS);
//		Thread.sleep(2000);
//		String st="Task Manager";
//		for(char c:st.toCharArray()) {
//			int finaltext=KeyEvent.getExtendedKeyCodeForChar(c);
//			r.keyPress(finaltext);
//			r.keyRelease(finaltext);
//	
//		}
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
		//close the browser
		
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_WINDOWS);
//		r.keyPress(KeyEvent.VK_TAB);s
//		Thread.sleep(2000);
//		r.keyRelease(KeyEvent.VK_WINDOWS);
//		r.keyRelease(KeyEvent.VK_TAB);
//		r.keyPress(KeyEvent.VK_RIGHT);
//		r.keyRelease(KeyEvent.VK_RIGHT);
//		r.keyPress(KeyEvent.VK_DELETE);
//		r.keyRelease(KeyEvent.VK_RIGHT);
		
//		Runtime r=Runtime.getRuntime();
//		Process p=r.exec("taskkill /im chrome.exe /f /t");
		
		//Incognito mode
//		ChromeOptions opt=new ChromeOptions();
//		opt.addArguments("--lang=kor");
//		WebDriver driver=new ChromeDriver(opt);
//		driver.get("https://www.facebook.com");
//		System.out.println(driver.getTitle());
	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		TakesScreenshot st= (TakesScreenshot)driver;
		File src=st.getScreenshotAs(OutputType.FILE);
		File dst=new File("C:\\Users\\HP\\Pictures\\Screenshots\\picture.jpeg");
		//File dst=new File(".\\srceen\\picture.jpeg");
		//File dst=new File("\\test\\java\\myProject\\screen\\pic.jpeg");
		FileHandler.copy(src, dst);
		
	}}



