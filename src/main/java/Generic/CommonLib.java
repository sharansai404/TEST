package Generic;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class CommonLib {
	WebDriver driver;
	public CommonLib(WebDriver driver){
		this.driver=driver;
	}
	public static ExtentTest testinfo;
	    public void Scroll (WebDriver driver ,int startpixel,int endpixel){
				RemoteWebDriver r = (RemoteWebDriver) driver;
				String j= "window.scrollTo("+Integer.toString(startpixel)+","+Integer.toString(endpixel)+")";

				r.executeScript(j);
		}



}
