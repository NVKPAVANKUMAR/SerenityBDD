import cucumber.api.CucumberOptions;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.webdriver.driverproviders.ChromeDriverCapabilities;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/features/Login.feature",
                glue = {"stepDefinitions"})
public class TestRunner1 {
   /* private JUnit4TestRunner jUnit4TestRunner;

    @Test(description = "Runs Cucumber Feature")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        jUnit4TestRunner.run(TestRunner1.class);
    }*/
}
