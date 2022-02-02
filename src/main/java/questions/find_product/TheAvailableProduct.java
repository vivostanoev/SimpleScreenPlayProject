package questions.find_product;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Question;
import view.find_product.FindProductView;

public class TheAvailableProduct {
    public static Question<WebElementFacade> productsTitle() {
        return actor -> FindProductView.PRODUCTS_MENU.resolveFor(actor);
    }
}
