package pages;

import base.BaseActions;
import io.qameta.allure.Step;

public class FiltersMenu extends BaseActions {
    private final String sortMenu = "//*[contains(text(),'%s')]";
    private final String sortMenuDropdown =
            "//div[@class='smenu dasps']//a[@title='%s']";

    private final String seeAllBtn =
            "//*[@id='%s']//..//button[@class='seeall']";

    private final String dialogWindow = "//form[@id='see-all-form']";

    private final String itemIndDialogWindow =
            "//label[@data-name='%s']//..//input[@type='checkbox']";

    private final String submitDialogBtn = "//div[@class='cb']//input[@type='submit']";

    private final String selectedFiltersField =
            "//div[@id='innerlayer']//*[contains(text(),'%s')]";

    @Step("Click on filter dropdown  {catName}")
    public void clickSortCategory(String catName) {
        click(sortMenu, catName);
    }

    @Step("Click on item in filter dropdown  {itemName}")
    public void clickSuggestedItem(String itemName) {
        click(sortMenuDropdown, itemName);
    }

    @Step("Click see all for {itemName}")
    public void clickSeeAll(String itemName) {
        click(seeAllBtn, itemName);
    }

    @Step("Waiting for dialog window is visible")
    public void waitForDialogVisibility() {
        waitForVisibility(dialogWindow);
    }

    @Step("Waiting for dialog window is invisible")
    public void waitForDialogInvisibility() {
        waitForInvisibility(dialogWindow);
    }

    @Step("Click on checkbox {itemName} for {filterName}")
    public void clickCheckboxInWindow(String itemName, String filterName) {
        setCheckboxState(itemIndDialogWindow, itemName);
        waitForVisibility(selectedFiltersField, filterName);
    }

    @Step("Click submit btn in dialog window")
    public void clickSubmitDialog() {
        click(submitDialogBtn);
    }

    public void setFilters(String filterName, String optionName) {
        clickSortCategory(filterName);
        clickSuggestedItem(optionName);
    }

    public void selectItemInFilterDialog(String seeAllCat, String checkboxName){
        clickSeeAll(seeAllCat);
        waitForDialogVisibility();
        clickCheckboxInWindow(checkboxName, checkboxName);
        clickSubmitDialog();
        waitForDialogInvisibility();
    }
}
