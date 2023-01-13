import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm2 extends PageObject{

    private final String fnameInfo = "Jhon";
    private final String lnameInfo = "Alberto";
    private final String zipcode = "123456";


    @FindBy(id = "first-name")
    private WebElement fname;

    @FindBy(id = "last-name")
    private WebElement lname;

    @FindBy(id = "postal-code")
    private WebElement zcode;

    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
    private WebElement cart;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a/span")
    private WebElement cartIcon;

    @FindBy(id = "checkout")
    private WebElement checkOut;

    @FindBy(id = "continue")
    private WebElement continuebutton;

    @FindBy(id = "finish")
    private WebElement Finishbutton;

    public WebForm2(WebDriver driver) {
        super(driver);
    }

    public void clickAddToCart()//2
    {
        this.cart.click();
    }

    public void clickCartIcon()//2
    {
        this.cartIcon.click();
    }

    public void clickCheckOut()//2
    {
        this.checkOut.click();
    }

    public void enterfname()
    {
        this.fname.sendKeys(fnameInfo);
    }
    public void enterlname()
    {
        this.lname.sendKeys(lnameInfo);
    }
    public void enterZipcode()
    {
        this.zcode.sendKeys(zipcode);
    }

    public void clickContinue()
    {
        this.continuebutton.click();
    }

    public void clickFinish()
    {
        this.Finishbutton.click();
    }

}
