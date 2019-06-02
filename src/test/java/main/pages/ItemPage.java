package pages;

import base.BaseActions;
import io.qameta.allure.Step;

public class ItemPage extends BaseActions {

    private final String addToCardBtn = "//*[contains(@id,'isCartBtn_btn')]";
    private final String deleteBtn = "//button[@data-test-id='cart-remove-item']";
    private final String noBtn = "//div[@class='addonBtn']//button[text()='Nein danke']";
    private final String sizeDropdown = "//select[@id='msku-sel-1']";
    private final String colorDropdown = "//select[@name='Farbe']";
    private final String itemInSizeDropdown = "//select[@id='msku-sel-1']//*[contains(text(),'%s')]";
    private final String itemInColorDropdown = "//select[@name='Farbe']//option[text()='%s']";
    private final String selectedOptionInSize =
            "//option[contains(text(),'%s') and @selected='selected']";
    private final String selectOptionInColor =
            "//select[@name='Farbe']//option[@selected='selected' and text()='%s']";

    @Step("Click 'add to card' btn")
    public void clickAddToCard() {
        click(addToCardBtn);
    }

    @Step("Click 'delete' btn")
    public void clickDeleteBtn() {
        click(deleteBtn);
    }


    @Step("Click 'no' btn")
    public void clickNoBtn() {
        click(noBtn);
    }

    @Step("Click 'size' dropdown")
    public void clickOnSizeDropdown() {
        click(sizeDropdown);
    }

    @Step("Click 'color' dropdown")
    public void clickOnColorDropdown() {
        click(colorDropdown);
    }

    @Step("Select {itemName} in 'color' dropdown")
    public void selectItemInColorDropdown(String itemName) {
        click(itemInColorDropdown, itemName);
        waitForVisibility(selectOptionInColor, itemName);
    }

    @Step("Select {itemName} in 'size' dropdown")
    public void selectItemInSizeDropdown(String itemName) {
        click(itemInSizeDropdown, itemName);
        waitForVisibility(selectedOptionInSize, itemName);
    }
}
