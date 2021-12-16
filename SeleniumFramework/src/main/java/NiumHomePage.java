import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NiumHomePage extends Utilities {
    public WebDriver driver;
    public NiumHomePage(){
        Utilities.setDriver();
        PageFactory.initElements(this.driver, NiumHomePage.class);
    }

    @FindBy(xpath = "")
    private WebElement homeIcon;


    public boolean selectHomePage(){
        return homeIcon.isDisplayed();
    }

}
