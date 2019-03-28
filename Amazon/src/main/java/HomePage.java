import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {


    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(className = "nav-input")
    private WebElement searchButton;

    @FindBy(id = "nav-cart")
    private WebElement cartButton;

    @FindBy(id="nav-your-amazon")
    private WebElement YourAmazonButton;

    @FindBy(xpath="//*[@id='nav-link-accountList'']/span[2]")
    private WebElement LanguageBar;

    @FindBy (css = ".Your Account")
    private WebElement topLink;



    public void searchBoxHome(String text) {
        this.searchBox.sendKeys(text);
    }

    public void SearchButtonHome() {
        this.searchBox.click();
    }

    public void setCartButton() {
        this.cartButton.click();
    }

    public void setYourAmazonButton() {
        this.YourAmazonButton.click();
    }

    public void setLanguageBar() {
        this.LanguageBar.click();
    }

    public void mouseHovering() throws Exception {
        Actions actions = new Actions(driver);
        actions.moveToElement(LanguageBar).perform();
        Thread.sleep(2000);
        actions.moveToElement(topLink).perform();
        Thread.sleep(1500);
        actions.click().build().perform();
    }


}
