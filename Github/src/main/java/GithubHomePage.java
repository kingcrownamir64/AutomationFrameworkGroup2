import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.sql.SQLOutput;


public class GithubHomePage extends CommonAPI {

    String GithubUrl = "https://github.com";

    @FindBy(xpath = "/html/body/div[1]/header/div/div[2]/nav/ul/li[1]/details/summary")
    private WebElement DropDownWhyButton;

    @FindBy(id = "user[login]")
    private WebElement SignUpUsernameBox;

    @FindBy(id = "user[email]")
    private WebElement SignUpEmailBox;

    @FindBy(id = "user[password]")
    private WebElement SignUpPasswordBox;

    @FindBy(xpath = "/html/body/div[4]/main/div[1]/div/div/div[2]/div/form/button")
    private WebElement SignUpButton;

    @FindBy(xpath = "/html/body/div[1]/header/div/div[2]/div[2]/div/div/div/form/label/input[1]")
    private WebElement SearchBox;

    @FindBy(xpath = "//*[@id=\"jump-to-suggestion-search-global\"]/a/div[3]/span[2]")
    private WebElement SearchBoxButton;

    @FindBy(xpath = "/html/body/div[1]/header/div/div[2]/nav/ul/li[2]/a")
    private WebElement EnterpriseButton;

    @FindBy(xpath = "/html/body/div[1]/header/div/div[2]/nav/ul/li[4]/a")
    private WebElement MarketplaceButton;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div[2]/ul/li[1]/a")
    private WebElement FeaturesButton;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div[2]/ul/li[2]/a")
    private WebElement SecurityButton;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div[2]/ul/li[3]/a")
    private WebElement EnterpriseButton2Button;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div[2]/ul/li[4]/a")
    private WebElement CustomerStoriesButton;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div[2]/ul/li[5]/a")
    private WebElement PricingButton;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div[2]/ul/li[6]/a")
    private WebElement ResourcesButton;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div[3]/ul/li[1]/a")
    private WebElement DeveloperAPIButton;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div[3]/ul/li[2]/a")
    private WebElement PartnerButton;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div[3]/ul/li[3]/a")
    private WebElement AtomButton;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div[3]/ul/li[4]/a")
    private WebElement ElectronButton;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div[4]/ul/li[1]/a")
    private WebElement HelpButton;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div[4]/ul/li[2]/a")
    private WebElement CommunityForumButton;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div[4]/ul/li[3]/a")
    private WebElement TrainingButton;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div[4]/ul/li[4]/a")
    private WebElement StatusButton;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div[4]/ul/li[5]/a")
    private WebElement ContactGithubButton;


    @FindBy(xpath = "/html/body/footer/div[1]/div/div[5]/ul/li[1]/a")
    private WebElement AboutButton;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div[5]/ul/li[2]/a")
    private WebElement BlogButton;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div[5]/ul/li[3]/a")
    private WebElement CareersButton;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div[5]/ul/li[4]/a")
    private WebElement PressButton;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div[5]/ul/li[5]/a")
    private WebElement ShopButton;

    @FindBy(xpath = "//*[@id=\"user[login]\"]")
    private WebElement UsernameText;

    @FindBy(xpath = "/html/body/div[4]/main/div[4]/div[2]/div/div[1]/img")
    private WebElement RobotLogo;

    @FindBy(xpath = "/html/body/div[4]/main/div[2]/div/div/p[2]/a")
    private WebElement ContactSalesButton;

    @FindBy(xpath = "/html/body/div[4]/main/div[2]/div/div/p[3]/a")
    private WebElement OrStartAFreeTrialOfEnterpriseServerButton;

    @FindBy(xpath = "/html/body/div[4]/main/div[4]/div[1]/div/a")
    private WebElement SignUpYourTeamButton;

    @FindBy(xpath = "/html/body/div[4]/main/div[5]/div/div[2]/div[2]/a[1]")
    private WebElement ComparePlansButton;

    @FindBy(xpath = "/html/body/div[4]/main/div[5]/div/div[2]/div[2]/a[2]")
    private WebElement ContactSalesForInfoButton;



    public void navigateToGitHub() {
        this.driver.navigate().to(this.GithubUrl);
    }

    public void GithubTitle() {
        this.driver.navigate().to(this.GithubUrl);
        String homepageTitle = driver.getTitle();
        Assert.assertEquals(homepageTitle, "The world’s leading software development platform · GitHub");
        System.out.println(homepageTitle);
    }

    public void SetDropDownWhyButton() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.DropDownWhyButton.click();
        Thread.sleep(3000);
        String DropDownTitle = driver.getTitle();
        Assert.assertEquals(DropDownTitle, "The world’s leading software development platform · GitHub");
        String DropDownWhyButtonTag = this.DropDownWhyButton.getTagName();
        Assert.assertEquals(DropDownWhyButtonTag, "summary");    }

    public void SetSignUpUsernameBox() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.SignUpUsernameBox.sendKeys("TestingTesting1234");
        Thread.sleep(3000);
        String SignupUsernameBoxTag = this.SignUpUsernameBox.getTagName();
        Assert.assertEquals(SignupUsernameBoxTag, "input");
    }

    public void SetSignUpEmailBox() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.SignUpEmailBox.sendKeys("TestingEmail@Git.com");
        Thread.sleep(3000);
        String SignupEmailBoxTag = this.SignUpEmailBox.getTagName();
        Assert.assertEquals(SignupEmailBoxTag, "input");
    }

    public void SetSignUpPasswordBox() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.SignUpPasswordBox.sendKeys("TestingPassword");
        Thread.sleep(3000);
        String SearchBoxTag = this.SignUpPasswordBox.getTagName();
        Assert.assertEquals(SearchBoxTag, "input");
    }

    public void SetSignUpButton() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.SignUpUsernameBox.sendKeys("TestingTesting1234");
        this.SignUpEmailBox.sendKeys("TestingEmail@Git.com");
        this.SignUpPasswordBox.sendKeys("TestingPassword");
        this.SignUpButton.click();
        Thread.sleep(3000);
        String DropDownTitle = driver.getTitle();
        Assert.assertEquals(DropDownTitle, "Join GitHub · GitHub");
    }

    public void SetSearchBox() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.SearchBox.sendKeys("Kingcrownamir64");
        Thread.sleep(3000);
        String SearchBoxTag = this.SearchBox.getTagName();
        Assert.assertEquals(SearchBoxTag, "input");
    }


    public void SetSearchBoxButton() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.SearchBox.sendKeys("Kingcrownamir64");
        Thread.sleep(3000);
        this.SearchBoxButton.click();
        Thread.sleep(3000);
    }

    public void SetEnterpriseButton() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.EnterpriseButton.click();
        Thread.sleep(3000);
        String EnterprisePageeTitle = driver.getTitle();
        Assert.assertEquals(EnterprisePageeTitle, "Enterprise · A smarter way to work together · GitHub");
    }

    public void SetMarketplaceButton() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.MarketplaceButton.click();
        Thread.sleep(3000);
        String MarketplacePageeTitle = driver.getTitle();
        Assert.assertEquals(MarketplacePageeTitle, "Marketplace · Tools to improve your workflow · GitHub");
    }

    public void SetFeatureButton() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.FeaturesButton.click();
        Thread.sleep(3000);
        String FeatureTitle = driver.getTitle();
        Assert.assertEquals(FeatureTitle, "Features · The right tools for the job · GitHub");
        System.out.println(FeatureTitle);
    }

    public void SetSecurityButton() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.SecurityButton.click();
        Thread.sleep(3000);
        String SecurityTitle = driver.getTitle();
        Assert.assertEquals(SecurityTitle, "GitHub Security · GitHub");
        System.out.println(SecurityTitle);
    }

    public void SetEnterprise2Button() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.EnterpriseButton2Button.click();
        Thread.sleep(3000);
        String Enterprise2PageeTitle = driver.getTitle();
        Assert.assertEquals(Enterprise2PageeTitle, "Enterprise · A smarter way to work together · GitHub");
        System.out.println(Enterprise2PageeTitle);
    }

    public void SetECustomerStoriesButton() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.CustomerStoriesButton.click();
        Thread.sleep(3000);
        String CustomerStoriesTitle = driver.getTitle();
        Assert.assertEquals(CustomerStoriesTitle, "Customer stories · GitHub");
        System.out.println(CustomerStoriesTitle);
    }

    public void SetPricingButton() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.PricingButton.click();
        Thread.sleep(3000);
        String PricingTitle = driver.getTitle();
        Assert.assertEquals(PricingTitle, "Pricing · Plans for every developer · GitHub");
        System.out.println(PricingTitle);
    }

    public void SetResourcesutton() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.ResourcesButton.click();
        Thread.sleep(3000);
        String ResourceTitle = driver.getTitle();
        Assert.assertEquals(ResourceTitle, "Home | GitHub Resources");
        System.out.println(ResourceTitle);
    }

    public void SetDeveloperAPIButton() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.DeveloperAPIButton.click();
        Thread.sleep(3000);
        String DeveloperAPITitle = driver.getTitle();
        Assert.assertEquals(DeveloperAPITitle, "GitHub Developer | GitHub Developer Guide");
        System.out.println(DeveloperAPITitle);
    }

    public void SetPartnersButton() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.PartnerButton.click();
        Thread.sleep(3000);
        String PartnerTitle = driver.getTitle();
        Assert.assertEquals(PartnerTitle, "GitHub Partners | GitHub Partner Portal");
        System.out.println(PartnerTitle);
    }

    public void SetAtomButton() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.AtomButton.click();
        Thread.sleep(3000);
        String AtomTitle = driver.getTitle();
        Assert.assertEquals(AtomTitle, "Atom");
        System.out.println(AtomTitle);
    }

    public void SetElectronButton() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.ElectronButton.click();
        Thread.sleep(3000);
        String ElectronTitle = driver.getTitle();
        Assert.assertEquals(ElectronTitle, "Electron | Build cross platform desktop apps with JavaScript, HTML, and CSS.");
        System.out.println(ElectronTitle);
    }

    public void SetHelpButton() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.HelpButton.click();
        Thread.sleep(3000);
        String HelpTitle = driver.getTitle();
        Assert.assertEquals(HelpTitle, "GitHub Help");
        System.out.println(HelpTitle);
    }

    public void SetCommunityForumButton() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.CommunityForumButton.click();
        Thread.sleep(3000);
        String CommunityForumTitle = driver.getTitle();
        Assert.assertEquals(CommunityForumTitle, "Home - GitHub Community Forum");
        System.out.println(CommunityForumTitle);
    }

    public void SetTrainingButton() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.TrainingButton.click();
        Thread.sleep(3000);
        String TrainingTitle = driver.getTitle();
        Assert.assertEquals(TrainingTitle, "GitHub Professional Services | Engineering consulting and technical training to help at every stage of your business’ GitHub journey.");
        System.out.println(TrainingTitle);
    }

    public void SetStatusButton() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.StatusButton.click();
        Thread.sleep(3000);
        String StatusTitle = driver.getTitle();
        Assert.assertEquals(StatusTitle, "GitHub Status");
        System.out.println(StatusTitle);
    }

    public void SetContactGithubButton() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.ContactGithubButton.click();
        Thread.sleep(3000);
        String ContactGithubTitle = driver.getTitle();
        Assert.assertEquals(ContactGithubTitle, "Contact GitHub · GitHub");
        System.out.println(ContactGithubTitle);
    }

    public void SetAboutButton() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.AboutButton.click();
        Thread.sleep(3000);
        String AboutTitle = driver.getTitle();
        Assert.assertEquals(AboutTitle, "About · GitHub");
        System.out.println(AboutTitle);
    }

    public void SetBlogButton() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.BlogButton.click();
        Thread.sleep(3000);
        String BlogTitle = driver.getTitle();
        Assert.assertEquals(BlogTitle, "The GitHub Blog - Updates, ideas, and inspiration from GitHub to help developers build and design software.");
        System.out.println(BlogTitle);
    }

    public void SetCareersButton() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.CareersButton.click();
        Thread.sleep(3000);
        String CareersTitle = driver.getTitle();
        Assert.assertEquals(CareersTitle, "Careers · GitHub");
        System.out.println(CareersTitle);
    }

    public void SetPressButton() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.PressButton.click();
        Thread.sleep(3000);
        String PressTitle = driver.getTitle();
        Assert.assertEquals(PressTitle, "Press · GitHub");
        System.out.println(PressTitle);
    }

    public void SetShopButton() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.ShopButton.click();
        Thread.sleep(3000);
        String ShopTitle = driver.getTitle();
        Assert.assertEquals(ShopTitle, "GitHub Shop | Awesome GitHub T-shirts and other cool swag");
        System.out.println(ShopTitle);
    }

    public void SetUsernameText() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.UsernameText.isDisplayed();
        Assert.assertTrue(true);
    }

    public void SetEmailText() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.SignUpEmailBox.isDisplayed();
        Assert.assertTrue(true);
    }

    public void SetPasswordText() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.SignUpPasswordBox.isDisplayed();
        Assert.assertTrue(true);
    }

    public void SetRobotLogo() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.RobotLogo.isDisplayed();
        Assert.assertTrue(true);
    }

    public void SetContactSalesButton() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.ContactSalesButton.click();
        Thread.sleep(3000);
        String ContactSalesTitle = driver.getTitle();
        Assert.assertEquals(ContactSalesTitle, "Contact us - GitHub Enterprise");
        System.out.println(ContactSalesTitle);
    }

    public void SetOrStartAFreeTrialOfEnterpriseServerButton() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.OrStartAFreeTrialOfEnterpriseServerButton.click();
        Thread.sleep(3000);
        String OrStartAFreeTrialOfEnterpriseServerButtonTitle = driver.getTitle();
        Assert.assertEquals(OrStartAFreeTrialOfEnterpriseServerButtonTitle, "Trial request - GitHub Enterprise");
        System.out.println(OrStartAFreeTrialOfEnterpriseServerButtonTitle);
    }

    public void SetSignUpYourTeamButton() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.SignUpYourTeamButton.click();
        Thread.sleep(3000);
        String SignUpYourTeamButtonTitle = driver.getTitle();
        Assert.assertEquals(SignUpYourTeamButtonTitle, "Join GitHub · GitHub");
        System.out.println(SignUpYourTeamButtonTitle);
    }

    public void SetComparePlansButton() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.ComparePlansButton.click();
        Thread.sleep(3000);
        String ComparePlansButtonTitle = driver.getTitle();
        Assert.assertEquals(ComparePlansButtonTitle, "Pricing · Plans for every developer · GitHub");
        System.out.println(ComparePlansButtonTitle);
    }

    public void SetContactSalesForInfoButton() throws InterruptedException {
        this.driver.navigate().to(this.GithubUrl);
        this.ContactSalesForInfoButton.click();
        Thread.sleep(3000);
        String ContactSalesForInfoButtonTitle = driver.getTitle();
        Assert.assertEquals(ContactSalesForInfoButtonTitle, "Contact us - GitHub Enterprise");
        System.out.println(ContactSalesForInfoButtonTitle);
    }
}


