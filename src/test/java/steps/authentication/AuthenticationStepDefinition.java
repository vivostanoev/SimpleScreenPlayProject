package steps.authentication;

import actions.navigation.PageNavigation;
import io.cucumber.java.en.And;
import questions.authenticate.TheAvailableAuthentication;
import actions.authenticate.FindAuthenticatedUser;
import actions.navigation.Navigate;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.find_product.TheAvailableProduct;
import view.authenticate.AuthenticateView;
import view.find_product.FindProductView;
import static actions.navigation.PageNavigation.MAIN_PAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static org.hamcrest.Matchers.*;

public class AuthenticationStepDefinition {

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that (.*) has decided to access his account$")
    public void that_Tracy_has_decided_to_access_his_account(String personaName) {
        theActorCalled(personaName).attemptsTo(
                Navigate.to(MAIN_PAGE)
        );
    }

    @When("^s?he try to login to the application$")
    public void she_try_to_login_to_the_application() {
        theActorInTheSpotlight().attemptsTo(
                FindAuthenticatedUser
                        .standardUser()
                        .login()
        );
    }

    @When("^s?he try to login using locked account$")
    public void she_try_to_login_using_locked_account() {
        theActorInTheSpotlight().attemptsTo(
                FindAuthenticatedUser
                        .lockedUser()
                        .login()
        );
    }

    @Then("^s?he should be able to access his account$")
    public void should_be_able_to_access_his_account() {
        theActorInTheSpotlight().should(
                seeThat("All Products are displayed", TheAvailableProduct.productsTitle(), isCurrentlyVisible())
        );
    }

    @Then("^s?he should not be able to access his account$")
    public void should_not_be_able_to_access_his_account() {
        theActorInTheSpotlight().should(
                seeThat("Locked user error", TheAvailableAuthentication.lockedUserType(), equalToIgnoringCase(AuthenticateView.LOGIN_ERROR_MESSAGE))
        );
    }
}
