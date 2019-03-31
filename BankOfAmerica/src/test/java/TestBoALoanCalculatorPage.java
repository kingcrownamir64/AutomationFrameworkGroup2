import base.CommonAPI;
import com.google.common.base.Verify;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestBoALoanCalculatorPage extends CommonAPI {

    String BoALoanCalculatorUrl = "https://www.bankofamerica.com/auto-loans/auto-loan-calculator/";
    BoALoanCalculatorPage boALoanCalculatorPage;

    @BeforeMethod
    public void initialize(){
        this.driver.navigate().to(this.BoALoanCalculatorUrl);
        this.boALoanCalculatorPage = PageFactory.initElements(this.driver, BoALoanCalculatorPage.class);
    }

    //TEST 1
    @Test (priority = 1)
    public void testVerifyCarPrice(){
        this.boALoanCalculatorPage.verifyCarPrice("15000");
    }
    //TEST 2
    @Test (priority = 2)
    public void testLoanHeader(){
        this.boALoanCalculatorPage.loadHeader();
    }
    //TEST 3
    @Test (priority = 3)
    public void testAutoLoanHeader(){
        this.boALoanCalculatorPage.verifyAutoLoanHeader();
    }
    //TEST 4
    @Test (priority = 4)
    public void testTotalLoanBar(){
        this.boALoanCalculatorPage.verifyTotalLoanBar();
    }
    //TEST 5
    @Test(priority = 5)
    public void testTermsMonth(){
        this.boALoanCalculatorPage.verifyTermsMonth();
    }
    //TEST 6
    @Test (priority = 6)
    public void testInterestBar(){
        this.boALoanCalculatorPage.verifyInterestBar();
    }
    //TEST 7
    @Test (priority = 7)
    public void testCalculateBtn(){
        this.boALoanCalculatorPage.clickCalculateBtn();
    }
    //TEST 8
    @Test (priority = 8)
    public void testDetermineLoan(){
        this.boALoanCalculatorPage.verifyDetermineLoan();
    }
    //TEST 9
    @Test (priority = 9)
    public void testCalculatePayment(){
        this.boALoanCalculatorPage.calculatePayment("1000000", "60", "5");
    }
    //TEST 10
    @Test (priority = 10)
    public void testTotalOnly(){
        this.boALoanCalculatorPage.onlyTotal("1000");
    }
    //TEST 11
    @Test (priority = 11)
    public void testOnlyMonths(){
        this.boALoanCalculatorPage.onlyMonths("12");
    }
    //TEST 12
    @Test (priority = 12)
    public void testLoanTitle(){
        this.boALoanCalculatorPage.loanCalcTitle();
    }
    //TEST 13
    @Test (priority = 13)
    public void testVerifyTradeIn(){
        this.boALoanCalculatorPage.verifyTradeIn();
    }
    //TEST 14
    @Test (priority = 14)
    public void testVerifyAmtOwed(){
        this.boALoanCalculatorPage.verifyAmountOwed();
    }
    //TEST 15
    @Test (priority = 15)
    public void testVerifyDownPayment(){
        this.boALoanCalculatorPage.verifyDownPayment();
    }
    //TEST 16
    @Test (priority = 16)
    public void testVerifyCashRebate(){
        this.boALoanCalculatorPage.verifyCashRebate();
    }
    //TEST 17
    @Test (priority = 17)
    public void testCarPriceAndTradeIn(){
        this.boALoanCalculatorPage.carPriceAndTradeInTotal("15000");
    }
    //TEST 18
    @Test (priority = 18)
    public void testOnlyAmountOwed(){
        this.boALoanCalculatorPage.onlyAmountOwed("15000");
    }
    //TEST 19
    @Test(priority = 19)
    public void testDetermineLoanAmountFull(){
        this.boALoanCalculatorPage.determineLoanAmtFull("40000", "5000", "0",
                "2500", "500");
    }
    //TEST 20
    @Test(priority = 20)
    public void testVerifyHelp(){
        this.boALoanCalculatorPage.verifyHelp();
    }
    //TEST 21
    @Test(priority = 21)
    public void testClickHelp(){
        this.boALoanCalculatorPage.clickHelp();
    }
    //TEST 22
    @Test (priority = 22)
    public void testCalculatePaymentFull(){
        this.boALoanCalculatorPage.calculatePaymentFull("40000", "5000", "0",
                "2500", "500", "12", "0");
    }
    //TEST 23
    @Test (priority = 23)
    public void testClickEligibilityReqmt(){
        this.boALoanCalculatorPage.clickEligibilityReqmt();
    }
    //TEST 24
    @Test (priority = 24)
    public void testVerifyMenu(){
        this.boALoanCalculatorPage.verifyMenu();
    }
    //TEST 25
    @Test (priority = 25)
    public void testHeaderSignIn(){
        this.boALoanCalculatorPage.verifyHeaderSignIn();
    }
    //TEST 26
    @Test (priority = 26)
    public void testClickHeaderSignIn(){
        this.boALoanCalculatorPage.clickHeaderSignIn();
    }
    //TEST 27
    @Test(priority = 27)
    public void testVerifyLocationsLink(){
        this.boALoanCalculatorPage.verifyLocationsLink();
    }
    //TEST 28
    @Test (priority = 28)
    public void testLocationsTitle(){
        this.boALoanCalculatorPage.clickLocationsLink();
    }
}
