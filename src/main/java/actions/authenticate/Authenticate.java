package actions.authenticate;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import view.authenticate.AuthenticateView;


public class Authenticate implements Task {
    private String username;
    private String password;

    public Authenticate(String username, String password){
        this.username = username;
        this.password = password;
    }


    @Override
    @Step("{0} login to application")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Enter.theValue(this.username).into(AuthenticateView.USERNAME),
        Enter.keyValues(this.password).into(AuthenticateView.PASSWORD),
        Click.on(AuthenticateView.LOGIN_BUTTON)
        );
    }
}
