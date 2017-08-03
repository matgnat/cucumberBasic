package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

import java.nio.channels.spi.AbstractSelectionKey;

/**
 * Created by magn on 7/12/2017.
 */
//JUNIT RUNNER
//@RunWith(Cucumber.class)
//@CucumberOptions(features = {"src\\test\\java\\Features"}, glue = "Steps")
//public class TestRunner {
//
//
//}


//NG RUNNER

@CucumberOptions(features = {"src\\test\\java\\Features"},
                glue = "Steps",
                format = {"json:target\\cucumber.json", "html:target\\site\\cucumber-pretty"})
public class TestRunner extends AbstractTestNGCucumberTests{


}