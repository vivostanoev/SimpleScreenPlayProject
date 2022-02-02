package actions.find_product;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import view.find_product.FindProductView;

public class SelectProduct implements Task {
    private String productName;

    public SelectProduct(String productName){
        this.productName = productName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FindProductView.PRODUCT_ITEM.of(this.productName))
        );
    }
}
