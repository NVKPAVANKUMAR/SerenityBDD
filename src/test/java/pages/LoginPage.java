package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {
    @FindBy(name = "username")
    private WebElementFacade username;

    @FindBy(name = "password")
    private WebElementFacade password;

    @FindBy(xpath = ".//button[text()='Login']")
    private WebElementFacade btnLogin;

    public void verifyPage() {
        username.shouldBeVisible();
        username.shouldBeEnabled();
        password.shouldBeVisible();
        password.shouldBeEnabled();
        btnLogin.shouldBeVisible();
        btnLogin.shouldBeEnabled();
    }

    public void inputEmail(String usn) {
        username.type(usn);
    }

    public void inputPassword(String pass) {
        password.type(pass);
    }

    public void clickBtnSubmit() {
        btnLogin.click();
    }
}
