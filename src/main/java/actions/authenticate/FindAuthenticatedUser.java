package actions.authenticate;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FindAuthenticatedUser {
    public static AuthenticateUser standardUser(){
         return new AuthenticateUser("standard_user");
    }

    public static AuthenticateUser lockedUser(){
        return new AuthenticateUser("locked_out_user");
    }

    public static AuthenticateUser specificUser(String username){
        return new AuthenticateUser(username);
    }
}
