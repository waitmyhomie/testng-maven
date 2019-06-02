package test;

import base.BaseTests;
import org.testng.annotations.Test;

import static properties.Credentials.TEST_AUTOTEST;

public class AccountTests extends BaseTests {

    @Test
    public void loginWithExistedUser() {
        page.mainPage().openBaseUrl();
        page.mainPage().clickLogin();
        page.loginPage().login(TEST_AUTOTEST);
        page.mainPage().openAccountSettings();
        page.accountSettings().openProfile();
        page.accountSettings().editStatus("first", "second");
    }
}
