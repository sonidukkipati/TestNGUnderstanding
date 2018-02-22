import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestLogin {
private WebDriver dr;
    @BeforeMethod
    public void setUp() throws Exception {

      dr = new ChromeDriver() ;
    }

    @Test
    public void test1() throws Exception {
        dr.get("https://www.fits.qauber.com");
        dr.manage().timeouts().pageLoadTimeout(200,TimeUnit.SECONDS);
        //Implicit wait: Wait for each element in the program for that time specified
        //But if element is available, before that, it will continue with execution
        dr.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        WebElement username=dr.findElement(By.xpath(""));
        WebDriverWait wait = new WebDriverWait(dr,500);
        //This is Explicit wait
        wait.until(
                ExpectedConditions.elementToBeClickable(username)
        );
    }

    @AfterMethod
    public void tearDown() throws Exception {

    }
}
