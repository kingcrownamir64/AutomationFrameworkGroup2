import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.sql.SQLOutput;

public class BoAHome extends CommonAPI{

    @FindBy (id = "onlineId1")
    private WebElement onlineId;

    @FindBy (xpath = "//*[@id=\"passcode1\"]")
    private WebElement passcode;

    @FindBy (id = "signIn")
    private WebElement signInButton;

    @FindBy (id = "signin-message")
    private WebElement signInMessage;

    @FindBy (xpath = "//*[@id=\"onlineId1\"]")
    private WebElement onlineIdPlaceHolder;

    @FindBy (xpath = "//*[@id=\"headerModule\"]/div[3]/div[1]/img")
    private WebElement boALogo;

    @FindBy (xpath = "//*[@id=\"navChecking\"]/span[2]")
    private WebElement checkingTab;

    @FindBy (xpath = "//*[@id=\"navSavings\"]/span[2]")
    private WebElement savingsTab;

    @FindBy (xpath = "//*[@id=\"navCreditCards\"]/span[2]")
    private WebElement creditCards;

    @FindBy (xpath = "//*[@id=\"navHomeLoans\"]/span[2]")
    private WebElement homeLoans;

    @FindBy (xpath = "//*[@id=\"navAutoLoans\"]/span[2]")
    private WebElement autoLoans;

    @FindBy (xpath = "//*[@id=\"navInvesting\"]/span[2]")
    private WebElement investing;

    @FindBy (xpath = "//*[@id=\"navBetterMoneyHabits\"]/span[2]")
    private WebElement betterMoneyHabits;

    @FindBy (id = "cashRewardsCards")
    private WebElement cashRewards;

    @FindBy (id = "travelRewardsCards")
    private WebElement travelsRewardsCards;

    @FindBy (id = "lowerInterestRateCards")
    private WebElement lowerInterestRateCard;

    @FindBy (id = "pointsRewardsCards")
    private WebElement pointsRewardsCards;

    @FindBy (id = "buildCreditCards")
    private WebElement buildCreditCards;

    @FindBy (xpath = "//*[@id=\"searchStub\"]/div/div/form/div[1]")
    private WebElement searchBar;

    @FindBy (xpath = "//*[@id=\"nav-search-query\"]")
    private WebElement searchBarPlaceHolder;

    @FindBy (xpath = "//*[@id=\"searchStub\"]/div/div/form/div[2]/p")
    private WebElement suggestions;

    @FindBy (id = "NAV_BUSINESS_ADVANTAGE")
    private WebElement smallBusiness;

    @FindBy (id = "NAV_WEALTH_MANAGEMENT")
    private WebElement wealthManagement;

    @FindBy (id = "NAV_BUSINESS_INSTITUTIONS")
    private WebElement businessInstitutions;

    @FindBy (id = "NAV_ABOUT_US")
    private WebElement aboutUs;

    @FindBy (id = "saveOnlineId")
    private WebElement saveCheckBox;

    @FindBy (id = "NAV_EN_ES")
    private WebElement espanolLink;

    @FindBy (id = "NAV_CONTACT_US")
    private WebElement contactUs;

    @FindBy (id = "NAV_HELP")
    private WebElement help;

    public void boAHomeTitle(){
        String homepageTitle = driver.getTitle();
        Assert.assertEquals(homepageTitle, "Bank of America - Banking, Credit Cards, Home Loans and Auto Loans");
    }

    public void typeOnlineId(String text){
        this.onlineId.sendKeys(text);
        Assert.assertTrue(true);
    }

    public void typePasscode(String text){
        this.passcode.sendKeys(text);
        Assert.assertTrue(true);
    }

    public void testSignInMessageNoPasscode(String text){
        this.onlineId.sendKeys(text);
        this.signInButton.click();
        String message = signInMessage.getText();
        Assert.assertEquals(message, "Your Passcode is missing. Please try again.");
    }

    public void testSignInMessageNoOnlineId(String text){
        this.passcode.sendKeys(text);
        this.signInButton.click();
        String message = signInMessage.getText();
        Assert.assertEquals(message, "Your Online ID is missing. Please try again.");
    }

    public void onlineIdPlaceHolder(){
        onlineIdPlaceHolder.isDisplayed();
        Assert.assertTrue(true);
    }

    public void invalidCredentials(String text){
        this.onlineId.sendKeys(text);
        this.passcode.sendKeys(text);
        this.signInButton.click();
        String InvalidUrl = driver.getCurrentUrl();
        Assert.assertEquals(InvalidUrl, "https://secure.bankofamerica.com/login/sign-in/signOnRedirect.go");
    }

    public void boALogoCheck(){
        boALogo.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyCheckingTab(){
        String message = checkingTab.getText();
        Assert.assertEquals(message, "Checking");
    }

    public void verifySavingsTab(){
        String message = savingsTab.getText();
        Assert.assertEquals(message, "Savings");
    }

    public void verifyCCTab(){
        String message = creditCards.getText();
        Assert.assertEquals(message, "Credit Cards");
    }

    public void verifyHomeLoansTab(){
        String message = homeLoans.getText();
        Assert.assertEquals(message, "Home Loans");
    }

    public void verifyAutoLoansTab(){
        String message = autoLoans.getText();
        Assert.assertEquals(message, "Auto Loans");
    }

    public void verifyInvestingTab(){
        String message = investing.getText();
        Assert.assertEquals(message, "Investing");
    }
    public void verifyBetterMoneyTab(){
        String message = betterMoneyHabits.getText();
            Assert.assertEquals(message, "Better Money Habits®");
    }

    public void cashBackDropDown()throws Exception{
        Thread.sleep(3000);
        creditCards.click();
        Thread.sleep(5000);
        cashRewards.click();
        Thread.sleep(5000);
        String cashBackUrl = driver.getCurrentUrl();
        Assert.assertEquals(cashBackUrl, "https://www.bankofamerica.com/credit-cards/cash-back-credit-cards/");
    }

    public void testSignInButtonTest(){
       String signIn = signInButton.getText();
       Assert.assertEquals(signIn, "Sign In");
    }

    public void travelAirlineDropDown()throws Exception{
        Thread.sleep(3000);
        creditCards.click();
        Thread.sleep(3000);
        travelsRewardsCards.click();
        Thread.sleep(3000);
        String travelsUrl = driver.getCurrentUrl();
        Assert.assertEquals(travelsUrl, "https://www.bankofamerica.com/credit-cards/travel-credit-cards/");
    }

    public void lowerInterestDropDown()throws Exception {
        Thread.sleep(3000);
        creditCards.click();
        Thread.sleep(3000);
        lowerInterestRateCard.click();
        Thread.sleep(3000);
        String lowerInterest = driver.getCurrentUrl();
        Assert.assertEquals(lowerInterest, "https://www.bankofamerica.com/credit-cards/low-interest-credit-cards/");
    }

    public void pointsRewardsDropDown()throws Exception {
        Thread.sleep(3000);
        creditCards.click();
        Thread.sleep(3000);
        pointsRewardsCards.click();
        Thread.sleep(3000);
        String pointsRewards = driver.getCurrentUrl();
        Assert.assertEquals(pointsRewards, "https://www.bankofamerica.com/credit-cards/point-rewards-credit-cards/");
    }

    public void buildCreditCardsDropDown()throws Exception {
        Thread.sleep(3000);
        creditCards.click();
        Thread.sleep(3000);
        buildCreditCards.click();
        Thread.sleep(3000);
        String buildCreditCardsUrl = driver.getCurrentUrl();
        Assert.assertEquals(buildCreditCardsUrl, "https://www.bankofamerica.com/credit-cards/credit-cards-to-build-credit/");
    }

    public void clickSearchBar()throws Exception{
        searchBar.click();
        Thread.sleep(4000);
        String suggestionsSearch = suggestions.getText();
        Assert.assertEquals(suggestionsSearch, "Suggested searches");
    }

    public void searchPlaceHolder(){
        searchBarPlaceHolder.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickSmallBusiness()throws Exception{
        smallBusiness.click();
        Thread.sleep(3000);
        String smallBusinessUrl = driver.getCurrentUrl();
        Assert.assertEquals(smallBusinessUrl, "https://www.bankofamerica.com/smallbusiness/");
    }

    public void smallBusinessTitle() throws Exception{
        smallBusiness.click();
        Thread.sleep(3000);
        String smallBusinessTitle = driver.getTitle();
        Assert.assertEquals(smallBusinessTitle, "Small Business Banking Accounts and Services from Bank of America");
    }

    public void wealthManagement() throws Exception{
        wealthManagement.click();
        Thread.sleep(3000);
        String wealthManagementUrl = driver.getCurrentUrl();
        Assert.assertEquals(wealthManagementUrl, "https://www.ml.com/wealthmanagement.html");
    }

    public void wealthManagementTitle() throws Exception{
        wealthManagement.click();
        Thread.sleep(3000);
        String wealthMgmtTitle = driver.getTitle();
        Assert.assertEquals(wealthMgmtTitle,"Wealth Management");
    }

    public void businessInstitutionsUrl() throws Exception{
        businessInstitutions.click();
        Thread.sleep(3000);
        String businessInstitutionUrl = driver.getCurrentUrl();
        Assert.assertEquals(businessInstitutionUrl, "https://www.bofaml.com/content/boaml/en_us/home.html");
    }

    public void businessInstitutionsTitle() throws Exception{
        businessInstitutions.click();
        Thread.sleep(3000);
        String businessInstitutionTitle = driver.getTitle();
        Assert.assertEquals(businessInstitutionTitle, "Bank of America Merrill Lynch - Business Solutions");
    }

    public void aboutUsTitle() throws Exception{
        aboutUs.click();
        Thread.sleep(4000);
        String aboutUsTitle = driver.getTitle();
        Assert.assertEquals(aboutUsTitle, "About Bank of America - Service, Commitment & Philanthropy");
    }

    public void saveCredentials(String text) {
        onlineId.sendKeys(text);
        passcode.sendKeys(text);
        saveCheckBox.click();
    }

    public void espanolLinkVerify(){
        espanolLink.click();
        String espanolUrl = driver.getCurrentUrl();
        Assert.assertEquals(espanolUrl, "https://www.bankofamerica.com/es/");
    }

    public void espanolTitleVerify(){
        espanolLink.click();
        String espanolTitle = driver.getTitle();
        Assert.assertEquals(espanolTitle, "Bank of America: operaciones bancarias, tarjetas de crédito, hipotecas y préstamos para automóviles");
    }

    public void verifyContactUs(){
        contactUs.click();
        String contactUsUrl = driver.getCurrentUrl();
        Assert.assertEquals(contactUsUrl, "https://www.bankofamerica.com/customer-service/contact-us/?request_locale=en_US");
    }

    public void contactUsTitle(){
        contactUs.click();
        String contactUsTitle = driver.getTitle();
        Assert.assertEquals(contactUsTitle, "Bank of America Customer Service & Contact Numbers");
    }
}