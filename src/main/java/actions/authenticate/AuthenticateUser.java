package actions.authenticate;

import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AuthenticateUser {
    private final String password = "secret_sauce";
    private String username;

    public AuthenticateUser(String username){
        this.username = username;
    }

    public Performable login(){
        return instrumented(Authenticate.class, this.username, this.password);
    }
}
