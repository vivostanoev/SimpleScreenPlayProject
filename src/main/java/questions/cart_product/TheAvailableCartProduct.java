package questions.cart_product;

import net.serenitybdd.screenplay.Question;
import view.authenticate.AuthenticateView;
import view.cart_product.CartProductView;

public class TheAvailableCartProduct {

    public static Question<String> cartProductName() {
        return actor -> CartProductView.PRODUCT_NAME.resolveFor(actor).getText();
    }
}
