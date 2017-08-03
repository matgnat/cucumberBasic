package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by magn on 7/10/2017.
 */
public class Hooks extends BaseUtil{

    private BaseUtil web;

    public Hooks(BaseUtil webdriver) {
       web = webdriver;
    }

    @Before
    public void InitializePage() {
        System.out.println("Before test run");
        System.out.println();

        //passing "dummy" webdriver instane - depemdency injection
        System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
        web.driver = new ChromeDriver();
        web.driver.get("http://executeautomation.com/demosite/Login.html");
        web.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        //driver.navigate().to("http:\\www.google.pl");
    }

    @After
    public void TearDownPage(Scenario scenario) {
        System.out.println("After test run");
        System.out.println();
        if (scenario.isFailed()) {
            System.out.println("To byl" + scenario.getName());
        }

        web.driver.close();
    }

}
