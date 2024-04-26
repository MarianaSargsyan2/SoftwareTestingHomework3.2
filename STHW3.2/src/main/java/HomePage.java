import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.NoSuchElementException;

public class HomePage extends BasePage {

    public HomePage() {
        super();
    }

    WebElement bagIcon = driver.findElement(By.id("ic-cart"));
    WebElement signInButton = driver.findElement(By.id("loginAjio"));
    WebElement menCategoryLink = driver.findElement(By.linkText("men"));
    WebElement searchBar = driver.findElement(By.name("searchVal"));


    public boolean isBagIconVisible() {
        try {
            return bagIcon.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void clickBagIcon() {
        bagIcon.click();
    }

    public boolean isSignInButtonDisplayed() {
        try {
            return signInButton.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isSearchBarVisible() {
        try {
            return searchBar.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }


    public boolean isMenCategoryDisplayed() {
        try {
            return menCategoryLink.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void clickMenCategory() {
        menCategoryLink.click();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
