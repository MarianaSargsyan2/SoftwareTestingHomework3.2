import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.NoSuchElementException;

public class BagPage extends BasePage{

    public BagPage() {
        super();
    }

    private WebElement proceedToShippingButton = driver.findElement(By.className("rilrtl-button button shipping-button"));
    private WebElement coupon = driver.findElement(By.className("voucher-wrapper"));


    public void clickProceedToShippingButton() {
        proceedToShippingButton.click();
    }

}
