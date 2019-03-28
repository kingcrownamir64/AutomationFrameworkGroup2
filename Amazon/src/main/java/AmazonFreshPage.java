import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AmazonFreshPage extends CommonAPI {


    @FindBy(xpath = "//*[@id=\"postLeft\"]/div[5]/ul[2]/li[3]/a")
    private WebElement DairyButton;

    @FindBy(xpath = "//*[@id=\"postLeft\"]/div[5]/ul[2]/li[6]/a")
    private WebElement DeliButton;

    @FindBy(xpath = "//*[@id=\"postLeft\"]/div[5]/ul[2]/li[5]/a")
    private WebElement BakeryButton;

    @FindBy(xpath = "//*[@id=\"postLeft\"]/div[5]/ul[1]/li[1]/a")
    private WebElement FreshFruitButton;

    @FindBy(xpath = "//*[@id=\"postLeft\"]/div[1]/ul/li[2]/a")
    private WebElement ContactFreshButton;

    @FindBy(xpath = "//*[@id=\"postLeft\"]/div[7]/ul[2]/li[1]/a")
    private WebElement BeveragesButton;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[2]")
    private WebElement PastPurchasesButton;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[3]")
    private WebElement FreshDealsButton;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[4]")
    private WebElement GroceriesButton;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[5]")
    private WebElement HouseholdHealthBeautyButton;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[6]")
    private WebElement LocalMarketButton;



    public void SetDairyButton() { this.DairyButton.click();
    }

    public void SetDeliButton() { this.DeliButton.click();
    }

    public void SetBakeryButton() { this.BakeryButton.click();
    }

    public void SetFreshFruitButton() { this.FreshFruitButton.click();
    }

    public void SetContactFreshButton() { this.ContactFreshButton.click();
    }

    public void SetBeveragesButton() { this.BeveragesButton.click();
    }

    public void SetPastPurchasesButton() { this.PastPurchasesButton.click();
    }

    public void SetFreshDealsButton() { this.FreshDealsButton.click();
    }

    public void SetGroceriesButton() { this.GroceriesButton.click();
    }

    public void SetHouseholdHealthBeautyButton() { this.HouseholdHealthBeautyButton.click();
    }

    public void SetLocalMarketButton() { this.LocalMarketButton.click();
    }
}