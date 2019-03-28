import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAmazonPrimeMusicPage extends CommonAPI {


    AmazonPrimeMusicPage homepage;

    @BeforeClass
    public void initialize() throws Exception {
        this.homepage = PageFactory.initElements(this.driver, AmazonPrimeMusicPage.class);
        this.homepage.navigateToAmazonPrimeVideo();
        Thread.sleep(3000);
    }

    @Test
    public void TestAmazonPrimeMusicTitle() throws Exception {
        this.homepage.AmazonPrimeMusicTitle();
    }
    @Test
    public void TestAmazonMusicUnlimitedButton() throws Exception {
        this.homepage.SetAmazonMusicUnlimitedButton();
    }

    @Test
    public void TestPrimeMusicButton() throws Exception {
        this.homepage.SetPrimeMusicButton();
    }

    @Test
    public void TestCDsAndVinylButton() throws Exception {
        this.homepage.SetCDsAndVinylButton();
    }

    @Test
    public void TestDownloadStoreButton() throws Exception {
        this.homepage.SetDownloadStoreButton();
    }

    @Test
    public void TestOpenWebPlayerButton() throws Exception {
        this.homepage.SetOpenWebPlayerButton();
    }

    @Test
    public void TestMP3CartButton() throws Exception {
        this.homepage.SetMP3CartButton();
    }

    @Test
    public void TestSettingButton() throws Exception {
        this.homepage.SetSettingButton();
    }

    @Test
    public void TestThirtyDayFreeTrialButton() throws Exception {
        this.homepage.SetThirtyDayFreeTrialButton();
    }

    @Test
    public void TestTryPrimeButton() throws Exception {
        this.homepage.SetTryPrimeButton();
    }

    @Test
    public void TestAmazonLogoExists() throws Exception {
        this.homepage.SetAmazonLogo();
    }

    @Test
    public void TestAmazonMusicLogoExists() throws Exception {
        this.homepage.SetAmazonMusicLogo();
    }

    @Test
    public void TestSearchLogo() throws Exception {
        this.homepage.SetSearchLogo();
    }

    @Test
    public void TestBottomAmazonLogo() throws Exception {
        this.homepage.SetBottomAmazonLogo();
    }

    @Test
    public void TestTopBannerExists() throws Exception {
        this.homepage.SetTopBanner();
    }

}