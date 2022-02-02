package view.cart_product;


import net.serenitybdd.screenplay.targets.Target;

public class CartProductView {

    public static Target PRODUCT_NAME = Target.the("Cart product name")
            .locatedBy("//div[@class='inventory_item_name']");


}
