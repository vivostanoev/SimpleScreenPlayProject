package view.find_product;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FindProductView {
    public static Target PRODUCTS_MENU = Target.the("products section")
            .locatedBy("//span[@class = 'title' and text() = 'Products']");

    public static final Target PRODUCT_ITEM = Target.the("product item - '{0}")
            .locatedBy("//div[text() = '{0}']");

    public static final Target PRODUCT_CHAR_BUTTON = Target.the("product item - '{0}")
            .locatedBy("//div[text() = '{0}']//ancestor::div[contains(@class, 'inventory_item_description')]//button[@class = 'btn btn_primary btn_small btn_inventory']");
}
