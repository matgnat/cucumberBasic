package Steps;

import Base.BaseUtil;
import Pages.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by magn on 7/11/2017.
 */
public class StepDef extends BaseUtil{



    private BaseUtil web;

    public StepDef(BaseUtil webdriver) {
        web = webdriver;
    }
    //LoginPage login = new LoginPage(web.driver);

    @Given("^I naviate to login page$")
    public void iNaviateToLoginPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("Nawigate to login page");
        //System.out.println("Webdriver is " + base.baseClass);
        //webdriver.driver.get("http://www.google.pl");
    }

    @And("^See how ccucmber-java(\\d+) looks like$")
    public void seeHowCcucmberJavaLooksLike(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I enter the following value for Login$")
    public void iEnterTheFollowingValueForLogin(DataTable table) throws Throwable
    {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();

        LoginPage login = new LoginPage(web.driver);

        List<User> users = new ArrayList<User>();
        users = table.asList(User.class);

        for(User user: users)
        {
//            web.driver.findElement(By.name("UserName")).sendKeys(user.username);
//            web.driver.findElement(By.name("Password")).sendKeys(user.password);
//            System.out.println(user.username);
//            System.out.println(user.password);


            login.loginToPage(user.username, user.password);
        }
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        //web.driver.findElement(By.name("Login")).submit();
        LoginPage login = new LoginPage(web.driver);
        login.loginToPageSubmit();
    }

//    @When("^I enter (.*) nad (.*)$")
//    public void iEnterUsernameNadPassword(String username, String password) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        //throw new PendingException();
//        System.out.println("scenario outline for pass is " + username);
//        System.out.println("scenario outline for pass is " + password);
//    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("I see the page");
        Assert.assertEquals("User Form",web.driver.findElement(By.xpath("//h2[text()=' User Form ']")).getText());
    }


    class User
    {
        public String username;
        public String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }
    }
}
