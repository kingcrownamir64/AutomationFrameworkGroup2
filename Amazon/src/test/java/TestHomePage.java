import base.CommonAPI;
import datasource.MySqlData;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.DataReader;

import java.io.IOException;
import java.util.List;

public class TestHomePage extends CommonAPI {
    MySqlData mySqlData;


    String homepageUrl = "https://www.amazon.com/ref=ap_frn_logo";
    HomePage homePage;
    //  Will navigate to the url before running all tests

    DataReader excelData = new DataReader();
    String path ="/Users/amir/Desktop/AutomationFrameworkGroup2/Amazon/src/test/resources/ExcelFile.xls";

    @BeforeClass
    public void initialize() {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage = PageFactory.initElements(this.driver, HomePage.class);
        mySqlData = new MySqlData();
        driver.manage().window().maximize();
    }

    //  Tests if website is navigated to the homepage
    @Test
    public void testUserCanNavigateToHomePage() {
        this.driver.navigate().to(this.homepageUrl);
        String homepageTitle = driver.getTitle();
        Assert.assertEquals(homepageTitle, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    }

    //  Tests if user can use search bar
    @Test
    public void testSearchBar() {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage.searchBoxHome("Type C Charger");
    }

    //  Tests if search button works
    @Test
    public void TestSearchButton() {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage.searchBoxHome("Type C Charger");
        this.homePage.SearchButtonHome();
    }

    //  Check if cart button works & navigates to correct page
    @Test
    public void TestCartButton() {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage.setCartButton();
        String cartTitle = driver.getTitle();
        Assert.assertEquals(cartTitle, "Amazon.com Shopping Cart");
    }

    //  Check if Your Amazon button works & navigates to correct page
    @Test
    public void TestYourAmazonButton() {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage.setYourAmazonButton();
        String YourAmazonTitle = driver.getTitle();
        Assert.assertEquals(YourAmazonTitle, "Amazon Sign In");
    }


    @Test
    public void selectsteps() throws Exception {
        String[] testSteps = excelData.fileReader3(path, 0);
        for (String str : testSteps) {
            switch (str) {
                case "search":
                    testSearchBar();
                    break;
                case "navigate":
                    TestCartButton();
                    break;
                default:
                    throw new InvalidArgumentException("Invalid choice");
            }
            System.out.println(str);
        }


    }    @Test(description = "mysql test")
    public void testSearchItemsSql() {
        List<String> list = null;
        try {
            list = mySqlData.getItemsListFromDB();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (String s : list) {
            homePage.searchForItems(s);
        }
    }


    @Test
    public void r() {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage.setCartButton();
        String cartTitle = driver.getTitle();
        Assert.assertEquals(cartTitle, "Amazon.com Shopping Cart");
    }

    @Test
    public void TestCartBuctton() {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage.setCartButton();
        String cartTitle = driver.getTitle();
        Assert.assertEquals(cartTitle, "Amazon.com Shopping Cart");
    }

    @Test
    public void TestTodaysDealsButton() throws InterruptedException {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage.setTodaysDealsButton();
        Thread.sleep(3000);
        String TDBTitle = driver.getTitle();
        Assert.assertEquals(TDBTitle, "Gold Box Deals | Today's Deals - Amazon.com");
        System.out.println(TDBTitle);
    }

    @Test
    public void TesGiftCardButton() throws InterruptedException {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage.setGiftCardsButton();
        Thread.sleep(3000);
        String GiftCardTitle = driver.getTitle();
        Assert.assertEquals(GiftCardTitle, "Amazon.com Gift Cards");
        System.out.println(GiftCardTitle);
    }

    @Test
    public void TestSellButton() throws InterruptedException {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage.setSellButton();
        Thread.sleep(3000);
        String SellTitle = driver.getTitle();
        Assert.assertEquals(SellTitle, "Amazon.com: Sell Products Online with Selling on Amazon");
        System.out.println(SellTitle);
    }

    @Test
    public void TestRegistryButton() throws InterruptedException {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage.setRegistryButton();
        Thread.sleep(3000);
        String RegistryTitle = driver.getTitle();
        Assert.assertEquals(RegistryTitle, "Amazon.com: : Registry");
        System.out.println(RegistryTitle);
    }

    @Test
    public void TestHelpButton() throws InterruptedException {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage.setHelpButton();
        Thread.sleep(3000);
        String HelpTitle = driver.getTitle();
        Assert.assertEquals(HelpTitle, "Amazon.com Help");
        System.out.println(HelpTitle);
    }

    @Test
    public void TestWholeFoodButton() throws InterruptedException {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage.setWholeFoodsButton();
        Thread.sleep(3000);
        String WholeFoodTitle = driver.getTitle();
        Assert.assertEquals(WholeFoodTitle, "Whole Foods Market @ Amazon.com");
        System.out.println(WholeFoodTitle);
    }
}















