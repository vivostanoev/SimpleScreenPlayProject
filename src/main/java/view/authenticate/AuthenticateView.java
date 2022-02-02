package view.authenticate;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AuthenticateView {
    public static final String LOGIN_ERROR_MESSAGE = "Epic sadface: Sorry, this user has been locked out.";

    public static final Target USERNAME = Target.the("username field")
            .located(By.id("user-name"));

    public static final String usernameId = "user-name";

    public static final Target PASSWORD = Target.the("password field")
            .located(By.id("password"));

    public static final Target LOGIN_BUTTON = Target.the("login button")
            .located(By.id("login-button"));

    public static final Target ERROR_DIALOG = Target.the("error component")
            .locatedBy("//div[contains(@class, 'error-message-container error')]//h3");
}
