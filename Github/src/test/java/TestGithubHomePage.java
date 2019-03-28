import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestGithubHomePage extends CommonAPI {

    GithubHomePage homepage;

    @BeforeClass
    public void initialize() throws Exception {
        this.homepage = PageFactory.initElements(this.driver, GithubHomePage.class);
        this.homepage.navigateToGitHub();
        Thread.sleep(3000);
    }

    @Test
    public void TestGithubTitle() throws Exception {
        this.homepage.GithubTitle();
    }

    @Test
    public void TestDropDownWhyButton() throws Exception {
        this.homepage.SetDropDownWhyButton();
    }

    @Test
    public void TestSetSignUpUsernameBox() throws Exception {
        this.homepage.SetSignUpUsernameBox();
    }

    @Test
    public void TestSetSignUpEmailBox() throws Exception {
        this.homepage.SetSignUpEmailBox();
    }

    @Test
    public void TestSetSignUpPasswordBox() throws Exception {
        this.homepage.SetSignUpPasswordBox();
    }

    @Test
    public void TestSignUpButton() throws Exception {
        this.homepage.SetSignUpButton();
    }

    @Test
    public void TestSearchBox() throws Exception {
        this.homepage.SetSearchBox();
    }

    @Test
    public void TestSearchBoxButton() throws Exception {
        this.homepage.SetSearchBoxButton();
    }

    @Test
    public void TestFeatureButton() throws Exception {
        this.homepage.SetFeatureButton();
    }

    @Test
    public void TestSecurityButton() throws Exception {
        this.homepage.SetSecurityButton();
    }

    @Test
    public void TestEnterprise2Button() throws Exception {
        this.homepage.SetEnterprise2Button();
    }

    @Test
    public void TestCustomerStoriesButton() throws Exception {
        this.homepage.SetECustomerStoriesButton();
    }

    @Test
    public void TestPricingButton() throws Exception {
        this.homepage.SetPricingButton();
    }

    @Test
    public void TestResourceButton() throws Exception {
        this.homepage.SetResourcesutton();
    }

    @Test
    public void TestDeveloperAPIButton() throws Exception {
        this.homepage.SetDeveloperAPIButton();
    }

    @Test
    public void TestPartnersButton() throws Exception {
        this.homepage.SetPartnersButton();
    }

    @Test
    public void TestAtomButton() throws Exception {
        this.homepage.SetAtomButton();
    }

    @Test
    public void TestElectronButton() throws Exception {
        this.homepage.SetElectronButton();
    }

    @Test
    public void TestEnterpriseButton() throws Exception {
        this.homepage.SetEnterpriseButton();
    }

    @Test
    public void TestMarketplaceButton() throws Exception {
        this.homepage.SetMarketplaceButton();
    }

    @Test
    public void TestHelpButton() throws Exception {
        this.homepage.SetHelpButton();
    }
    @Test
    public void TestCommunityForumButton() throws Exception {
        this.homepage.SetCommunityForumButton();
    }
    @Test
    public void TestTrainingButton() throws Exception {
        this.homepage.SetTrainingButton();
    }
    @Test
    public void TestStatusButton() throws Exception {
        this.homepage.SetStatusButton();
    }
    @Test
    public void TestContactGithubButton() throws Exception {
        this.homepage.SetContactGithubButton();
    }

    @Test
    public void TestAboutButton() throws Exception {
        this.homepage.SetAboutButton();
    }

    @Test
    public void TestBlogButton() throws Exception {
        this.homepage.SetBlogButton();
    }

    @Test
    public void TestCareersButton() throws Exception {
        this.homepage.SetCareersButton();
    }

    @Test
    public void TestPressButton() throws Exception {
        this.homepage.SetPressButton();
    }

    @Test
    public void TestShopButton() throws Exception {
        this.homepage.SetShopButton();
    }

    @Test
    public void TestUsernameText() throws Exception {
        this.homepage.SetUsernameText();
    }

    @Test
    public void TestUsernameEmail() throws Exception {
        this.homepage.SetEmailText();
    }

    @Test
    public void TestUsernamePassword() throws Exception {
        this.homepage.SetPasswordText();
    }

    @Test
    public void TestRobotLogoExists() throws Exception {
        this.homepage.SetRobotLogo();
    }

    @Test
    public void TestContactSalesButton() throws Exception {
        this.homepage.SetContactSalesButton();
    }

    @Test
    public void TestOrStartAFreeTrialOfEnterpriseServerButton() throws Exception {
        this.homepage.SetOrStartAFreeTrialOfEnterpriseServerButton();
    }

    @Test
    public void TestSignUpYourTeamButton() throws Exception {
        this.homepage.SetSignUpYourTeamButton();
    }

    @Test
    public void TestComparePlansButton() throws Exception {
        this.homepage.SetComparePlansButton();
    }

    @Test
    public void TestContactSalesForInfoButton() throws Exception {
        this.homepage.SetContactSalesForInfoButton();
    }
}


