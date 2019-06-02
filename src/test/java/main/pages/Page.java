package pages;

public class Page {
    public MainPage mainPage() {
        return new MainPage();
    }

    public VariantsPage variantsPage() {
        return new VariantsPage();
    }

    public FiltersMenu filersMenu() {
        return new FiltersMenu();
    }

    public LoginPage loginPage() {
        return new LoginPage();
    }

    public AccountSettings accountSettings() {
        return new AccountSettings();
    }

    public ItemPage itemPage() {
        return new ItemPage();
    }
}
