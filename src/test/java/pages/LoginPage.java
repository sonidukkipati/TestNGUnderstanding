package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by sc on 2/10/2017.
 */
public class LoginPage {

    WebDriver dr;
    private String username = "sonichalasani@yahoo.com";
    private String password = "soni123";
    /* private String username1 = "sinduchalasani789@gmail.com";
       private String password1 = "sindu.789";
     */
    public LoginPage(WebDriver dr){
        System.out.println("Created Login Page");
        this.dr = dr;
    }
    public WebElement userNameField() {
        return dr.findElement(By.xpath(".//*[@id='exampleInputEmail1']"));
    }

    public WebElement passWordField() {

        return dr.findElement(By.xpath(".//*[@id='exampleInputPassword1']"));
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }

    public WebElement loginButton(){
        return dr.findElement(By.xpath("//button[text()='Login']"));
    }

    //        dr.findElement(By.xpath(".//*[@id='exampleInputPassword1']")).sendKeys(password);
    //        dr.findElement(By.xpath("//button[text()='Login']")).click();

}

