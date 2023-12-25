package shopproducts;

import org.testng.annotations.Test;
import school.bright.generic.TestBase;
import school.bright.pages.Pages;

public class ShopProductsTest extends TestBase {
    @Test(priority = 0, description = "Navigate to shop screen")
    public void navigateToShopScreen() throws InterruptedException {
        Pages.SetPin().navigateToShopScreen();
        Pages.SetPin().setNewPin();
    }

    @Test(priority = 1, description = "Shop successfully")
    public void shopSuccessfully() throws InterruptedException {
        Pages.SetPin().navigateToShopScreen();
        Pages.ShopSuccessful().shopSuccessfully();
    }

    @Test(priority = 2, description = "Insufficient balance")
    public void insufficientBalance() throws InterruptedException {
        Pages.SetPin().navigateToShopScreen();
        Pages.ShopSuccessful().insufficientBalance();
    }

    @Test(priority = 3, description = "Product sold out")
    public void productSoldOut() throws InterruptedException {
        Pages.SetPin().navigateToShopScreen();
        Pages.ShopSuccessful().productSoldOut();
    }
}
