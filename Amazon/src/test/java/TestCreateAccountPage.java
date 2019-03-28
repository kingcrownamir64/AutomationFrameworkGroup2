import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCreateAccountPage extends CommonAPI {


    String createaccountpageURL = "https://www.amazon.com/ap/register?_encoding=UTF8&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_newcust";
    CreateAccountPage CreateaccountPage;

    //  Will navigate to the url before running all tests

    @BeforeClass
    public void initialize() {
        this.driver.navigate().to(this.createaccountpageURL);
        this.CreateaccountPage = PageFactory.initElements(this.driver, CreateAccountPage.class);
    }

    //  Tests if website is navigated to the create account page
    @Test
    public void testUserCanNavigateToCreateAccountPage() {
        this.driver.navigate().to(this.createaccountpageURL);
        String CreateAccountPageTitle = driver.getTitle();
        Assert.assertEquals(CreateAccountPageTitle, "Amazon Registration");
    }

    //  Tests if user can create account with ONLY name
    @Test
    public void EnterYourNameOnly() throws InterruptedException {
        this.driver.navigate().to(this.createaccountpageURL);
        this.CreateaccountPage.EnterYourName("Mr. Mafi Bhai");
        this.CreateaccountPage.CreateAccountButton();
        Thread.sleep(2000);
    }

    //  Tests if user can create account with ONLY email
    @Test
    public void EnterYourEmailOnly() throws InterruptedException {
        this.driver.navigate().to(this.createaccountpageURL);
        this.CreateaccountPage.EnterEmail("MrMafiBhai@selenium.com");
        this.CreateaccountPage.CreateAccountButton();
        Thread.sleep(2000);
    }

    //  Tests if user can create account with email and name but no password
    @Test
    public void EnterYourNameAndEmail() throws InterruptedException {
        this.driver.navigate().to(this.createaccountpageURL);
        this.CreateaccountPage.EnterYourName("Mr. Mafi Bhai");
        this.CreateaccountPage.EnterEmail("MrMafiBhai@selenium.com");
        this.CreateaccountPage.CreateAccountButton();
        Thread.sleep(2000);
    }

    //  Tests if user can create account with email, password, and name but incorrect re-enter password
    @Test
    public void EnterYourNameEmailPassword() throws InterruptedException {
        this.driver.navigate().to(this.createaccountpageURL);
        this.CreateaccountPage.EnterYourName("Mr. Mafi Bhai");
        this.CreateaccountPage.EnterEmail("MrMafiBhai@selenium.com");
        this.CreateaccountPage.EnterPassword("Password1234!");
        this.CreateaccountPage.ReEnterPassword("Password1233!");
        this.CreateaccountPage.CreateAccountButton();
        Thread.sleep(2000);
    }

    //  Tests if user can create account with email, password, and name but no re-enter password
    @Test
    public void SuccessfulLogin() throws InterruptedException {
        this.driver.navigate().to(this.createaccountpageURL);
        this.CreateaccountPage.EnterYourName("Mr. Mafi Bhai");
        this.CreateaccountPage.EnterEmail("MrMafiBhai@selenium.com");
        this.CreateaccountPage.EnterPassword("Password1234!");
        this.CreateaccountPage.ReEnterPassword("Password1234!");
        this.CreateaccountPage.CreateAccountButton();
        Thread.sleep(2000);
    }

    @AfterClass
    public void cleanUp() {
        this.driver.quit();
    }
}