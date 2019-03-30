
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestLoginPage extends CommonAPI {

    String signInPageUrl = "https://amazon.com/ap/signin?ie=UTF8&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.mode=checkid_setup&_encoding=UTF8&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&switch_account=signin&ignoreAuthState=1&disableLoginPrepopulate=1&ref_=ap_sw_aa";
    LoginPage signInPage;


    // Navigate to the sign in page url
    @BeforeClass
    public void initialize() {
        this.driver.navigate().to(this.signInPageUrl);
        this.signInPage = PageFactory.initElements(this.driver, LoginPage.class);
        this.driver.navigate().to(this.signInPageUrl);
    }


    // 1. Tests if user can login without a password
    @Test
    public void NoPasswordLogin() {
        this.driver.navigate().to(this.signInPageUrl);
        this.signInPage.enterEmail("amirhafiz08@gmail.com");
        this.signInPage.enterPwd("");
        this.signInPage.SignIn();
    }

    // 2. Tests if user can login without any credentials
    @Test
    public void NoCredentialLogin() {
        this.driver.navigate().to(this.signInPageUrl);
        this.signInPage.enterEmail("");
        this.signInPage.enterPwd("");
        this.signInPage.SignIn();
    }

    // 3. Tests if user can login without any email
    @Test
    public void NoEmailLogin() {
        this.driver.navigate().to(this.signInPageUrl);
        this.signInPage.enterEmail("");
        this.signInPage.enterPwd("Password");
        this.signInPage.SignIn();
    }

    // 4. Tests if create account button navigates to correct page
    @Test
    public void NavigateCreateAccount() {
        this.driver.navigate().to(this.signInPageUrl);
        this.signInPage.CreateAccount();
        String CAtitle = driver.getTitle();
        Assert.assertEquals(CAtitle, "Amazon Registration");
    }

    @Test
    public void NoPasswordLogin2() {
        this.driver.navigate().to(this.signInPageUrl);
        this.signInPage.enterEmail("amirhafiz08@gmail.com");
        this.signInPage.enterPwd("");
        this.signInPage.SignIn();
    }

    //5. Tests successful login
    @Test
    public void SuccessfulLogin() {
        this.driver.navigate().to(this.signInPageUrl);
        this.signInPage.enterEmail("amirhafiz08@gmail.com");
        this.signInPage.enterPwd("Youcantseeme1");
        this.signInPage.SignIn();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    }

    @AfterClass
    public void cleanUp() {
        this.driver.quit();
    }

}