import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

public class ProductViewPage extends BasePage{

    public ProductViewPage() {
        super();
    }

    WebElement addToBagButton = driver.findElement(By.className("btn-gold"));
    WebElement saveToWishlist = driver.findElement(By.className("pdp-wishlist-desktop-icon"));
    WebElement productPriceVisible = driver.findElement(By.className("prod-price-section"));
    WebElement productNameVisible = driver.findElement(By.className("prod-name"));

    public boolean isAddToBagButtonDisplayed() {
        try {
            return addToBagButton.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }


    public boolean isSaveToWishlistDisplayed() {
        try {
            return saveToWishlist.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void clickSaveToWishlistButton() {
        saveToWishlist.click();
    }

    public String getProductNameText() {
        return productNameVisible.getText().trim();
    }

    public String getProductPriceText() {
        return productPriceVisible.getText().trim();
    }

}
