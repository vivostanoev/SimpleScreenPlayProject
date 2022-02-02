package questions.detailed_product;

import net.serenitybdd.screenplay.Question;
import view.authenticate.AuthenticateView;
import view.detailed_product.DetailedProductView;

public class TheAvailableDetailedProduct {

    public static Question<String> detailedProductName() {
        return actor -> DetailedProductView.PRODUCT_NAME.resolveFor(actor).getText();
    }

}
