package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.LoginStep;

public class LoginStepDefinition {

    @Steps
    LoginStep loginStep;

    @Then("I can see Login page")
    public void iCanSeeLoginPage() {
        loginStep.verifyLoginPage();
    }

    @When("^I input email \"([^\"]*)\"$")
    public void iInputEmail(String arg0) {
        loginStep.inputEmail(arg0);
    }

    @And("^I input password \"([^\"]*)\"$")
    public void iInputPassword(String arg0) {
        loginStep.inputPassword(arg0);
    }

    @And("^I click Submit button$")
    public void iClickSubmitButton() {
        loginStep.clickSubmitButton();
    }
}
