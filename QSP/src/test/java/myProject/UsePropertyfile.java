package myProject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class UsePropertyfile {
public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//passs the data 
//		Properties pr = new Properties();
//		pr.setProperty("browser","Chrome");
//		pr.setProperty("url","http://rmgtestingserver/domain/Online_Banking_System/staff_login.php");
//		pr.setProperty("username","210001");
//		pr.setProperty("password","password");
		
//		FileOutputStream fout = new FileOutputStream(".\\src\\main\\resources\\hello ");
//		pr.store(fout,"data");
//		
//		//get the data 
//		FileInputStream fs = new FileInputStream(".\\src\\main\\resources\\hello ");
//		//FileInputStream fs = new FileInputStream(".\\src\\main\\resources\\propertyfile ");
//		//Properties pro = new Properties();
//		pr.load(fs);
//		String brw = pr.getProperty("browser");
//		String url = pr.getProperty("url");
//		String un = pr.getProperty("username");
//		String pwd = pr.getProperty("password");
//		
//		System.out.println(brw+" "+url+" "+un+" "+pwd);
//		
//		if(brw.equalsIgnoreCase("chrome"))
//		{
//			driver=new ChromeDriver();
//		}
//		else if(brw.equalsIgnoreCase("firefox"))
//		{
//			driver=new FirefoxDriver();
//		}
//		else
//		{
//			System.out.println("--Invalid browser--");
//		}
//		driver.get(url);
//		driver.findElement(By.name("staff_id")).sendKeys(un);
//		driver.findElement(By.name("password")).sendKeys(pwd);
//		driver.findElement(By.name("staff_login-btn")).click();
		
		
		String brw = System.getProperty("browser");
		String url = System.getProperty("url");
		String un = System.getProperty("username");
		String pwd = System.getProperty("password");
		
		System.out.println(brw);
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
	}

}
