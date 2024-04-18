package myProject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebElement drop=driver.findElement(By.id("select3"));
		Select opt=new Select(drop);
		opt.selectByVisibleText("India");
		//opt.selectByVisibleText("China");
		
		WebElement drop1=driver.findElement(By.id("select5"));
		Select opt1=new Select(drop1);
		ArrayList<String>l=new ArrayList<String>();
		List<WebElement> op=opt1.getOptions();
		for(WebElement we: op)
		{
			String st=we.getText();
			l.add(st);
			System.out.println(st);
			
		}
		for(String stt:l)
		if(stt.equals("Delhi"))
		{
			System.out.println("Present");
		}
		driver.close();
		//opt1.selectByVisibleText("Assam");
		
		//WebElement drop2=driver.findElement(By.id("optionCity"));
		//Select opt2=new Select(drop2);
		//opt2.selectByVisibleText("Cachar");
		
		
	}

	}


//ArrayList<String> s=new ArrayList<String>();
//int count=s.size();
//System.out.println(count);


//for(WebElement we:s
//{
	//String wee=we.getText();
	//System.out.println(wee); 
//}