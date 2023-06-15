package pom;

import Generic.BaseLib;
import Generic.CommonLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage extends BaseLib {
WebDriver driver;
    @FindBy(xpath = "//a[text()='Contact']")
    public  WebElement lnkContact;

    @FindBy(xpath = "//a[text()='Start Shopping »']")
    private WebElement btnStartShopping;



    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    CommonLib cl =  new CommonLib(driver);

    public void clickOnContact(){
        lnkContact.click();
    }

    public void clickOnShopping(){
        clickOnElement(btnStartShopping,"Shopping button",driver);
    }



}
