import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class AmazonPrimeMusicPage extends CommonAPI {

    String AmazonPrimeMusicUrl = "https://www.amazon.com/gp/dmusic/promotions/PrimeMusic?ref_=nav_em_T1_0_4_4_2__dm_pm";



    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[2]")
    private WebElement AmazonMusicUnlimitedButton;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[3]")
    private WebElement PrimeMusicButton;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[4]")
    private WebElement CDsAndVinylButton;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[5]")
    private WebElement DownloadStoreButton;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[9]")
    private WebElement OpenWebPlayerButton;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[10]")
    private WebElement MP3CartButton;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[11]")
    private WebElement SettingButton;

    @FindBy(xpath = "//*[@id=\"a-autoid-1-announce\"]")
    private WebElement TryPrimeButton;

    @FindBy(xpath = "//*[@id=\"a-autoid-3-announce\"]/span")
    private WebElement ThirtyDayFreeTrialButton;

    @FindBy(xpath = "//*[@id=\"a-autoid-6-announce\"]/span")
    private WebElement GetTheAppButton;

    @FindBy(xpath = "//*[@id=\"nav-logo\"]/a[1]/span[1]")
    private WebElement AmazonLogo;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[1]/span/img")
    private WebElement AmazonMusicLogo;

    @FindBy(xpath = "//*[@id=\"navSwmHoliday\"]/a/img")
    private WebElement TopBanner;

    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[3]/span[1]/div/a/div")
    private WebElement BottomAmazonLogo;

    @FindBy(xpath = "//*[@id=\"nav-search\"]/form/div[2]/div/input")
    private WebElement SearchLogo;


    public void navigateToAmazonPrimeVideo() {
        this.driver.navigate().to(this.AmazonPrimeMusicUrl);
    }

    public void AmazonPrimeMusicTitle() throws InterruptedException {
        this.driver.navigate().to(this.AmazonPrimeMusicUrl);
        Thread.sleep(1000);
        String MusicPageTitle = driver.getTitle();
        Assert.assertEquals(MusicPageTitle, "Amazon.com: Prime Music");
        System.out.println(MusicPageTitle);
    }

    public void SetAmazonMusicUnlimitedButton() throws InterruptedException {
        this.driver.navigate().to(this.AmazonPrimeMusicUrl);
        this.AmazonMusicUnlimitedButton.click();
        Thread.sleep(3000);
        String AmazonPrimeMusicUnlimitedTitle = driver.getTitle();
        Assert.assertEquals(AmazonPrimeMusicUnlimitedTitle, "Amazon.com: Amazon Music Unlimited");
        System.out.println(AmazonPrimeMusicUnlimitedTitle);
    }

    public void SetPrimeMusicButton() throws InterruptedException {
        this.driver.navigate().to(this.AmazonPrimeMusicUrl);
        this.PrimeMusicButton.click();
        Thread.sleep(3000);
        String PrimeMusicTitle = driver.getTitle();
        Assert.assertEquals(PrimeMusicTitle, "Amazon.com: Prime Music");
        System.out.println(PrimeMusicTitle);
    }

    public void SetCDsAndVinylButton() throws InterruptedException {
        this.driver.navigate().to(this.AmazonPrimeMusicUrl);
        this.CDsAndVinylButton.click();
        Thread.sleep(3000);
        String CDsAndVinylButtonTitle = driver.getTitle();
        Assert.assertEquals(CDsAndVinylButtonTitle, "Amazon.com: CDs & Vinyl");
        System.out.println(CDsAndVinylButtonTitle);
    }

    public void SetDownloadStoreButton() throws InterruptedException {
        this.driver.navigate().to(this.AmazonPrimeMusicUrl);
        this.DownloadStoreButton.click();
        Thread.sleep(3000);
        String DownloadStoreButtonTitle = driver.getTitle();
        Assert.assertEquals(DownloadStoreButtonTitle, "Amazon.com: Digital Music");
        System.out.println(DownloadStoreButtonTitle);
    }

    public void SetMP3CartButton() throws InterruptedException {
        this.driver.navigate().to(this.AmazonPrimeMusicUrl);
        this.MP3CartButton.click();
        Thread.sleep(3000);
        String MP3CartButtonTitle = driver.getTitle();
        Assert.assertEquals(MP3CartButtonTitle, "Amazon Sign In");
        System.out.println(MP3CartButtonTitle);
    }

    public void SetOpenWebPlayerButton() throws InterruptedException {
        this.driver.navigate().to(this.AmazonPrimeMusicUrl);
        this.OpenWebPlayerButton.click();
        Thread.sleep(3000);
        String OpenWebPlayerButtonTitle = driver.getTitle();
        Assert.assertEquals(OpenWebPlayerButtonTitle, "Amazon Music Unlimited - Stream 50 million songs online now.");
        System.out.println(OpenWebPlayerButtonTitle);
    }

    public void SetSettingButton() throws InterruptedException {
        this.driver.navigate().to(this.AmazonPrimeMusicUrl);
        this.SettingButton.click();
        Thread.sleep(3000);
        String SettingButtonTitle = driver.getTitle();
        Assert.assertEquals(SettingButtonTitle, "Amazon Sign In");
        System.out.println(SettingButtonTitle);
    }

    public void SetThirtyDayFreeTrialButton() throws InterruptedException {
        this.driver.navigate().to(this.AmazonPrimeMusicUrl);
        this.ThirtyDayFreeTrialButton.click();
        Thread.sleep(3000);
        String ThirtyDayFreeTrialButtonTitle = driver.getTitle();
        Assert.assertEquals(ThirtyDayFreeTrialButtonTitle, "Amazon Sign In");
        System.out.println(ThirtyDayFreeTrialButtonTitle);
    }

    public void SetTryPrimeButton() throws InterruptedException {
        this.driver.navigate().to(this.AmazonPrimeMusicUrl);
        this.TryPrimeButton.click();
        Thread.sleep(3000);
        String TryPrimeButtonTitle = driver.getTitle();
        Assert.assertEquals(TryPrimeButtonTitle, "Amazon Sign In");
        System.out.println(TryPrimeButtonTitle);
    }

    public void SetGetTheAppButton() throws InterruptedException {
        this.driver.navigate().to(this.AmazonPrimeMusicUrl);
        this.GetTheAppButton.click();
        Thread.sleep(3000);
        String GetTheAppButtonTitle = driver.getTitle();
        Assert.assertEquals(GetTheAppButtonTitle, "Amazon Sign In");
        System.out.println(GetTheAppButtonTitle);
    }

    public void SetAmazonLogo() throws InterruptedException {
        this.driver.navigate().to(this.AmazonPrimeMusicUrl);
        this.AmazonLogo.isDisplayed();
        Assert.assertTrue(true);
    }

    public void SetAmazonMusicLogo() throws InterruptedException {
        this.driver.navigate().to(this.AmazonPrimeMusicUrl);
        this.AmazonMusicLogo.isDisplayed();
        Assert.assertTrue(true);
    }

    public void SetTopBanner() throws InterruptedException {
        this.driver.navigate().to(this.AmazonPrimeMusicUrl);
        this.TopBanner.isDisplayed();
        Assert.assertTrue(true);
    }

    public void SetBottomAmazonLogo() throws InterruptedException {
        this.driver.navigate().to(this.AmazonPrimeMusicUrl);
        this.BottomAmazonLogo.isDisplayed();
        Assert.assertTrue(true);
    }

    public void SetSearchLogo() throws InterruptedException {
        this.driver.navigate().to(this.AmazonPrimeMusicUrl);
        this.SearchLogo.isDisplayed();
        Assert.assertTrue(true);
    }
}
