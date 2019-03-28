import base.CommonAPI;
import com.google.common.base.Verify;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.security.PublicKey;

public class TestBoAForgotCredentialsPage extends CommonAPI {

    String BoAForgotCredentialsUrl = "https://secure.bankofamerica.com/auth/forgot/reset-entry/";
    BoAForgotCredentialsPage boAForgotCredentialsPage;

    @BeforeMethod
    public void initialize(){
        this.driver.navigate().to(this.BoAForgotCredentialsUrl);
        this.boAForgotCredentialsPage = PageFactory.initElements(this.driver, BoAForgotCredentialsPage.class);
    }

    //TEST 1
    @Test (priority = 1)
    public void testTitle(){
        this.boAForgotCredentialsPage.forgotCredsTitle();
    }
    //TEST 2
    @Test (priority = 2)
    public void testForgotLogo(){
        this.boAForgotCredentialsPage.verifyForgotLogo();
    }
    //TEST 3
    @Test (priority = 3)
    public void testAccntNumBox(){
        this.boAForgotCredentialsPage.accntNumBoxVerify();
    }
    //TEST 4
    @Test (priority = 4)
    public void testAccntNumInput(){
        this.boAForgotCredentialsPage.accntNumBoxInput("123456");
    }
    //TEST 5
    @Test (priority = 5)
    public void testAccntNumEnter(){
        this.boAForgotCredentialsPage.accntNumBoxEnter("123456");
    }
    //TEST 6
    @Test (priority = 6)
    public void testSSNEnter(){
        this.boAForgotCredentialsPage.ssnBoxEnter("111111111");
    }
    //TEST 7
    @Test (priority = 7)
    public void testCredentials(){
        this.boAForgotCredentialsPage.enterAcctNumAndSSNNum("123456", "123456789");
    }
    //TEST 8
    @Test (priority = 8)
    public void testShortAcctNum(){
        this.boAForgotCredentialsPage.shortAcctNum("12345");
    }
    //TEST 9
    @Test(priority = 9)
    public void testShortSSN() throws Exception{
        this.boAForgotCredentialsPage.shortSSNTest("123");
    }
    //TEST 10
    @Test (priority = 10)
    public void testCancelBtn(){
        this.boAForgotCredentialsPage.clickCancel();
    }
}
