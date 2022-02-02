package actions.find_product;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FindProduct {

    public static SelectProduct select(String productName){
        return instrumented(SelectProduct.class, productName);
    }

    public static AddProduct addToChar(String productName){
        return instrumented(AddProduct.class, productName);
    }
}
