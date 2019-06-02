package base;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.Page;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.*;

public class BaseTests {

    protected Page page;

    @BeforeMethod
    public void setUp() {
        clearBrowserCache();
        Configuration.timeout = 15000;
        Configuration.browserSize = "1920x1080";
        page = new Page();
    }

    @AfterMethod
    public void closeBrowser(){
        close();
        clearBrowserCache();
    }
}

