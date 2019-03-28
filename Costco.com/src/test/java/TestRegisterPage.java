import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestRegisterPage extends CommonAPI {

    String registerPageUrl = "https://www.costco.com/RegisterView?URL=&isPharmacy=false";
    RegisterPage registerPage;

    @BeforeClass
    public void initialize(){
        this.driver.navigate().to(this.registerPageUrl);
        this.registerPage = PageFactory.initElements(this.driver, RegisterPage.class);
    }

    //TEST 1
    @Test(priority = 1)
    public void testRegisterPageTitle() {
        this.driver.navigate().to(this.registerPageUrl);
        String registerPageTitle = driver.getTitle();
        Assert.assertEquals(registerPageTitle, "Register Account");
    }

    //TEST 2
    @Test (priority = 2)
    public void testEmailBar() throws Exception{
        this.driver.navigate().to(this.registerPageUrl);
        this.registerPage.enterEmail("testemail@email.com");
        this.registerPage.clickOnCreateAccount();
    }

    //TEST 3
    @Test(priority = 3)
    public void testPasswordBar() throws Exception{
        this.driver.navigate().to(this.registerPageUrl);
        this.registerPage.enterPassword("password");
        this.registerPage.clickOnCreateAccount();
    }

    //TEST 4
    @Test (priority = 4)
    public void enterEmailandPassword() throws Exception{
        this.driver.navigate().to(this.registerPageUrl);
        this.registerPage.enterEmail("testemail@email.com");
        this.registerPage.enterPassword("password1234");
        this.registerPage.enterConfirmPassword("password1234");
        this.registerPage.clickOnCreateAccount();
    }

    //TEST 5  ----- Test create account with all fields completed
    @Test (priority = 5)
    public void emailPasswordMemberId() throws Exception{
        this.driver.navigate().to(this.registerPageUrl);
        this.registerPage.enterEmail("testemail@email.com");
        this.registerPage.enterPassword("password1234");
        this.registerPage.enterConfirmPassword("password1234");
        this.registerPage.enterMembershipNumber("123456789");
        this.registerPage.clickOnCreateAccount();
    }

    //TEST 6
    @Test (priority = 6)
    public void testBuyMembershipTab() throws Exception{
        this.driver.navigate().to(this.registerPageUrl);
        this.registerPage.clickBuyMembership();
        String buyMembershipUrl = driver.getCurrentUrl();
        Assert.assertEquals(buyMembershipUrl, "https://www.costco.com/join-costco-quick.html?COSTID=Header_Membership_TOP");
    }

}