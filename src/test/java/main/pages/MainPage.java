package pages;


import base.BaseActions;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;

public class MainPage extends BaseActions {
    private final String searchField =
            "//input[@class='gh-tb ui-autocomplete-input']";

    private final String searchBtn = "//input[@value='Finden']";

    private final String loginBtn = "//*[contains(text(),'Einloggen')]";

    private final String accountSettings = "//*[contains(text(),' Mein eBay')]";


    @Step("Type item name {itemName}")
    public void setSearchItem(String itemName) {
        type(itemName, searchField, itemName);
    }

    @Step("Click search")
    public void clickSearch() {
        click(searchBtn);
    }

    @Step("Click Login")
    public void clickLogin() {
        click(loginBtn);
    }

    @Step("Open Account settings")
    public void openAccountSettings() {
        click(accountSettings);
    }

    @Step("Open Ebay site")
    public void openBaseUrl() {
        open("https://www.ebay.de/");
    }
}
