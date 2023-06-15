package pom;

import Generic.BaseLib;
import Generic.CommonLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BaseLib {
        WebDriver driver;
    @FindBy(xpath = "//h4[text()='Stuffed Frog']/parent::div/p/a")
    private WebElement btnBuyStuffedFrog;
    @FindBy(xpath = "//h4[text()='Stuffed Frog']/parent::div/p/span")
    private WebElement priceStuffedFrog;

    @FindBy(xpath = "//h4[text()='Fluffy Bunny']/parent::div/p/a")
    private WebElement btnBuyFluffyBunny;
    @FindBy(xpath = "//h4[text()='Fluffy Bunny']/parent::div/p/span")
    private WebElement priceFluffyBunny;

    @FindBy(xpath = "//h4[text()='Valentine Bear']/parent::div/p/a")
    private WebElement btnBuyValentineBear;
    @FindBy(xpath = "//h4[text()='Valentine Bear']/parent::div/p/span")
    private WebElement priceValentineBear;

    @FindBy(xpath = "//a[contains(@href,'cart')]")
    private WebElement btnCart;

    public ProductPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    CommonLib cl = new CommonLib(driver);
    public double StuffedFrogPriceAndAddToCart(){
        double price=getText(priceStuffedFrog);
        clickOnElement(btnBuyStuffedFrog,"Buy button of stuffed frog",driver);
        return price;
    }

    public double fluffyPriceAndAddToCart(){
        double price=getText(priceFluffyBunny);
        clickOnElement(btnBuyFluffyBunny,"Buy button of fluffy bunny",driver);
        return price;
    }

    public double valentinePriceAndAddToCart(){
        double price=getText(priceValentineBear);
        clickOnElement(btnBuyValentineBear,"Buy button of Valentine bear",driver);
        return price;
    }

    public void clickOnCart(){
        clickOnElement(btnCart, "cart button",driver);
    }


}
