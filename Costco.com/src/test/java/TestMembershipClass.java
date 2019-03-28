import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestMembershipClass extends CommonAPI {

    String MembershipPageUrl = "https://www.costco.com/join-costco-quick.html";
    MembershipPage membershipPage;

    @BeforeClass
    public void initialize() {
        this.driver.navigate().to(this.MembershipPageUrl);
        this.membershipPage = PageFactory.initElements(this.driver, MembershipPage.class);
    }
    //TEST 1
    @Test(priority = 1)
    public void membershipPageTitle(){
        this.driver.navigate().to(this.MembershipPageUrl);
        String memberShipTitle = driver.getTitle();
        Assert.assertEquals(memberShipTitle, "Join Costco | Costco");
    }
    //TEST 2
    @Test (priority = 2)
    public void TestWhyBecomeMember() throws Exception{
        this.driver.navigate().to(this.MembershipPageUrl);
        this.membershipPage.clickWhyBecomeMember();
        String WhyBecomeMemberUrl = driver.getCurrentUrl();
        Assert.assertEquals(WhyBecomeMemberUrl, "https://www.costco.com/membership-information.html");
    }
    //TEST 3
    @Test (priority = 3)
    public void WhyBecomeMemberTitle() throws Exception{
        this.driver.navigate().to(this.MembershipPageUrl);
        this.membershipPage.clickWhyBecomeMember();
        String BecomeMemberTitle = driver.getTitle();
        Assert.assertEquals(BecomeMemberTitle, "Why Become A Member | Costco");
    }
    //TEST 4
    @Test (priority = 4)
    public void TestTermsAndConditions()throws Exception{
        this.driver.navigate().to(this.MembershipPageUrl);
        this.membershipPage.clickTermsAndConditions();
        String TandCUrl = driver.getCurrentUrl();
        Assert.assertEquals(TandCUrl, "https://www.costco.com/executive-rewards.html");
    }

    //TEST 5
//    @Test (priority = 5)
//    public void TestBusinessExecutive()throws Exception{
//        this.driver.navigate().to(this.MembershipPageUrl);
//        this.membershipPage.clickBusinessExecutive();
//        String BusinessExecutiveTitle = driver.getTitle();
//        Assert.assertEquals(BusinessExecutiveTitle, "Membership Application");
//    }
    //TEST 6
//    @Test (priority = 6)
//    public void BusinessExecutiveAndCancel()throws Exception{
//        this.driver.navigate().to(this.MembershipPageUrl);
//        this.membershipPage.clickBusinessExecutive();
//        String BusinessExecutiveTitle = driver.getTitle();
//        Assert.assertEquals(BusinessExecutiveTitle, "Membership Application");
//        this.membershipPage.clickCancel();
//        Assert.assertEquals(BusinessExecutiveTitle, "Membership Application");
//    }

    //TEST 7
//    @Test (priority = 7)
//    public void RemoveFromCart()throws Exception {
//        this.driver.navigate().to(this.MembershipPageUrl);
//        this.membershipPage.clickBusinessExecutive();
//        String BusinessExecutiveTitle = driver.getTitle();
//        Assert.assertEquals(BusinessExecutiveTitle, "Membership Application");
//        this.membershipPage.clickCartButton();
//        this.membershipPage.clickRemoveButton();
//        this.membershipPage.dismissAlert();
//    }
}