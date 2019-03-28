import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import utility.DataReader;

import java.io.IOException;

public class TestHomePage extends CommonAPI {

    String homepageUrl = "https://www.costco.com";
    HomePage homePage;

    DataReader excelData = new DataReader();
    String path = "/Users/amir/Desktop/BackupAutomationFramework/Costco.com/src/test/resources/ExcelFile.xls";

    @BeforeMethod
    public void initialize(){
        this.driver.navigate().to(this.homepageUrl);
        this.homePage = PageFactory.initElements(this.driver, HomePage.class);
    }
    //TEST 1
    @Test (priority = 1)
    public void testCostcoLogo(){
        this.homePage.verifyCostcoLogo();
    }
    //TEST 2
    @Test (priority = 2)
    public void testGroceryUrl() throws Exception{
        this.homePage.groceryTabClick();
    }
    //TEST 3
    @Test (priority = 3)
    public void testOpticalUrl() throws Exception{
        this.homePage.opticalClick();
    }
    //TEST 4
    @Test (priority = 4)
    public void testPharmacy() throws Exception{
        this.homePage.pharmacyLink();
    }
    //TEST 5
    @Test (priority = 5)
    public void testBusinessDelivery(){
        this.homePage.businessDeliveryLink();
    }
    //TEST 6
    @Test (priority = 6)
    public void testServicesUrl() throws Exception{
        this.homePage.servicesLink();
    }
    //TEST 7
    @Test (priority = 7)
    public void testCostcoFbook(){
        this.homePage.costcoFbookVerify();
    }
    //TEST 8
    @Test (priority = 8)
    public void testCostcoPinterest(){
        this.homePage.costcoPinterestVerify();
    }
    //TEST 9
    @Test(priority = 9)
    public void testHomepageTitle(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.testHomepageTitle();
    }
    //TEST 10
    @Test(priority = 10)
    public void clickCategoriesTest() throws Exception{
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.homePage.clickCategoriesTest();
    }
    //TEST 11
    @Test(priority = 11)
    public void search() throws Exception{
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        //this.driver.navigate().to(this.homepageUrl);
        this.homePage.inputInSearchBox("computers");
        this.homePage.clickSearchButton();
        String computerTitle = driver.getTitle();
        Assert.assertEquals(computerTitle, "Computers | Costco");
    }
    //TEST 12
    @Test(priority = 12)
    public void testCustomerService() throws Exception{
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        // this.driver.navigate().to(this.homepageUrl);
        this.homePage.clickOnCustomerService();
        String customerServiceTitle = driver.getTitle();
        Assert.assertEquals(customerServiceTitle, "Support Home Page");
    }
    //TEST 13
    @Test(priority = 13)
    public void searchMacbook() throws Exception{
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        //this.driver.navigate().to(this.homepageUrl);
        this.homePage.inputInSearchBox("macbook");
        this.homePage.clickSearchButton();
        String computerTitle = driver.getTitle();
        Assert.assertEquals(computerTitle, "macbook | Costco");
    }
    //TEST 14
    @Test(priority = 14)
    public void clickLocationsTab() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        // this.driver.navigate().to(this.homepageUrl);
        this.homePage.clickLocationsTab();
        String locationsUrl = driver.getCurrentUrl();
        Assert.assertEquals(locationsUrl, "https://www.costco.com/warehouse-locations?langId=-1&storeId=10301&catalogId=10701");
    }
    //TEST 15
    @Test (priority = 15)
    public void testDropDown()throws Exception{
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        //this.driver.navigate().to(this.homepageUrl);
        this.homePage.clickDropDown();
        this.homePage.clickGrocery();
    }
    //TEST 16
    @Test (priority = 16)
    public void searchInGrocery()throws Exception{
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.homePage.clickDropDown();
        this.homePage.clickGrocery();
        this.homePage.inputInSearchBox("cereal");
        this.homePage.clickSearchButton();
    }

    //KEYWORD DRIVEN
    //TEST 17
    @Test (priority = 17)
    public void selectsteps() throws Exception {
        String[] testSteps = excelData.fileReader3(path, 0);
        for (String str : testSteps) {
            switch (str) {
                case "search":
                    search();
                    break;
                case "navigate":
                    searchMacbook();
                    break;
                default:
                    throw new InvalidArgumentException("Invalid choice");
            }
            System.out.println(str);
        }
    }
}