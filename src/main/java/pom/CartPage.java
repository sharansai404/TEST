package pom;

import Generic.BaseLib;
import Generic.CommonLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BaseLib {
    WebDriver driver;
    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    private WebElement priceFirstProduct;

    @FindBy(xpath = "//tbody/tr[1]/td[3]/input")
    private WebElement quantityFirstProduct;

    @FindBy(xpath = "//tbody/tr[1]/td[4]")
    private WebElement subTotalFirstProduct;

    @FindBy(xpath = "//tbody/tr[2]/td[2]")
    private WebElement priceSecProduct;

    @FindBy(xpath = "//tbody/tr[2]/td[3]/input")
    private WebElement quantitySecProduct;

    @FindBy(xpath = "//tbody/tr[2]/td[4]")
    private WebElement subTotalSecProduct;

    @FindBy(xpath = "//tbody/tr[3]/td[2]")
    private WebElement priceThirdProduct;

    @FindBy(xpath = "//tbody/tr[3]/td[3]/input")
    private WebElement quantityThirdProduct;

    @FindBy(xpath = "//tbody/tr[3]/td[4]")
    private WebElement subTotalThirdProduct;

    @FindBy(xpath = " //tfoot/tr[1]//strong")
    private WebElement Total;

    public CartPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    CommonLib cl = new CommonLib(driver);

    public double firstProductQuantity() {
       double price= getValue(quantityFirstProduct);
        return price;
    }
    public double firstProductSubtotal() {
        double price= getText(subTotalFirstProduct);
        return price;
    }

    public double secProductQuantity() {
        double price= getValue(quantitySecProduct);
        return price;
    }
    public double secProductSubtotal() {
        double price= getText(subTotalSecProduct);
        return price;
    }

    public double thirdProductQuantity() {
        double price= getValue(quantityThirdProduct);
        return price;
    }
    public double thirdProductSubtotal() {
        double price= getText(subTotalThirdProduct);
        return price;
    }

    public double total() {
        double price= getText(Total);
        return price;
    }
    public void enterQuantity(){
        enterValue(quantityFirstProduct,"2","First Product");
        enterValue(quantitySecProduct,"5","Second Product");
        enterValue(quantityThirdProduct,"3","Third Product");
    }


}




