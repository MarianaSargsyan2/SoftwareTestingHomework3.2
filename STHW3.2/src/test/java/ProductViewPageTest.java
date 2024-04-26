
import org.junit.Assert;
import org.junit.Test;

public class ProductViewPageTest extends BaseTest{
    private ProductViewPage productViewPage = new ProductViewPage();


    @Test
    public void testAddToBagButtonVisibility() {
        Assert.assertTrue("Add to bag button is displayed on product page.", productViewPage.isAddToBagButtonDisplayed());
    }

    @Test
    public void testSaveToWishlistButtonVisibility() {
        ProductViewPage productViewPage = new ProductViewPage();
        Assert.assertTrue("Save to wishlist button is displayed on product page.", productViewPage.isSaveToWishlistDisplayed());
    }

    @Test
    public void testSaveToWishlistButtonClick() {
        ProductViewPage productViewPage = new ProductViewPage();
        productViewPage.clickSaveToWishlistButton();
        // Additional assertions might be needed based on website behavior (e.g., confirmation message, redirection)
    }

    @Test
    public void testGetProductName() {
        ProductViewPage productViewPage = new ProductViewPage();
        String expectedProductName = "Men Knitted Loose Fit Shirt with Mandarin Collar";
        String actualProductName = productViewPage.getProductNameText();
        Assert.assertEquals("Product name is correct", expectedProductName, actualProductName);
    }

    @Test
    public void testGetProductPrice() {
        ProductViewPage productViewPage = new ProductViewPage();
        String expectedProductPrice = "₹480";
        String actualProductPrice = productViewPage.getProductPriceText();
        Assert.assertTrue("Product price is correct", actualProductPrice.contains(expectedProductPrice));
    }

}
