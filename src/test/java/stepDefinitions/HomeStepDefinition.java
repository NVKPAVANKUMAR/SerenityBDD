package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.HomeStep;

public class HomeStepDefinition {

    @Steps
    HomeStep homeStep;

    @Given("I open the website")
    public void iOpenTheWebsite() {
        homeStep.openTheWebsite();
    }

    @When("^I click burger menu$")
    public void iClickBurgerMenu() {
        homeStep.clickBurgerMenu();
    }

    @When("^I click My Account menu$")
    public void iClickMyAccountMenu() {
        homeStep.clickMenuMyAccount();
    }

    @When("^I click Login menu$")
    public void iClickLoginMenu() {
        homeStep.clickLoginMenu();
    }

}
