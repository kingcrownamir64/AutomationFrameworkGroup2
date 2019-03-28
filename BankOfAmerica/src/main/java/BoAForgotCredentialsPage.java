import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.sql.SQLOutput;
import java.util.List;

public class BoAForgotCredentialsPage extends CommonAPI {

    @FindBy (xpath = "//*[@id=\"skip-to-h1\"]")
    private WebElement forgotLogo;

    @FindBy (xpath = "//*[@id=\"acctNumber\"]")
    private WebElement accntNumBox;

    @FindBy (xpath = "//*[@id=\"ssNumber\"]")
    private WebElement ssnBox;

    @FindBy (id = "verifyCustomerAccount")
    private WebElement continueBtn;

    @FindBy (xpath = "//*[@id=\"form-section\"]/div[2]/div/div/div/label")
    private WebElement missingSSN;

    @FindBy (id = "acctNumber_errorMessage")
    private WebElement missingAccntNum;

    @FindBy (xpath = "//*[@id=\"introText\"]")
    private WebElement recordNotFound;

    @FindBy (id ="acctNumber_errorMessage")
    private WebElement shortAcctNum;

    @FindBy (xpath = "//*[@id=\"ssNumber_errorMessage\"]")
    private WebElement shortSSN;

    @FindBy (id = "cancelCustomerAccount")
    private WebElement cancelBtn;

    public void forgotCredsTitle(){
        String forgotPageTitle = driver.getTitle();
        Assert.assertEquals(forgotPageTitle, "Bank of America | Online Banking | Forgot Online ID & Passcode");
    }

    public void verifyForgotLogo(){
        forgotLogo.isDisplayed();
        Assert.assertTrue(true);
    }

    public void accntNumBoxVerify(){
        accntNumBox.isDisplayed();
        Assert.assertTrue(true);
    }

    public void accntNumBoxInput(String text){
        accntNumBox.sendKeys(text);
        Assert.assertTrue(true, text);
    }

    public void accntNumBoxEnter(String text){
        accntNumBox.sendKeys(text);
        continueBtn.click();
        missingSSN.isDisplayed();
        Assert.assertTrue(true);
    }

    public void ssnBoxEnter(String text){
        ssnBox.sendKeys(text);
        continueBtn.click();
        missingAccntNum.isDisplayed();
        Assert.assertTrue(true);
    }

    public void enterAcctNumAndSSNNum(String acct, String ssn){
        accntNumBox.sendKeys(acct);
        ssnBox.sendKeys(ssn);
        continueBtn.click();
        recordNotFound.isDisplayed();
        Assert.assertTrue(true);
    }

    public void shortAcctNum(String text){
        accntNumBox.sendKeys(text);
        continueBtn.click();
        shortAcctNum.isDisplayed();
        Assert.assertTrue(true);
    }

    public void shortSSNTest(String ssn)throws Exception{
        ssnBox.sendKeys(ssn);
        continueBtn.click();
        shortSSN.isDisplayed();
        Thread.sleep(2000);
        Assert.assertTrue(true);
    }

    public void clickCancel(){
        cancelBtn.click();
        String afterCancelUrl = driver.getCurrentUrl();
        Assert.assertEquals(afterCancelUrl, "https://www.bankofamerica.com/");
    }
}
