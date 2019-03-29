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
    public void testLoanTitle(){
        this.boALoanCalculatorPage.loanCalcTitle();
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
}
