import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestLocationsPage extends CommonAPI {

    String LocationsPageUrl = "https://www.costco.com/warehouse-locations?langId=-1&storeId=10301&catalogId=10701";
    LocationsPage locationsPage;

    @BeforeClass
    public void initialize(){
        this.driver.navigate().to(this.LocationsPageUrl);
        this.locationsPage = PageFactory.initElements(this.driver, LocationsPage.class);
    }
    //TEST 1
    @Test
    public void TestLocationTitle(){
        this.driver.navigate().to(this.LocationsPageUrl);
        String locationTitle = driver.getTitle();
        Assert.assertEquals(locationTitle, "Find a Costco warehouse- Costco");
    }
    //TEST 2
    @Test
    public void searchZipCode() throws Exception{
        this.driver.navigate().to(this.LocationsPageUrl);
        this.locationsPage.searchLocationsZipCode("11101");
        this.locationsPage.clickLocationsSearchButton();
    }

}