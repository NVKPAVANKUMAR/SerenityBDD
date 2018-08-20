import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


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
