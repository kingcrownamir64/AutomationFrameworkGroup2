import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.sql.SQLOutput;
import java.util.List;

public class BoALocationsPage extends CommonAPI {

    @FindBy (xpath = "//*[@id=\"pageHeader\"]/div[1]/a")
    private WebElement bankAtmLogo;

    @FindBy (id = "rioSearchInput")
    private WebElement locationsSearch;

    @FindBy (id = "rioSearchFilterLabel")
    private WebElement filterSearch;

    @FindBy (xpath = "//*[@id=\"rioSearchFilterList\"]/h3[1]")
    private WebElement filterMessage;

    @FindBy (xpath = "//*[@id=\"rioSearchFilterList\"]/ul[1]")
     private  List<WebElement> filterSearchClick;

    @FindBy (id = "rioFilterClearLink")
    private WebElement clearFilter;

    @FindBy (id = "rioFilterDoneButton")
    private WebElement doneBtn;

    @FindBy (id = "rioSearchButton")
    private WebElement locationsSearchBtn;

    @FindBy (xpath = "//*[@id=\"gmap\"]/div/div/div[8]/div[1]/div/button[1]")
    private WebElement mapZoomIn;

    @FindBy (xpath = "//*[@id=\"gmap\"]/div/div/div[8]/div[1]/div/button[2]")
    private WebElement mapZoomOut;

    @FindBy (xpath = "//*[@id=\"gmap\"]/div/div/button")
    private WebElement mapFullScreenAndExit;

    @FindBy (xpath = "//*[@id=\"maplist\"]/ul[9]/li[5]/a")
    private WebElement newYorkLink;

    @FindBy (id = "maplistTitle")
    private WebElement mapListTitle;

    @FindBy (xpath = "//*[@id=\"maplist\"]/ul[1]/li[5]/a")
    private WebElement astoriaLink;

    @FindBy (xpath = "//*[@id=\"rioSearchFilter\"]/a[3]")
    private WebElement internationalAtmsLink;

    public void boALocationsUrl(){
        String locationsUrl = driver.getCurrentUrl();
        Assert.assertEquals(locationsUrl, "https://locators.bankofamerica.com/");
    }

    public void boALocationsTitle(){
        String locationsTitle = driver.getTitle();
        Assert.assertEquals(locationsTitle, "Bank of America Financial Centers and ATMs");
    }

    public void verifyBankAtmLogo(){
        bankAtmLogo.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyLocationsSearch(){
        locationsSearch.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyFilterSearch(){
        String filter = filterSearch.getText();
        System.out.println(filter);
        Assert.assertEquals(filter, "Find locations with...");
    }

    public void clickFilter()throws Exception{
        filterSearch.click();
        Thread.sleep(2000);
        String message = filterMessage.getText();
        Assert.assertEquals(message, "Financial center services");
    }

    public void checkFilters() throws Exception {
        filterSearch.click();
        for (WebElement element : filterSearchClick) {
            Thread.sleep(3000);
            element.click();
            Thread.sleep(3000);
        }
    }
    public void clearAllFilters() throws Exception {
        filterSearch.click();
        for (WebElement element : filterSearchClick) {
            Thread.sleep(3000);
            element.click();
            Thread.sleep(3000);
        }
        clearFilter.click();
        Thread.sleep(2000);
        String clearFilterHolder = clearFilter.getText();
        Assert.assertEquals(clearFilterHolder, "Clear filters");
    }

    public void doneAllFilters() throws Exception {
        filterSearch.click();
        for (WebElement element : filterSearchClick) {
            Thread.sleep(5000);
            element.click();
            Thread.sleep(5000);
        }
        String doneHolder = doneBtn.getText();
        Assert.assertEquals(doneHolder, "Done");
        doneBtn.click();
    }

    public void searchButtonHolder(){
        locationsSearchBtn.isDisplayed();
        Assert.assertTrue(true);
    }

    public void searchInput(String text) throws Exception{
        locationsSearch.sendKeys(text);
        Thread.sleep(2000);
        Assert.assertEquals(text, "11103");
    }

    public void clickMapZoomIn() throws Exception{
        mapZoomIn.click();
        Thread.sleep(2000);
        mapZoomIn.isDisplayed();
        Assert.assertTrue(true);
    }
    public void clickMapZoomOut() throws Exception{
        mapZoomOut.click();
        Thread.sleep(2000);
        mapZoomOut.isDisplayed();
        Assert.assertTrue(true);
    }
    public void clickMapFullScreen() throws Exception{
        mapFullScreenAndExit.isDisplayed();
        Assert.assertTrue(true);
        mapFullScreenAndExit.click();
        Thread.sleep(2000);
    }
    public void clickMapExitFullScreen() throws Exception{
        mapFullScreenAndExit.click();
        Thread.sleep(2000);
        mapFullScreenAndExit.isDisplayed();
        Assert.assertTrue(true);
        mapFullScreenAndExit.click();
    }

    public void clickNY() throws Exception{
        newYorkLink.click();
        Thread.sleep(3000);
        String mapListTitles = mapListTitle.getText();
        Assert.assertEquals(mapListTitles, "Financial centers and ATMs in New York");
    }

    public void goToAstoria() throws Exception{
        newYorkLink.click();
        Thread.sleep(2000);
        astoriaLink.click();
        Thread.sleep(1000);
        String astoriaUrl = driver.getCurrentUrl();
        Assert.assertEquals(astoriaUrl,"https://locators.bankofamerica.com/ny/astoria/");
    }

    public void internationalAtms() throws Exception{
        filterSearch.click();
        Thread.sleep(2000);
        internationalAtmsLink.click();
        String internationalUrl = driver.getCurrentUrl();
        Assert.assertEquals(internationalUrl, "https://locators.bankofamerica.com/international.html&check_list=4397");
    }
}
