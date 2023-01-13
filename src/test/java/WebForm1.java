import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm1 extends PageObject {

    private final String First_name = "standard_user";
    private final String Pass = "secret_sauce";

    @FindBy(id = "user-name")
    private WebElement first_name;

    @FindBy(id = "password")
    private WebElement pass;

    @FindBy(id = "login-button")
    private WebElement login;


    public WebForm1(WebDriver driver) {
        super(driver);
    }

    public void enterFirstname()
    {
        this.first_name.sendKeys(First_name);
    }

    public void enterPass()
    {
        this.pass.sendKeys(Pass);
    }

    public void clickSubmit()
    {
        this.login.click();
    }

}
