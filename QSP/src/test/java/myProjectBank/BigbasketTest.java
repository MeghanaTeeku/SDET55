package myProjectBank;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BigbasketTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.bigbasket.com/ps/?q=apple&nc=as");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
	
		WebElement web=driver.findElement(By.xpath("//h3[.='Apple - Royal Gala, Regular']/ancestor::li[@class='PaginateItems___StyledLi-sc-1yrbjdr-0 dDBqny']//button[.='Add']"));
		Thread.sleep(5000);
	web.click();
	Thread.sleep(5000);
	WebElement apple=driver.findElement(By.xpath("//button[@class='Button-sc-1dr2sn8-0 dcJzPv CtaOnDeck___StyledButton2-sc-orwifk-3 GGExL group CtaOnDeck___StyledButton2-sc-orwifk-3 GGExL group']"));
	for(int i=0;i<4;i++)
	{
		apple.click();
	}
	}

}//button[@class='Button-sc-1dr2sn8-0 dcJzPv CtaOnDeck___StyledButton2-sc-orwifk-3 GGExL group CtaOnDeck___StyledButton2-sc-orwifk-3 GGExL group']
