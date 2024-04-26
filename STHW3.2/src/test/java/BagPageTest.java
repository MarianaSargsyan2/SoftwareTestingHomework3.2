import org.junit.Assert;
import org.junit.Test;

public class BagPageTest extends BaseTest{

    private BagPage bagPage = new BagPage();


    @Test
    public void testClickProceedToShippingButton() {
        bagPage.clickProceedToShippingButton();

        Assert.assertEquals("Clicking Proceed to Shipping leads to shipping page", driver.getCurrentUrl());
    }
}
