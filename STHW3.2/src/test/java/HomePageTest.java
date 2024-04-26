import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class HomePageTest extends BaseTest {
    private HomePage homePage = new HomePage();

    @Test
    public void testBagIconVisibility() {
        Assert.assertTrue("Bag icon is visible on homepage.", homePage.isBagIconVisible());
    }

    @Test
    public void testBagIconClick() {
        homePage.clickBagIcon();
        Assert.assertEquals("Clicking bag icon leads to cart page.", homePage.getCurrentUrl(), "https://www.ajio.com/cart");
    }

    @Test
    public void testSignInButtonVisibility() {
        Assert.assertTrue("Sign in button is visible on homepage.", homePage.isSignInButtonDisplayed());
    }


    @Test
    public void testMenCategoryVisibility() {
        Assert.assertTrue("Men category is visible on homepage.", homePage.isMenCategoryDisplayed());
    }

    @Test
    public void testMenCategoryClick() {
        homePage.clickMenCategory();
        Assert.assertEquals("Clicking Men category did not lead to cart page.", homePage.getCurrentUrl(), "https://www.ajio.com/cart");
    }

    public void testSearchBarVisibility() {
        Assert.assertTrue("Search bar is visible", homePage.isSearchBarVisible());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}