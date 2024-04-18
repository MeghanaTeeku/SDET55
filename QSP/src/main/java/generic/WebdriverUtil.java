package generic;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WebdriverUtil {

	 public void switchWindow(WebDriver driver, String url)
	 {
		Set<String> win=driver.getWindowHandles(); 
		for(String st:win)
		{
			driver.switchTo().window(st);
			String text=driver.getCurrentUrl();
			if(text.contains(url))
			{
				break;
			}
		}
	 }

}
