package pom;

import Generic.BaseLib;
import Generic.CommonLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends BaseLib {

    public WebDriver driver;

    @FindBy(xpath = "//a[text()='Submit']")
    private WebElement btnSubmit;

    @FindBy(xpath = "//span[text()='Forename is required']")
    private WebElement forNameMsg;


    @FindBy(xpath = "//span[text()='Email is required']")
    private WebElement emailMsg;

    @FindBy(xpath = "//span[text()='Message is required']")
    private WebElement commentMsg;

    @FindBy(xpath = "//input[@id='forename']")
    private WebElement txtForName;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement txtEmail;

    @FindBy(xpath = "//textarea[@id='message']")
    private WebElement txtMsg;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    private WebElement successMsg;

    public ContactPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }



    public  void verifyMandatoryField( ){
        clickOnElement(btnSubmit,"Submit button",driver);
        verifyText(forNameMsg,"Forename is required");
        verifyText(emailMsg,"Email is required");
        verifyText(commentMsg,"Message is required");
    }
    public void enterValueCheckMessage(){
        enterValue(txtForName,"Test","Forname");
        enterValue(txtEmail,"Test@gmmail.com","Email");
        enterValue(txtMsg,"Test12123","Message");
        validateElementPresent(forNameMsg);
        validateElementPresent(emailMsg);
        validateElementPresent(commentMsg);
    }
    public  void submitContact(){
        enterValue(txtForName,"Test","Forname");
        enterValue(txtEmail,"Test@gmmail.com","Email");
        enterValue(txtMsg,"Test12123","Message");
        clickOnElement(btnSubmit,"Submit button",driver);
    }
    public void validateSuccessMessage(){
        validateSuccessMessage(successMsg);
    }
}
