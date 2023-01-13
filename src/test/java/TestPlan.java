import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Listeners(CustomListners.class)
public class TestPlan {
    WebDriver driver;


    @BeforeMethod
    public void setUp()
    {
        System.out.println("********This is before method**********");
        System.setProperty("webdriver.chrome.driver",UtilClass.chrome_driver_location);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(UtilClass.base_url);
        driver.manage().deleteAllCookies();
    }

    @Test(priority = 1)
    public void VerifyPageTitle()
    {
        System.out.println("*******This is Test1 Method*********");
        String title = driver.getTitle();
        System.out.println("Page Title is : "+title);
        Assert.assertEquals(title,"Swag Labs");
    }

    @Test(priority = 2)
    public void CheckOut()
    {
        System.out.println("*******This is Test2 Method********");
        WebForm1 web1 = new WebForm1(driver);
        WebForm2 web2 = new WebForm2(driver);
        WebForm3 web3 = new WebForm3(driver);

        web1.enterFirstname();
        web1.enterPass();
        web1.clickSubmit();

        web2.clickAddToCart();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        web2.clickCartIcon();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        web2.clickCheckOut();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        web2.enterfname();
        web2.enterlname();
        web2.enterZipcode();
        web2.clickContinue();
        web2.clickFinish();

        web3.clickbackToProducts();
        web3.ClickMenu();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        web3.ClickLogout();
    }

    @AfterMethod
    public void Teardown()
    {
        System.out.println("**********This is After Method*************");
        driver.quit();
    }

}
