package test;

import base.BaseTests;
import org.testng.annotations.Test;

public class SearchTest extends BaseTests {

    @Test
    public void searchItem() {
        page.mainPage().openBaseUrl();
        page.mainPage().setSearchItem("google pixel");
        page.mainPage().clickSearch();
        page.filersMenu().setFilters("Auktion & Sofort-Kaufen", "Sofort-Kaufen");
        page.filersMenu().selectItemInFilterDialog( "Modell", "Acer Liquid E700");
        page.variantsPage().checkQuantityItems("Google Pixel", 7);
    }
}
