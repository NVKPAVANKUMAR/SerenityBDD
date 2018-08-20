package steps;

import net.thucydides.core.annotations.Step;
import pages.LoginPage;

public class LoginStep {
    LoginPage loginPage;

    @Step
    public void verifyLoginPage() {
        loginPage.verifyPage();
    }

    @Step
    public void inputEmail(String usn) {
        loginPage.inputEmail(usn);
    }

    @Step
    public void inputPassword(String pass) {
        loginPage.inputPassword(pass);
    }

    @Step
    public void clickSubmitButton() {
        loginPage.clickBtnSubmit();
    }
}
