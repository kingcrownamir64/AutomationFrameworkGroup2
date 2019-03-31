import base.CommonAPI;
import com.google.common.base.Verify;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestBoARefinancePage extends CommonAPI {

    String BoARefinanceUrl = "https://www.bankofamerica.com/auto-loans/auto-refinance-calculator/";
    BoARefinancePage boARefinancePage;

    @BeforeMethod
    public void initialize(){
        this.driver.navigate().to(this.BoARefinanceUrl);
        this.boARefinancePage = PageFactory.initElements(this.driver, BoARefinancePage.class);
    }

    //TEST 1
    @Test (priority = 1)
    public void testRefinanceTitle(){
        this.boARefinancePage.refinanceTitle();
    }
    //TEST 2
    @Test (priority = 2)
    public void testHeader(){
        this.boARefinancePage.verifyHeader();
    }
    //TEST 3
    @Test (priority = 3)
    public void testClickCompare(){
        this.boARefinancePage.clickCompare();
    }
    //TEST 4
    @Test (priority = 4)
    public void testOnlyLoanBalance(){
        this.boARefinancePage.onlyLoanBalance("10,000");
    }
    //TEST 5
    @Test (priority = 5)
    public void testGreaterMonthlyThanLoan(){
        this.boARefinancePage.greaterMonthlyThanLoan("10000", "10001");
    }
    //TEST 6
    @Test (priority = 6)
    public void testVerifyLoanBalance(){
        this.boARefinancePage.verifyLoanBalance();
    }
    //TEST 7
    @Test (priority = 7)
    public void testVerifyHelp(){
        this.boARefinancePage.verifyHelp();
    }
    //TEST 8
    @Test (priority = 8)
    public void testClickHelp(){
        this.boARefinancePage.clickHelp();
    }
    //TEST 9
    @Test (priority = 9)
    public void testVerifyMonthlyPayment(){
        this.boARefinancePage.verifyMonthlyPayment();
    }
    //TEST 10
    @Test (priority = 10)
    public void testVerifyComparingBox(){
        this.boARefinancePage.verifyComparingBox("10000", "1000");
    }
    //TEST 11
    @Test (priority = 11)
    public void testRefinanceOnly(){
        this.boARefinancePage.onlyRefinanceAmount("5000");
    }
    //TEST 12
    @Test (priority = 12)
    public void testFillOut(){
        this.boARefinancePage.fillOut("10,000", "350", "5", "10,000",
                "60", "0");
    }
}
