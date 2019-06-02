package test;

import base.BaseTests;
import org.testng.annotations.Test;

public class OrderTests extends BaseTests {

    @Test
    public void createOrder() {
        page.mainPage().openBaseUrl();
        page.mainPage().setSearchItem("macbook");
        page.mainPage().clickSearch();
        page.filersMenu().clickSortCategory("Auktion & Sofort-Kaufen");
        page.filersMenu().clickSuggestedItem("Sofort-Kaufen");
        page.variantsPage().selectItemWithPos("Macbook", 2);
        page.itemPage().clickAddToCard();
        page.itemPage().clickNoBtn();
        page.itemPage().clickDeleteBtn();
    }

    @Test
    public void selectItemSpecification() {
        page.mainPage().openBaseUrl();
        page.mainPage().setSearchItem("Fitbit Charge 3");
        page.mainPage().clickSearch();
        page.filersMenu().setFilters("Auktion & Sofort-Kaufen", "Sofort-Kaufen");
        page.filersMenu().selectItemInFilterDialog("Farbe", "Blau");
        page.variantsPage().clickOnItemInList("Fitbit Charge 3 Armband Ersatz Silikon Band Sport Uhrenarmband Fitness Tracker");
        page.itemPage().clickOnSizeDropdown();
        page.itemPage().selectItemInSizeDropdown("(140mm bis 180mm)");
        page.itemPage().clickOnColorDropdown();
        page.itemPage().selectItemInColorDropdown("Hellblau");
    }
}
