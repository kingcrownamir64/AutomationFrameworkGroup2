import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonAPI {

    @FindBy(id = "ap_email")
    private WebElement EmailBox;

    @FindBy(id = "ap_password")
    private WebElement PwdBox;

    @FindBy(id = "signInSubmit")
    private WebElement SignInButton;

    @FindBy(id = "createAccountSubmit")
    private WebElement CreateAccountButton;


    public void enterEmail(String text) {
        this.EmailBox.sendKeys(text);
    }

    public void enterPwd(String text) {
        this.PwdBox.sendKeys(text);
    }

    public void SignIn() {
        this.SignInButton.click();
    }

    public void CreateAccount() {
        this.CreateAccountButton.click();
    }
}