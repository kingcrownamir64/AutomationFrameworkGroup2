import base.CommonAPI;
import com.google.common.base.Verify;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestBoAAppointmentPage extends CommonAPI{

    String BoAAppointmentPageUrl = "https://secure.bankofamerica.com/secure-mycommunications/public/appointments/?marketingCode=NEWHP_ECHMPG";
    BoAAppointmentPage boAAppointmentPage;

    @BeforeMethod
    public void initialize(){
        this.driver.navigate().to(this.BoAAppointmentPageUrl);
        this.boAAppointmentPage = PageFactory.initElements(this.driver, BoAAppointmentPage.class);
    }

    //TEST 1
    @Test (priority = 1)
    public void testAppointmentTitle(){
        this.boAAppointmentPage.appointmenTitle();
    }
    //TEST 2
    @Test (priority = 2)
    public void testAppointmentHead(){
        this.boAAppointmentPage.verifyAppointmentHead();
    }
    //TEST 3
    @Test (priority = 3)
    public void testEverydayBanking(){
        this.boAAppointmentPage.verifyEverydayBanking();
    }
    //TEST 4
    @Test (priority = 4)
    public void testMerrill(){
        this.boAAppointmentPage.verifyInvestmentsWithMerrill();
    }
    //TEST 5
    @Test (priority = 5)
    public void testHomeLoans(){
        this.boAAppointmentPage.verifyHomeLoans();
    }
    //TEST 6
    @Test (priority = 6)
    public void testBusinessAdvantage(){
        this.boAAppointmentPage.verifyBusinessAdvantage();
    }
    //TEST 7
    @Test (priority = 7)
    public void testSignInBtn(){
        this.boAAppointmentPage.verifySignInBtn();
    }
    //TEST 8
    @Test(priority = 8)
    public void testVerifyBookAppt(){
        this.boAAppointmentPage.verifyBookAppt();
    }
    //TEST 9
    @Test (priority = 9)
    public void testVerifyLearnMore(){
        this.boAAppointmentPage.verifyLearnMore();
    }
    //TEST 10
    @Test (priority = 10)
    public void testBenefitSent(){
        this.boAAppointmentPage.verifyBenefitsSent();
    }
}
