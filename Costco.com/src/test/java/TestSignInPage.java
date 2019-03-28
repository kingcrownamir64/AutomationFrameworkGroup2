import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSignInPage extends CommonAPI {

    String SignInPageUrl = "https://www.costco.com/LogonForm";
    SignInPage signInPage;

    @BeforeClass
    public void initialize(){
        this.driver.navigate().to(this.SignInPageUrl);
        this.signInPage = PageFactory.initElements(this.driver, SignInPage.class);
    }
    //TEST 1
    @Test(priority = 1)
    public void testSignInTitle() {
        this.driver.navigate().to(this.SignInPageUrl);
        String homepageTitle = driver.getTitle();
        Assert.assertEquals(homepageTitle, "Sign In");
    }
    //TEST 2 -- Without any credentials
    @Test(priority = 2)
    public void testSignInButton() throws Exception{
        this.driver.navigate().to(this.SignInPageUrl);
        this.signInPage.clickSignInButton();
    }
    //TEST 3
    @Test(priority = 3)
    public void enterEmail() throws Exception{
        this.driver.navigate().to(this.SignInPageUrl);
        this.signInPage.typeInEmailAddress("email@email.com");
        this.signInPage.clickSignInButton();
    }
    //TEST 4
    @Test(priority = 4)
    public void enterPassword() throws Exception {
        this.driver.navigate().to(this.SignInPageUrl);
        this.signInPage.typePassword("password");
        this.signInPage.clickSignInButton();
    }
    //TEST 5
    @Test(priority = 5)
    public void TestForgetPassword()throws Exception{
        this.driver.navigate().to(this.SignInPageUrl);
        this.signInPage.clickForgetPassword();
        String forgotPasswordTitle = driver.getTitle();
        Assert.assertEquals(forgotPasswordTitle, "Forgot Your Password?");
    }
}