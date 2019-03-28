import base.CommonAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MembershipPage extends CommonAPI {

    @FindBy (css = ".join-costco")
    private WebElement whyBecomeMember;

    @FindBy(xpath = "//*[@id=\"search-results\"]/div[1]/div/table/tbody/tr[4]/th/a")
    private WebElement TermsAndConditions;

    @FindBy (xpath = "//*[@id=\"search-results\"]/div[1]/div/table/tbody/tr[1]/td[5]/a/input")
    private WebElement BusinessExecutive;

    @FindBy (xpath = "//*[@id=\"membership-application\"]/div[3]/div[2]/input")
    private WebElement cancel;

    @FindBy(id = "cart-d")
    private WebElement cartButton;

    @FindBy (xpath = "//*[@id=\"order-items-regular\"]/div/div/div[8]/div[1]/a")
    private WebElement removeButton;

    @FindBy(xpath = "//*[@id=\"costcoModal\"]/div/div/div[3]/div[1]/div[1]/button")
    WebElement removeBtn;

    public void clickWhyBecomeMember()throws Exception{
        this.whyBecomeMember.click();
        Thread.sleep(2000);
    }

    public void clickTermsAndConditions() throws Exception{
        this.TermsAndConditions.click();
        Thread.sleep(2000);
    }

    public void clickBusinessExecutive() throws Exception{
        this.BusinessExecutive.click();
        Thread.sleep(3000);
    }

    public void clickCancel()throws Exception{
        this.cancel.click();
        Thread.sleep(5000);
    }

    public void clickCartButton()throws Exception{
        this.cartButton.click();
        Thread.sleep(3000);
    }

    public void clickRemoveButton()throws Exception{
        this.removeButton.click();
        Thread.sleep(3000);
    }

    public void dismissAlert() throws Exception {
        removeBtn.click();
    }
}