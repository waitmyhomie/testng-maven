package pages;

import base.BaseActions;
import io.qameta.allure.Step;


public class LoginPage extends BaseActions {

    private final String emailField = "//input[@id='userid']";
    private final String passField = "//input[@id='pass']";
    private final String loginBtn = "//button[@id='sgnBt']";

    @Step("Type email {value}")
    private void typeLogin(String value) {
        type(value, emailField, value);
    }

    @Step("Type pass {value}")
    private void typePassword(String value) {
        type(value, passField, value);
    }

    @Step("Click login btn")
    private void clickLoginButton() {
        click(loginBtn);
    }

    @Step("Wait till login btn is invisible")
    private void waitForLoginInvisibility() {
        waitForInvisibility(loginBtn);
    }

    public void login(String[] credentials) {
        typeLogin(credentials[0]);
        typePassword(credentials[1]);
        clickLoginButton();
        waitForLoginInvisibility();
    }

}
