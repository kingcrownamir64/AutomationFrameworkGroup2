import base.CommonAPI;
import com.google.common.base.Verify;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.security.PublicKey;

public class TestBoALocationsPage extends CommonAPI {

    String BoALocationsPageUrl = "https://locators.bankofamerica.com/";
    BoALocationsPage boALocationsPage;

    @BeforeMethod
    public void initialize(){
        this.driver.navigate().to(this.BoALocationsPageUrl);
        this.boALocationsPage = PageFactory.initElements(this.driver, BoALocationsPage.class);
    }
    //TEST 1
    @Test (priority = 1)
    public void testLocationsUrl(){
        this.boALocationsPage.boALocationsUrl();
    }
    //TEST 2
    @Test (priority = 2)
    public void testLocationsTitle(){
        this.boALocationsPage.boALocationsTitle();
    }
    //TEST 3
    @Test (priority = 3)
    public void testBankAtmLogo(){
        this.boALocationsPage.verifyBankAtmLogo();
    }
    //TEST 4
    @Test (priority = 4)
    public void testLocationsPlaceHolder(){
        this.boALocationsPage.verifyLocationsSearch();
    }
    //TEST 5
    @Test (priority = 5)
    public void testFilterSearch(){
        this.boALocationsPage.verifyFilterSearch();
    }
    //TEST 6
    @Test (priority = 6)
    public void testFilterMessage() throws Exception{
        this.boALocationsPage.clickFilter();
    }
    //TEST 7
    @Test (priority = 7)
    public void testFilterClicks() throws Exception{
        this.boALocationsPage.checkFilters();
    }
    //TEST 8
    @Test (priority = 8)
    public void testClearFilter() throws Exception{
        this.boALocationsPage.clearAllFilters();
    }
    //TEST 9
    @Test (priority = 9)
    public void testDoneFilter() throws Exception{
        this.boALocationsPage.doneAllFilters();
    }
    //TEST 10
    @Test (priority = 10)
    public void testSearchBtnHolder(){
        this.boALocationsPage.searchButtonHolder();
    }
    //TEST 11
    @Test (priority = 11)
    public void testSearchInput() throws Exception{
        this.boALocationsPage.searchInput("11103");
    }
    //TEST 12
    @Test (priority = 12)
    public void testMapZoomIn() throws Exception{
        this.boALocationsPage.clickMapZoomIn();
    }
    //TEST 13
    @Test (priority = 13)
    public void testMapZoomOut() throws Exception{
        this.boALocationsPage.clickMapZoomOut();
    }
    //TEST 14
    @Test (priority = 14)
    public void testMapFullScreen() throws Exception{
        this.boALocationsPage.clickMapFullScreen();
    }
    //TEST 15
    @Test (priority = 15)
    public void testMapExitFullScreen() throws Exception{
        this.boALocationsPage.clickMapExitFullScreen();
    }
    //TEST 16
    @Test (priority = 16)
    public void testClickNY() throws Exception{
        this.boALocationsPage.clickNY();
    }
    //TEST 17
    @Test (priority = 17)
    public void testAstoriaLink() throws Exception{
        this.boALocationsPage.goToAstoria();
    }
    //TEST 18
    @Test (priority = 18)
    public void testInternationLink() throws Exception{
        this.boALocationsPage.internationalAtms();
    }
}
