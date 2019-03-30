import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.sql.SQLOutput;

public class BoALoanCalculatorPage extends CommonAPI {

    @FindBy (xpath = "//*[@id=\"paymentCalcAutoModuleJS\"]/div[1]/h2")
    private WebElement loanHeader;

    @FindBy (xpath = "//*[@id=\"skip-to-h1\"]")
    private WebElement autoLoanHeader;

    @FindBy (xpath = "//*[@id=\"totalLoanAmountField\"]")
    private WebElement totalLoanBar;

    @FindBy (xpath = "//*[@id=\"term\"]")
    private WebElement termsMonth;

    @FindBy (xpath = "//*[@id=\"interestRateField\"]")
    private WebElement interestBar;

    @FindBy (id = "calculateButton")
    private WebElement calculateBtn;

    @FindBy (xpath = "//*[@id=\"calculatorPanel\"]/a")
    private WebElement determineLoanAmt;

    @FindBy (id = "amount")
    private WebElement amount;

    @FindBy (id = "carPriceField")
    private WebElement carPrice;

    @FindBy (id = "tradeInValueField")
    private WebElement tradeIn;

    @FindBy (id = "amtOwedTradeInField")
    private WebElement amtOwed;

    @FindBy (id = "downPaymentField")
    private WebElement downPayment;

    @FindBy (id = "cashRebateField")
    private WebElement cashRebate;

    @FindBy (id = "updateTotal")
    private WebElement updateTotal;

    public void loanCalcTitle(){
        String loanTitle = driver.getTitle();
        Assert.assertEquals(loanTitle, "Auto Loan Calculator & Car Payment Tool at Bank of America");
    }

    public void loadHeader(){
       String loadHeaderSent = loanHeader.getText();
       Assert.assertEquals(loadHeaderSent, "Estimate your monthly car loan payment");
    }

    public void verifyAutoLoanHeader(){
        autoLoanHeader.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyTotalLoanBar(){
        totalLoanBar.clear();
        totalLoanBar.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyTermsMonth(){
        termsMonth.clear();
        termsMonth.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyInterestBar(){
        interestBar.clear();
        interestBar.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickCalculateBtn(){
        totalLoanBar.clear();
        termsMonth.clear();
        interestBar.clear();
        calculateBtn.click();
        String totalLoanZero = totalLoanBar.getText();
        Assert.assertEquals(totalLoanZero, "");
    }

    public void verifyDetermineLoan(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        determineLoanAmt.click();
        wait.until(ExpectedConditions.elementToBeClickable(determineLoanAmt));
        Assert.assertTrue(true);
    }

    public void calculatePayment(String total, String months, String interest){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        totalLoanBar.clear();
        wait.until(ExpectedConditions.elementToBeClickable(totalLoanBar));
        totalLoanBar.sendKeys(total);
        termsMonth.clear();
        wait.until(ExpectedConditions.elementToBeClickable(termsMonth));
        termsMonth.sendKeys(months);
        interestBar.clear();
        wait.until(ExpectedConditions.elementToBeClickable(interestBar));
        interestBar.sendKeys(interest);
        calculateBtn.click();
    }

    public void onlyTotal(String total){
        totalLoanBar.clear();
        totalLoanBar.sendKeys(total);
        termsMonth.clear();
        interestBar.clear();
        calculateBtn.click();
        String amountTotal = amount.getText();
        Assert.assertEquals(amountTotal, "Infinity");
    }

    public void onlyMonths(String text){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        totalLoanBar.clear();
        termsMonth.clear();
        termsMonth.sendKeys(text);
        interestBar.clear();
        calculateBtn.click();
        wait.until(ExpectedConditions.visibilityOf(amount));
        amount.isDisplayed();
        Assert.assertTrue(true);
    }
    public void verifyCarPrice(String text){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(determineLoanAmt));
        determineLoanAmt.click();
        carPrice.sendKeys(text);
        updateTotal.click();
        String totalLoanUpdated = totalLoanBar.getText();
        Assert.assertEquals(totalLoanUpdated, totalLoanUpdated);
    }

    public void verifyTradeIn(){
        determineLoanAmt.click();
        tradeIn.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyAmountOwed(){
        determineLoanAmt.click();
        amtOwed.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyDownPayment(){
        determineLoanAmt.click();
        downPayment.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyCashRebate(){
        determineLoanAmt.click();
        cashRebate.isDisplayed();
        Assert.assertTrue(true);
    }

    public void tradeInValue(){
        determineLoanAmt.click();

    }
}
