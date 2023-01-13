import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm3 extends PageObject {

    @FindBy(id = "back-to-products")
    private WebElement backToProducts;
    @FindBy(id = "react-burger-menu-btn")
    private WebElement menu;
    @FindBy(id = "logout_sidebar_link")
    private WebElement logOutbutton;


    public WebForm3(WebDriver driver) {
        super(driver);
    }

    public void clickbackToProducts()
    {
        this.backToProducts.click();
    }

    public void ClickMenu()
    {
        this.menu.click();
    }

    public void ClickLogout()
    {
        this.logOutbutton.click();
    }
}
