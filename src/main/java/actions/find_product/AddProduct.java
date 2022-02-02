package actions.find_product;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import view.find_product.FindProductView;

public class AddProduct implements Task {
    private String productName;

    public AddProduct(String productName){
        this.productName = productName;
    }

    @Override
    @Step("Add Product to char")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FindProductView.PRODUCT_CHAR_BUTTON.of(this.productName))
        );
    }
}
