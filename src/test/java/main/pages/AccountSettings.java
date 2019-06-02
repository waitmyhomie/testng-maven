package pages;

import base.BaseActions;
import io.qameta.allure.Step;

public class AccountSettings extends BaseActions {
    private final String profileBtn = "//div[@class='mbg']";
    private final String profileEditBtn = "//button[@id='edit']";

    private final String editDoneBtn = "//button[@id='done']";

    private final String statusField = "//textarea[@class='input_bio']";

    private final String showValue = "//div[@class='show_value']";

    private final String statusEditBtn = "//*[@id='user_bio']";

    private final String saveBtn = "//*[contains(@class,'save')]//../../..//div[@class='usrbio edit']";

    @Step("Click profile btn")
    public void clickProfileBtn() {
        click(profileBtn);
    }

    @Step("Click profile edit btn")
    public void clickProfileEditBtn() {
        click(profileEditBtn);
    }

    @Step("Click done btn")
    public void clickDoneBtn() {
        click(editDoneBtn);
    }

    @Step("Open status field")
    public void openStatusField() {
        click(showValue);
    }

    @Step("Type status {itemName}")
    public void setStatus(String itemName) {
        type(itemName, statusField, itemName);
    }

    @Step("Click edit status btn")
    public void clickEditStatusBtn() {
        click(statusEditBtn);
    }

    @Step("Click save btn")
    public void clickSaveBtn() {
        click(saveBtn);
    }

    @Step("Wait till edit button is visible")
    public void waitForEditBtn() {
        waitForVisibility(statusEditBtn);
    }

    public void openProfile() {
        clickProfileBtn();
        clickProfileEditBtn();
    }

    public void editStatus(String firstStatus, String secondStatus) {
        openStatusField();
        setStatus(firstStatus);
        clickDoneBtn();
        clickProfileEditBtn();
        clickEditStatusBtn();
        setStatus(secondStatus);
        clickDoneBtn();
    }
}
