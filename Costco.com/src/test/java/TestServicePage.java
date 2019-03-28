import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestServicePage extends CommonAPI {

    String servicePageUrl = "https://www.costco.com/services.html";
    ServicePage servicePage;

    @BeforeClass
    public void initialize(){
        this.driver.navigate().to(this.servicePageUrl);
        this.servicePage = PageFactory.initElements(this.driver, ServicePage.class);
    }

    //TEST 1
    @Test (priority = 1)
    public void testServicePageTitle(){
        this.driver.navigate().to(this.servicePageUrl);
        String servicePageTitle = driver.getTitle();
        Assert.assertEquals(servicePageTitle, "Costco Services for Members | Costco");
    }
    //TEST 2
    @Test (priority = 2)
    public void testHomeTab() throws Exception{
        this.driver.navigate().to(this.servicePageUrl);
        this.servicePage.ClickHomeTab();
        String homeTabUrl = driver.getCurrentUrl();
        Assert.assertEquals(homeTabUrl, "https://www.costco.com/services.html#home");
    }
    //TEST 3
    @Test (priority = 3)
    public void testBusinessTab() throws Exception{
        this.driver.navigate().to(this.servicePageUrl);
        this.servicePage.clickBusinessTab();
        String businessUrl = driver.getCurrentUrl();
        Assert.assertEquals(businessUrl, "https://www.costco.com/services.html#business");
    }
    //TEST 4
    @Test (priority = 4)
    public void testLifeTab() throws Exception{
        this.driver.navigate().to(this.servicePageUrl);
        this.servicePage.clickLifeTab();
        String lifeUrl = driver.getCurrentUrl();
        Assert.assertEquals(lifeUrl, "https://www.costco.com/services.html#life");
    }
    //TEST 5
    @Test (priority = 5)
    public void testAutoHomeInsurance() throws Exception{
        this.driver.navigate().to(this.servicePageUrl);
        this.servicePage.clickAutoHomeInsurance();
    }
    //TEST 6
    @Test (priority = 6)
    public void testCancelBtn() throws Exception {
        this.driver.navigate().to(this.servicePageUrl);
        this.servicePage.clickAutoHomeInsurance();
        this.servicePage.clickCancelbtn();
    }
    //TEST 7
    @Test (priority = 7)
    public void testVideoTab() throws Exception {
        this.driver.navigate().to(this.servicePageUrl);
        this.servicePage.clickVideoLink();
        this.servicePage.clickXBtn();
    }
    //TEST 8
    @Test (priority = 8)
    public void testExternalLinkBtn() throws Exception {
        this.driver.navigate().to(this.servicePageUrl);
        this.servicePage.clickAutoHomeInsurance();
        this.servicePage.clickViewExternalLink();
    }
}