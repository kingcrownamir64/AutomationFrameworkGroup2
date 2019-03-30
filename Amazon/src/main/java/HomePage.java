import base.CommonAPI;
import org.openqa.selenium.Keys;
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

    @FindBy (xpath = "//*[@id=\"nav-xshop\"]/a[2]")
    private WebElement TodaysDealsButton;

    @FindBy (xpath = "//*[@id=\"nav-xshop\"]/a[3]")
    private WebElement GiftCardsButton;

    @FindBy (xpath = "//*[@id=\"nav-xshop\"]/a[4]")
    private WebElement WholeFoodButton;

    @FindBy (xpath = "//*[@id=\"nav-xshop\"]/a[5]")
    private WebElement SellButton;

    @FindBy (xpath = "//*[@id=\"nav-xshop\"]/a[6]")
    private WebElement RegistryButton;

    @FindBy (xpath = "//*[@id=\"nav-xshop\"]/a[7]")
    private WebElement HelpButton;



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

    public void setTodaysDealsButton() {
        this.TodaysDealsButton.click();
    }

    public void setGiftCardsButton() {
        this.GiftCardsButton.click();
    }

    public void setWholeFoodsButton() {
        this.WholeFoodButton.click();
    }

    public void setSellButton() { this.SellButton.click(); }

    public void setRegistryButton() { this.RegistryButton.click(); }

    public void setHelpButton() { this.HelpButton.click(); }

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

    public void searchForItems(String item) {
        searchBox.clear();
        searchBox.sendKeys(item, Keys.ENTER);
    }



}

