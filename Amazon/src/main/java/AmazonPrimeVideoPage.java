import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class AmazonPrimeVideoPage extends CommonAPI {

    String AmazonPrimeVideoUrl = "https://www.amazon.com/gp/video/storefront/ref=atv_hm_hom_1_slct?contentType=home&filterId=OFFER_FILTER%3DALL";

    @FindBy(xpath = "//*[@id=\"Subnav\"]/div/div/div[1]/ul[1]/li[1]/a")
    private WebElement HomeButton;

    @FindBy(xpath = "  //*[@id=\"Subnav\"]/div/div/div[1]/ul[1]/li[2]/a")
    private WebElement OriginalsButton;

    @FindBy(xpath = "//*[@id=\"Subnav\"]/div/div/div[1]/ul[1]/li[3]/a")
    private WebElement TVShowButton;

    @FindBy(xpath = "//*[@id=\"Subnav\"]/div/div/div[1]/ul[1]/li[4]/a")
    private WebElement MoviesButton;

    @FindBy(xpath = "//*[@id=\"Subnav\"]/div/div/div[1]/ul[1]/li[5]/a")
    private WebElement KidsButton;



    public void navigateToAmazonPrimeVideo() {
        this.driver.navigate().to(this.AmazonPrimeVideoUrl);
    }

    public void AmazonPrimeVideoTitle() throws InterruptedException {
        this.driver.navigate().to(this.AmazonPrimeVideoUrl);
        Thread.sleep(1000);
        String VideoPageTitle = driver.getTitle();
        Assert.assertEquals(VideoPageTitle, "Amazon.com: Prime Video: Prime Video");
        System.out.println(VideoPageTitle);
    }

    public void SetHomeButton() throws InterruptedException {
        this.driver.navigate().to(this.AmazonPrimeVideoUrl);
        Thread.sleep(1000);
        String HomeoPageTitle = driver.getTitle();
        this.HomeButton.click();
        Assert.assertEquals(HomeoPageTitle, "Amazon.com: Prime Video: Prime Video");
        System.out.println(HomeoPageTitle);
    }

    public void SetOriginalButton() throws InterruptedException {
        this.driver.navigate().to(this.AmazonPrimeVideoUrl);
        String OriginalPageTitle = driver.getTitle();
        this.OriginalsButton.click();
        Thread.sleep(3000);
        Assert.assertEquals(OriginalPageTitle, "Amazon.com: Prime Video: Prime Video");
        System.out.println(OriginalPageTitle);
    }


    public void SetTVShowsButton() throws InterruptedException {
        this.driver.navigate().to(this.AmazonPrimeVideoUrl);
        String TVShowTitle = driver.getTitle();
        this.TVShowButton.click();
        Thread.sleep(3000);
        Assert.assertEquals(TVShowTitle, "Amazon.com: Prime Video: Prime Video");
        System.out.println(TVShowTitle);
    }

    public void SetMoviesButton() throws InterruptedException {
        this.driver.navigate().to(this.AmazonPrimeVideoUrl);
        String MoviesTitle = driver.getTitle();
        this.MoviesButton.click();
        Thread.sleep(5000);
        Assert.assertEquals(MoviesTitle, "Amazon.com: Prime Video: Prime Video");
        System.out.println(MoviesTitle);
    }

    public void SetKidsButton() throws InterruptedException {
        this.driver.navigate().to(this.AmazonPrimeVideoUrl);
        String KidsTitle = driver.getTitle();
        this.KidsButton.click();
        Thread.sleep(5000);
        Assert.assertEquals(KidsTitle, "Amazon.com: Prime Video: Prime Video");
        System.out.println(KidsTitle);
    }

}
