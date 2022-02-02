package view.detailed_product;

import net.serenitybdd.screenplay.targets.Target;

public class DetailedProductView {

    public static final Target PRODUCT_NAME = Target.the("products section")
            .locatedBy("//div[@class = 'inventory_details_name large_size']");

}
