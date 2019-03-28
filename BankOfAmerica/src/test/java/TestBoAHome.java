import base.CommonAPI;
import com.google.common.base.Verify;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestBoAHome extends CommonAPI {

    String BoAHomePageUrl = "https://www.bankofamerica.com/";
    BoAHome boAHome;

    @BeforeMethod
    public void initialize(){
        this.driver.navigate().to(this.BoAHomePageUrl);
        this.boAHome = PageFactory.initElements(this.driver, BoAHome.class);
    }
    //TEST 1
    @Test (priority = 1)
    public void testBoAHomeTitle(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.boAHome.boAHomeTitle();
    }
    //TEST 2
    @Test (priority = 2)
    public void testOnlineId(){
        this.boAHome.typeOnlineId("ThisIsOnlineId");
    }
    //TEST 3
    @Test (priority = 3)
    public void testPasscode(){
        this.boAHome.typePasscode("passcode");
    }
    //TEST 4
    @Test (priority = 4)
    public void testSignInMessageNoPasscode(){
        this.boAHome.testSignInMessageNoPasscode("onlineId");
    }
    //TEST 5
    @Test (priority = 5)
    public void testSignInMessageNoOnlineId(){
        this.boAHome.testSignInMessageNoOnlineId("passcode");
    }
    //TEST 6
    @Test (priority = 6)
    public void testOnlineIDPlaceHolder(){
        this.boAHome.onlineIdPlaceHolder();
    }
    //TEST 7
    @Test (priority = 7)
    public void testBoALogo(){
        this.boAHome.boALogoCheck();
    }
    //TEST 8
    @Test (priority = 8)
    public void testCheckingTab(){
        this.boAHome.verifyCheckingTab();
    }
    //TEST 9
    @Test (priority = 9)
    public void testSavingsTab(){
        this.boAHome.verifySavingsTab();
    }
    //TEST 10
    @Test (priority = 10)
    public void testCreditCardsTab(){
        this.boAHome.verifyCCTab();
    }
    //TEST 11
    @Test (priority = 11)
    public void testHomeLoansTab(){
        this.boAHome.verifyHomeLoansTab();
    }
    //TEST 12
    @Test (priority = 12)
    public void testAutoLoansTab(){
        this.boAHome.verifyAutoLoansTab();
    }
    //TEST 13
    @Test (priority = 13)
    public void testInvestingTab(){
        this.boAHome.verifyInvestingTab();
    }
    //TEST 14
    @Test (priority = 14)
    public void testBetterMoneyTab(){
        this.boAHome.verifyBetterMoneyTab();
    }
    //TEST 15
    @Test (priority = 15)
    public void testCreditCardCashBack()throws Exception{
        this.boAHome.cashBackDropDown();
    }
    //TEST 16
    @Test (priority = 16)
    public void testSignInText(){
        this.boAHome.testSignInButtonTest();
    }
    //TEST 17
    @Test (priority = 17)
    public void testCreditCardTravels()throws Exception{
        this.boAHome.travelAirlineDropDown();
    }
    //TEST 18
    @Test (priority = 18)
    public void testCreditCardLowerInterest()throws Exception{
        this.boAHome.lowerInterestDropDown();
    }
    //TEST 19
    @Test (priority = 19)
    public void testCreditCardPointsRewards()throws Exception{
        this.boAHome.pointsRewardsDropDown();
    }
    //TEST 20
    @Test (priority = 20)
    public void testCreditCardBuildCreditCards()throws Exception{
        this.boAHome.buildCreditCardsDropDown();
    }
    //TEST 21
    @Test (priority = 21)
    public void testSearchSuggestion()throws Exception{
        this.boAHome.clickSearchBar();
    }
    //TEST 22
    @Test (priority = 22)
    public void testSearchPlaceHolder(){
        this.boAHome.searchPlaceHolder();
    }
    //TEST 23
    @Test (priority = 23)
    public void testSmallBusinessTab() throws Exception{
        this.boAHome.clickSmallBusiness();
    }
    //TEST 24
    @Test (priority = 24)
    public void testSmallBusinessTitle() throws Exception{
        this.boAHome.smallBusinessTitle();
    }
    //TEST 25
    @Test (priority = 25)
    public void testWealthManagementUrl() throws Exception{
        this.boAHome.wealthManagement();
    }
    //TEST 26
    @Test (priority = 26)
    public void testWealthMgmtTitle() throws Exception{
        this.boAHome.wealthManagementTitle();
    }
    //TEST 27
    @Test (priority = 27)
    public void testBusinessInstitutionUrl()throws Exception{
        this.boAHome.businessInstitutionsUrl();
    }
    //TEST 28
    @Test (priority = 28)
    public void testBusinessInstitutionTitle() throws Exception{
        this.boAHome.businessInstitutionsTitle();
    }
    //TEST 29
    @Test (priority = 29)
    public void testAboutUsUrl() throws Exception{
        this.boAHome.aboutUsTitle();
    }
    //TEST 30
    @Test (priority = 30)
    public void testSaveCredentials(){
        this.boAHome.saveCredentials("credentials");
    }
    //TEST 31
    @Test (priority = 31)
    public void testEspanolLink(){
        this.boAHome.espanolLinkVerify();
    }
    //TEST 32
    @Test (priority = 32)
    public void testEspanolTitle(){
        this.boAHome.espanolTitleVerify();
    }
    //TEST 33
    @Test (priority = 33)
    public void testContactUs(){
        this.boAHome.verifyContactUs();
    }
    //TEST 34
    @Test (priority = 34)
    public void testContactUsTitle(){
        this.boAHome.contactUsTitle();
    }
    //TEST 35 practice dummy
}