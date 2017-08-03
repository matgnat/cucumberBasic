package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by magn on 7/12/2017.
 */
public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this); //initialize all elements by calling this particular constructor
    }

    @FindBy(how = How.NAME,using = "UserName")
    public WebElement username;

    @FindBy(how = How.NAME, using = "Password")
    public WebElement password;

    @FindBy(how = How.NAME, using = "Login")
    public WebElement loginButton;

    public void loginToPage(String userName, String passWord)
    {
        username.sendKeys(userName);
        password.sendKeys(passWord);
    }

    public void loginToPageSubmit()
    {
        loginButton.submit();
    }
}
