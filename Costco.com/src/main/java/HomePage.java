import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends CommonAPI {

    @FindBy (xpath = "//*[@id=\"navigation-dropdown\"]")
    private WebElement categoriesTab;

    @FindBy (xpath = "//*[@id=\"WC_CategoriesSidebarDisplayf_links_3_2\"]")
    private WebElement computerFromDropDown;

    @FindBy(id = "search-field")
    private WebElement searchBox;

    @FindBy (xpath = "//*[@id=\"navigation-widget\"]/div/nav/a[10]")
    private WebElement locationsTab;

    @FindBy (id = "customer-service-link")
    private WebElement CustomerService;

    @FindBy(xpath = "//*[@id=\"footer-list\"]/div/div[1]/ul/li[7]/a")
    private WebElement jobsTab;

    @FindBy (css = ".co-search-thin")
    private WebElement searchButton;

    @FindBy (id = "search-dropdown-select")
    private WebElement dropDown;

    @FindBy (xpath = "//*[@id=\'search-dropdown-select\']/option[2]")
    private WebElement dropDownGrocery;

    @FindBy (xpath = "//*[@id=\"header-widget\"]/div/div/div/div[1]/a/img")
    private WebElement costcoLogo;

    @FindBy (id = "Home_Ancillary_0")
    private WebElement groceryTab;

    @FindBy (id = "Home_Ancillary_1")
    private WebElement businessDelivery;

    @FindBy (id = "Home_Ancillary_2")
    private WebElement optical;

    @FindBy (id = "Home_Ancillary_3")
    private WebElement pharmacy;

    @FindBy (id = "Home_Ancillary_4")
    private WebElement services;

    @FindBy (xpath = "//*[@id=\"footer-widget\"]/div/div[1]/div/div[4]/ul/li[1]/a/i")
    private WebElement costcoFbook;

    @FindBy (xpath = "//*[@id=\"footer-widget\"]/div/div[1]/div/div[4]/ul/li[2]/a/i")
    private WebElement costcoPintrest;

    public void clickCategoriesTab() throws Exception{
        this.categoriesTab.click();
        Thread.sleep(8000);
    }

    public void clickComputerFromDropDown()throws Exception{
        this.computerFromDropDown.click();
        Thread.sleep(5000);
    }

    public void inputInSearchBox(String text){
        this.searchBox.sendKeys(text);
    }

    public void clickLocationsTab()throws Exception{
        this.locationsTab.click();
        Thread.sleep(3000);
    }

    public void clickOnCustomerService() throws Exception{
        this.CustomerService.click();
        Thread.sleep(5000);
    }

    public void clickSearchButton() throws Exception{
        this.searchButton.click();
        Thread.sleep(3000);
    }

    public void clickDropDown() throws Exception{
        this.dropDown.click();
        Thread.sleep(3000);
    }

    public void clickGrocery() throws Exception{
        this.dropDownGrocery.click();
        Thread.sleep(3000);
    }

    public void testHomepageTitle(){
        String homepageTitle = driver.getTitle();
        Assert.assertEquals(homepageTitle, "Welcome to Costco Wholesale");
    }

    public void clickCategoriesTest() throws Exception{
        this.clickCategoriesTab();
        this.clickComputerFromDropDown();
        String ComputerUrl = driver.getCurrentUrl();
        Assert.assertEquals(ComputerUrl, "https://www.costco.com/computers.html");
    }

    public void verifyCostcoLogo(){
        costcoLogo.isDisplayed();
        Assert.assertTrue(true);
    }

    public void groceryTabClick() throws Exception{
        groceryTab.click();
        Thread.sleep(3000);
        String groceryUrl = driver.getCurrentUrl();
        Assert.assertEquals(groceryUrl, "https://www.costco.com/grocery-household.html");
    }

    public void opticalClick(){
        optical.isDisplayed();
        Assert.assertTrue(true);
    }

    public void pharmacyLink() throws Exception{
        pharmacy.isDisplayed();
        Assert.assertTrue(true);
    }

    public void businessDeliveryLink(){
        businessDelivery.isDisplayed();
        Assert.assertTrue(true);
    }

    public void servicesLink() throws Exception{
        services.click();
        Thread.sleep(2000);
        String servicesUrl = driver.getCurrentUrl();
        Assert.assertEquals(servicesUrl, "https://www.costco.com/services.html");
    }

    public void costcoFbookVerify(){
        costcoFbook.isDisplayed();
        Assert.assertTrue(true);
    }

    public void costcoPinterestVerify(){
        costcoPintrest.isDisplayed();
        Assert.assertTrue(true);
    }
}