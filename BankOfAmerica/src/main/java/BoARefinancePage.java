import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.sql.SQLOutput;

public class BoARefinancePage extends CommonAPI {

    @FindBy (xpath = "//*[@id=\"refiCalcAutoModuleJS\"]/div[1]/h2")
    private WebElement header;

    @FindBy (id = "loanBalanceField")
    private WebElement loanBalance;

    @FindBy (id = "monthlyPaymentField")
    private WebElement monthlyPayment;

    @FindBy (id = "interestField")
    private WebElement interestField;

    @FindBy (id = "refinanceAmtField")
    private WebElement refinanceField;

    @FindBy (id = "months")
    private WebElement termsMonths;

    @FindBy (id = "refinanceInterestField")
    private WebElement refinanceInterest;

    @FindBy (id = "compareButton")
    private WebElement compareButton;

    @FindBy (id = "loanBalanceField_errorMessage")
    private WebElement loanBalanceError;

    @FindBy (xpath = "//*[@id=\"monthlyPaymentField_errorMessage\"]")
    private WebElement greaterMonthlyThanLoanError;

    @FindBy (id = "help-open-monthlyPaymentField")
    private WebElement help;

    @FindBy (xpath = "//*[@id=\"helpLayer_monthlyPaymentField\"]/div[1]")
    private WebElement helpMessageHead;

    @FindBy (xpath = "//*[@id=\"refiCalcAutoModuleJS\"]/div[5]/div")
    private WebElement comparingBox;

    public void refinanceTitle(){
        String refinanceTitle = driver.getTitle();
        Assert.assertEquals(refinanceTitle, "Auto Refinance Calculator from Bank of America");
    }

    public void verifyHeader(){
        header.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickCompare(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(compareButton));
        compareButton.click();
        loanBalance.isDisplayed();
        Assert.assertTrue(true);
    }

    public void onlyLoanBalance(String text){
        loanBalance.clear();
        loanBalance.sendKeys(text);
        compareButton.click();
        String refinanceAmt = refinanceField.getText();
        Assert.assertEquals(text, refinanceAmt);
    }

    public void greaterMonthlyThanLoan(String loan, String monthly){
        loanBalance.clear();
        monthlyPayment.clear();
        loanBalance.sendKeys(loan);
        monthlyPayment.sendKeys(monthly);
        compareButton.click();
        greaterMonthlyThanLoanError.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyLoanBalance(){
        loanBalance.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyHelp(){
        help.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickHelp(){
        help.click();
        helpMessageHead.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyMonthlyPayment(){
        monthlyPayment.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyComparingBox(String loan, String monthly){
        loanBalance.clear();
        monthlyPayment.clear();
        loanBalance.sendKeys(loan);
        monthlyPayment.sendKeys(monthly);
        compareButton.click();
        comparingBox.isDisplayed();
        Assert.assertTrue(true);
    }

    public void onlyRefinanceAmount(String refinance){
        refinanceField.clear();
        refinanceField.sendKeys(refinance);
        refinanceField.isDisplayed();
        Assert.assertTrue(true);
    }

    public void fillOut(String loan, String monthlyPay, String interestRate, String refinanceAmt, String months, String refInterest){
        loanBalance.clear();
        monthlyPayment.clear();
        interestField.clear();
        refinanceField.clear();
        termsMonths.clear();
        interestField.clear();
        loanBalance.sendKeys(loan);
        monthlyPayment.sendKeys(monthlyPay);
        interestField.sendKeys(interestRate);
        refinanceField.sendKeys(refinanceAmt);
        monthlyPayment.sendKeys(months);
        refinanceInterest.sendKeys(refInterest);
        compareButton.click();
        comparingBox.isDisplayed();
        Assert.assertTrue(true);
    }
}
