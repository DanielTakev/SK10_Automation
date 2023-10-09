package lecture16.examples.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProfilePage extends BasePage {
    @FindBy(css = ".profile-user-settings > h2")
    WebElement usernameTitle;

    public ProfilePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getUsernameTitle() {
        wait.until(ExpectedConditions.visibilityOf(usernameTitle));
        return usernameTitle.getText();
    }
}
