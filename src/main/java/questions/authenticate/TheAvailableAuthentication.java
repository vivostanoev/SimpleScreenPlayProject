package questions.authenticate;

import net.serenitybdd.screenplay.Question;
import view.authenticate.AuthenticateView;

public class TheAvailableAuthentication {

    public static Question<String> lockedUserType() {
        return actor -> AuthenticateView.ERROR_DIALOG.resolveFor(actor).getText();
    }
}
