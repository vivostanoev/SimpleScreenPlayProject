package steps.find_product;

import actions.authenticate.FindAuthenticatedUser;
import actions.find_product.FindProduct;
import actions.navigation.Navigate;
import actions.navigation.PageNavigation;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.cart_product.TheAvailableCartProduct;
import questions.detailed_product.TheAvailableDetailedProduct;

import static actions.navigation.PageNavigation.MAIN_PAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class FindProductStepDefinition {

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that (.*) access his account$")
    public void access_his_account(String personaName) {
        theActorCalled(personaName).attemptsTo(
                Navigate.to(MAIN_PAGE),
                FindAuthenticatedUser
                        .standardUser()
                        .login()
        );
    }

    @When("^s?he select a product (.*)$")
    public void select_a_product(String productName) {
        theActorInTheSpotlight().attemptsTo(
                FindProduct
                        .select(productName)
        );
    }

    @When("^s?he add a product (.*) to cart$")
    public void he_add_a_product_sauce_labs_backpack_to_cart(String productName) {
        theActorInTheSpotlight().attemptsTo(
               FindProduct
                       .addToChar(productName)
        );
    }

    @And("^s?he should be able to navigate to cart")
    public void should_be_able_to_navigate_to_cart(){
        theActorInTheSpotlight().attemptsTo(
                Navigate.to(PageNavigation.CART)
        );
    }

    @Then("^s?he should be able see (.*) details$")
    public void should_be_able_see_details(String productName) {
        theActorInTheSpotlight().should(
                seeThat("Product detailed are visible", TheAvailableDetailedProduct.detailedProductName(), equalToIgnoringCase(productName))
        );
    }

    @Then("^s?he should be able to see (.*) in his char$")
    public void he_should_be_able_to_see_his_char(String productName) {
        theActorInTheSpotlight().should(
                seeThat("product is visible in chart", TheAvailableCartProduct.cartProductName(), equalToIgnoringCase(productName))
        );
    }
}