import base.CommonAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ServicePage extends CommonAPI {

    @FindBy (xpath = "//*[@id=\"search-results\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")
    private WebElement homeTab;

    @FindBy (xpath = "//*[@id=\"search-results\"]/div[1]/div/div/div[2]/div/ul/li[3]/a")
    private WebElement businessTab;

    @FindBy (xpath = "//*[@id=\"search-results\"]/div[1]/div/div/div[2]/div/ul/li[4]/a")
    private WebElement lifeTab;

    @FindBy (xpath = "//*[@id=\"rs-services-tabs-all\"]/div[1]/div[1]/div/div/a")
    private WebElement autoHomeInsurance;

    @FindBy (xpath = "//*[@id=\"costcoModal\"]/div/div/div[3]/div[1]/div[1]/button")
    private WebElement cancelBtn;

    @FindBy (id = "costcoModalBtn2")
    private WebElement viewExternalLink;

    @FindBy (xpath = "//*[@id=\"rs-services-tabs-all\"]/div[1]/div[2]/div/a[1]/img")
    private WebElement videoTab;

    @FindBy (xpath = "//*[@id=\"rs-intermedia-video-modal\"]/div/div/div[1]/button/span")
    private WebElement xButton;

    public void ClickHomeTab()throws Exception{
        this.homeTab.click();
        Thread.sleep(2000);
    }

    public void clickBusinessTab() throws Exception{
        this.businessTab.click();
        Thread.sleep(2000);
    }

    public void clickLifeTab() throws Exception{
        this.lifeTab.click();
        Thread.sleep(2000);
    }

    public void clickAutoHomeInsurance() throws Exception{
        this.autoHomeInsurance.click();
        Thread.sleep(2000);
    }

    public void clickCancelbtn() throws Exception{
        this.cancelBtn.click();
        Thread.sleep(2000);
    }

    public void clickViewExternalLink() throws Exception{
        this.viewExternalLink.click();
        Thread.sleep(2000);
    }

    public void clickVideoLink() throws Exception{
        this.videoTab.click();
        Thread.sleep(3000);
    }

    public void clickXBtn() throws Exception{
        this.xButton.click();
        Thread.sleep(3000);
    }
}