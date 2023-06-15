package Generic;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitstatementLib {

	public void implicitWaitForSeconds(WebDriver driver, int time){
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		
	}
	
	public void implicitlyWaitForMinutes(WebDriver driver, int time){
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.MINUTES);
		
	}
	
	public void explicitWait(WebDriver driver, WebElement element){
		WebDriverWait wait= new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(element));
		
		}
	
}
