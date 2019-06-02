package pages;

import base.BaseActions;
import io.qameta.allure.Step;
import org.testng.Assert;

public class VariantsPage extends BaseActions {

    private final String requestedItems =
            "//div[@id='ResultSetItems']//*[contains(text(),'%s')]";

    @Step("Check how many position available on ebay {itemName}")
    public int resultsCountCheck(String itemName) {
        return getCount(requestedItems, itemName);
    }

    @Step("Check how many position available on ebay {itemName} and how many we waiting {itemQuantity}")
    public void checkQuantityItems(String itemName, int itemQuantity) {
        Assert.assertEquals(resultsCountCheck(itemName), itemQuantity);
    }

    @Step("Click on {itemName} with position in list {index}")
    public void selectItemWithPos(String itemName, int index) {
        selectItemFromList(requestedItems, index, itemName);
    }

    @Step("Click on {itemName} in list")
    public void clickOnItemInList(String itemName) {
        click(requestedItems, itemName);
    }
}
