package myProject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		WebDriver driver=new FirefoxDriver();
//		driver.get("https://demoapps.qspiders.com/ui/link?sublist=0");
//		//driver.get("https://www.facebook.com");
//		List<WebElement>ele=driver.findElements(By.xpath("//a"));
//		int count=ele.size();
//		System.out.println(count);
//		for(int i=0;i<count-1;i++)
//		{
//			String st=ele.get(i).getText();
//			System.out.println(st);
//		}
//		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
//		driver.findElement(By.id("select1"));
		
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 15");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[.='Apple iPhone 15 Plus (128 GB) - Green']")).click();
		driver.findElement(By.xpath("//img[@class='s-image' and @alt='Apple iPhone 15 (128 GB) - Green']")).click();
		System.out.println("done");
		Thread.sleep(1000);
		Set<String> win =driver.getWindowHandles();
		//win.remove(driver.getWindowHandle());
		for(String we:win)
		{
			driver.switchTo().window(we);
			String st=driver.getCurrentUrl();
			System.out.println(st);
			if(st.contains("Apple-iPhone-15-128-GB"))
			{
				break;
			}
//			if((driver.getCurrentUrl()).equals(""))
//			{
//				
//			}
		}
		//driver.switchTo().window("https://www.amazon.in/Apple-iPhone-15-128-GB/dp/B0CHX6NQMD/ref=sr_1_8?dib=eyJ2IjoiMSJ9.8-aKrERwPzdGyJWfWOa56I-1ghRtBzwyC2PtRWYX30-4nrBHk0q7-6xivRGXMniwCXl-FkCToLwcz-cYGgEMiUuvHJ8VquA3TWzGBkndrf50Xwsly5FkJwVaXXSZmO5NdKMXZ6HGLBdY2sukDSmtxyhJD5fUfpVpnDipADtkVUwkcRFFmlUg5ZHtZDHCyp8ANqIupNzurruhSTUzCnV4rTf3T4-ZjARmpvj67wJIDUc.i6L8MZybpKPCk6vyu_4IV8X8Al88y60oUWR9mivYOtk&dib_tag=se&keywords=iphone+15&qid=1710762260&sr=8-8");
		List<WebElement> ele1=driver.findElements(By.xpath("//ul[@class='a-unordered-list a-vertical a-spacing-mini']//li"));
		for(WebElement we:ele1)
		{
		System.out.println(we.getText());
	
		}
		List<WebElement> ele=driver.findElements(By.xpath("//button[@class='a-button-text']//img"));
		for(WebElement col:ele)
		{
			String atr=col.getAttribute("alt");
			System.out.println(atr);
		}
		System.out.println("done done");
		Thread.sleep(2000);
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("elementId")));
//		element.click();
		//WebElement cart=driver.findElement(By.xpath("//input[@id='add-to-cart-button' and @type='submit']"));
		WebElement cart=driver.findElement(By.xpath("//span[@class='a-button-inner']//a[@class='a-button-text a-text-left']"));
		cart.click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("7353668024");
		driver.findElement(By.xpath("//input[@id='continue' and @type='submit']")).click(); 
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Teeku@9898");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		////driver.findElement(By.xpath("//input[@id='add-to-cart-button' and @class='a-button-input']")).click();
		//driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-submit' ]")).click(); 
		//driver.findElement(By.xpath("//div[@id='nav-cart-text-container' ]")).click(); //input[@id='add-to-wishlist-button' ]
		driver.findElement(By.xpath("//input[@id='buy-now-button']")).click(); 
		
		
	}
}

