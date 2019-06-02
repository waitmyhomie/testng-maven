package base;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BaseActions {

    public void type(String value, String locator, Object... args) {
        $(By.xpath(String.format(locator, args))).setValue(value);
    }

    public void click(String locator, Object... args) {
        $(By.xpath(String.format(locator, args))).click();
    }

    protected void waitForVisibility(String locator, Object... args) {
        $(By.xpath(String.format(locator, args))).shouldBe(visible);
    }

    protected void waitForInvisibility(String locator, Object... args) {
        $(By.xpath(String.format(locator, args))).shouldBe(disappear);
    }

    protected void setCheckboxState(String locator, Object... args) {
        $(By.xpath(String.format(locator, args))).toWebElement().click();
    }

    protected int getCount(String locator, Object... args) {
        return $$(By.xpath(String.format(locator, args))).size();
    }

    protected void selectItemFromList(String locator, int index, Object... args) {
        $(By.xpath(String.format(locator, args)), index).click();
    }
}