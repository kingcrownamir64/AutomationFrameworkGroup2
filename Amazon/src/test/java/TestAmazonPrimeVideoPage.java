import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAmazonPrimeVideoPage extends CommonAPI {


    AmazonPrimeVideoPage homepage;

    @BeforeClass
    public void initialize() throws Exception {
        this.homepage = PageFactory.initElements(this.driver, AmazonPrimeVideoPage.class);
        this.homepage.navigateToAmazonPrimeVideo();
        Thread.sleep(3000);
    }

    @Test
    public void TestAmazonPrimeVideoTitle() throws Exception {
        this.homepage.AmazonPrimeVideoTitle();
    }

    @Test
    public void TestHomeButton() throws Exception {
        this.homepage.SetHomeButton();
    }

    @Test
    public void TestOriginalsButton() throws Exception {
        this.homepage.SetOriginalButton();
    }

    @Test
    public void TestTVShowsButton() throws Exception {
        this.homepage.SetTVShowsButton();
    }

    @Test
    public void TestMoviesButton() throws Exception {
        this.homepage.SetMoviesButton();
    }

    @Test
    public void TestKidsButton() throws Exception {
        this.homepage.SetKidsButton();
    }

}
